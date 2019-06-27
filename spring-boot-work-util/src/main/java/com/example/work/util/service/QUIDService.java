package com.example.work.util.service;

import com.example.util.HumpUtil;
import com.example.util.MySqlToJavaUtil;
import com.example.util.StringUtil;
import com.example.work.util.dao.TableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author gao peng
 * @date 2018/9/28 10:13
 */
@Service
public class QUIDService extends BaseService {

  /**
   * 插入模板方法
   *
   * @return void
   * @param: [tableName]
   * @author gao peng
   * @date 2018/9/28 14:05
   */
  public String generatorInsert(String tableName) {

    StringBuffer sb = new StringBuffer();
    writeLine(sb, "");

    List<Map<String, Object>> list = getColoumByTableName(tableName);

    String mapperName = MySqlToJavaUtil.tranMySQLTableToJavaBean(tableName);


    StringUtil.splace(sb, spaceInitNum);
    writeLine(sb, "public " + mapperName + "Bean save(final " + mapperName + "Bean bean) {");

    StringUtil.splace(sb, spaceInitNum + 2);
    writeLine(sb, "KeyHolder keyHolder = new GeneratedKeyHolder();");
    StringUtil.splace(sb, spaceInitNum + 2);
    writeLine(sb, "jt.update(new PreparedStatementCreator() {");

    StringUtil.splace(sb, spaceInitNum + 4);
    writeLine(sb, "@Override");

    StringUtil.splace(sb, spaceInitNum + 4);
    writeLine(sb, "public PreparedStatement createPreparedStatement(java.sql.Connection paramConnection) throws SQLException {");

    StringUtil.splace(sb, spaceInitNum + 8);
    insertSQL(tableName, sb, list);

    StringUtil.splace(sb, spaceInitNum + 8);
    writeLine(sb, "PreparedStatement ps = paramConnection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);");

    StringUtil.splace(sb, spaceInitNum + 8);
    writeLine(sb, "int index = 1;");

    for (Map map : list) {
      StringUtil.splace(sb, spaceInitNum + 8);

      getBeanName(sb, map, "bean");
    }

    StringUtil.splace(sb, spaceInitNum + 8);
    writeLine(sb, "return ps;");

    StringUtil.splace(sb, spaceInitNum + 6);
    writeLine(sb, "}");

    StringUtil.splace(sb, spaceInitNum + 4);
    writeLine(sb, "}, keyHolder);");

    StringUtil.splace(sb, spaceInitNum + 2);
    writeLine(sb, "bean.setId(keyHolder.getKey().intValue());");

    StringUtil.splace(sb, spaceInitNum + 2);
    writeLine(sb, "return bean;");

    StringUtil.splace(sb, spaceInitNum);
    writeLine(sb, "}");

    return sb.toString();
  }

  /**
   * 批量插入模板方法
   *
   * @return void
   * @param: [tableName]
   * @author gao peng
   * @date 2018/9/28 14:06
   */
  public String generatorBatchInsert(String tableName) {

    StringBuffer sb = new StringBuffer();
    writeLine(sb, "");

    List<Map<String, Object>> list = getColoumByTableName(tableName);

    String mapperName = MySqlToJavaUtil.tranMySQLTableToJavaBean(tableName);

    StringUtil.splace(sb, spaceInitNum);
    writeLine(sb, "public void batchSave(final List<" + mapperName + "Bean> list) {");

    StringUtil.splace(sb, spaceInitNum + 2);
    insertSQL(tableName, sb, list);

    StringUtil.splace(sb, spaceInitNum + 2);
    writeLine(sb, "jt.batchUpdate(sql, new BatchPreparedStatementSetter() {");

    StringUtil.splace(sb, spaceInitNum + 4);
    writeLine(sb, "public void setValues(PreparedStatement ps, int i) throws SQLException {");

    StringUtil.splace(sb, spaceInitNum + 6);
    writeLine(sb, "int index = 1;");

    for (Map map : list) {
      if (checkPrimary(map)) {
        continue;
      }

      StringUtil.splace(sb, spaceInitNum + 6);

      getBeanName(sb, map, "list.get(i)");
    }
    StringUtil.splace(sb, spaceInitNum + 4);
    writeLine(sb, "}");

    StringUtil.splace(sb, spaceInitNum + 4);
    writeLine(sb, "public int getBatchSize() {");
    StringUtil.splace(sb, spaceInitNum + 6);
    writeLine(sb, "return list.size();");
    StringUtil.splace(sb, spaceInitNum + 4);
    writeLine(sb, "}");

    StringUtil.splace(sb, spaceInitNum + 2);
    writeLine(sb, "});");

    StringUtil.splace(sb, spaceInitNum);
    writeLine(sb, "}");

    return sb.toString();
  }

  public String generatorQueryById(String tableName) {

    StringBuffer sb = new StringBuffer();
    writeLine(sb, "");

    List<Map<String, Object>> list = getColoumByTableName(tableName);

    String beanName = MySqlToJavaUtil.tranMySQLTableToJavaBean(tableName);

    StringUtil.splace(sb, spaceInitNum);
    writeLine(sb, "public " + beanName + "Bean queryById(int id) {");

    StringUtil.splace(sb, spaceInitNum + 2);
    writeLine(sb, "String sql = \"select * from " + tableName + " where id = ? \";");

    StringUtil.splace(sb, spaceInitNum + 2);
    writeLine(sb, "return jt.queryForObject(sql, new Object[]{id}, new " + beanName + "RowMapper());");


    StringUtil.splace(sb, spaceInitNum);
    writeLine(sb, "}");

    return sb.toString();
  }

  public String generatorQueryPage(String tableName) {

    StringBuffer sb = new StringBuffer();
    writeLine(sb, "");

    List<Map<String, Object>> list = getColoumByTableName(tableName);

    String beanName = MySqlToJavaUtil.tranMySQLTableToJavaBean(tableName);

    StringUtil.splace(sb, spaceInitNum);
    writeLine(sb, "public Page queryPage(int pageNo, int pageSize) {");

    StringUtil.splace(sb, spaceInitNum + 2);
    writeLine(sb, "String sql = \"select * from " + tableName + " order by id desc \";");

    StringUtil.splace(sb, spaceInitNum + 2);
    writeLine(sb, "List<Object> paramList = new ArrayList<Object>();");

    StringUtil.splace(sb, spaceInitNum + 2);
    writeLine(sb, "return this.queryForPage(sql.toString(), paramList.toArray(), pageNo, pageSize);");

    StringUtil.splace(sb, spaceInitNum);
    writeLine(sb, "}");

    return sb.toString();
  }

  private void getBeanName(StringBuffer sb, Map map, String param1) {
    String columnName = (String) map.get("COLUMN_NAME");
    String dataType = (String) map.get("DATA_TYPE");

    String fieldType = getJavaFieldTytpe(dataType);
    String fieldName = getJavaFieldName(columnName);
    if(fieldName.equals("Id")){
      return;
    }

    if (fieldType.equals("Timestamp")) {
      String par1 = "new Timestamp(" + param1 + ".get" + fieldName + "().getTime())";
      writeLine(sb, "ps.set" + fieldType + "(index++, " + par1 + ");");
    } else {
      writeLine(sb, "ps.set" + fieldType + "(index++, " + param1 + ".get" + fieldName + "());");
    }
  }

  private void insertSQL(String tableName, StringBuffer sb, List<Map<String, Object>> list) {
    writeLine(sb, "String sql = \" insert into "
      + tableName
      + " ("
      + getNames(list)
      + ") values ("
      + getValues(list)
      + ") \"; ");
  }

  private String getNames(List<Map<String, Object>> list) {
    StringBuffer sb = new StringBuffer();
    for (Map map : list) {

      String columnName = (String) map.get("COLUMN_NAME");
      if (columnName.equals("id")) {
        continue;
      }
      sb.append("`");
      sb.append(columnName);
      sb.append("`,");
    }
    return sb.toString().substring(0, sb.toString().length() - 1);
  }

  private String getValues(List<Map<String, Object>> list) {
    StringBuffer sb = new StringBuffer();
    for (Map map : list) {
      sb.append("?");
      sb.append(",");
    }
    return sb.toString().substring(0, sb.toString().length() - 3);
  }

}
