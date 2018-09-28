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
 * @date 2018/9/27 14:38
 */
@Service
public class TableService extends BaseService {
  @Autowired
  private QUIDService quidService;

  public String generatorJDBCTemplate(String tableName) {
    StringBuffer sb = new StringBuffer();
    sb.append(generatorJDBCMapper(tableName));
    sb.append(quidService.generatorBatchInsert(tableName));
    sb.append(quidService.generatorInsert(tableName));
    sb.append(quidService.generatorQueryById(tableName));
    sb.append(quidService.generatorQueryPage(tableName));

    return sb.toString();
  }

  /**
   * 生成JDBCTemplate mapper方法
   *
   * @return void
   * @param: [tableName]
   * @author gao peng
   * @date 2018/9/27 17:50
   */
  public String generatorJDBCMapper(String tableName) {
    StringBuffer mapSB = new StringBuffer();
    StringUtil.enter(mapSB);

    List<Map<String, Object>> list = getColoumByTableName(tableName);

    String mapperName = MySqlToJavaUtil.tranMySQLTableToJavaBean(tableName);

    StringUtil.splace(mapSB, spaceInitNum);
    mapSB.append("private class " + mapperName + "RowMapper implements RowMapper<" + mapperName + "Bean> {");
    StringUtil.enter(mapSB);

    StringUtil.splace(mapSB, spaceInitNum);
    mapSB.append("@Override");
    StringUtil.enter(mapSB);

    StringUtil.splace(mapSB, spaceInitNum);
    mapSB.append("public " + mapperName + "Bean mapRow(ResultSet rs, int arg1) throws SQLException {");
    StringUtil.enter(mapSB);

    StringUtil.splace(mapSB, spaceInitNum + 2);
    mapSB.append("private class " + mapperName + "RowMapper implements RowMapper<" + mapperName + "Bean> {");
    StringUtil.enter(mapSB);

    for (Map map : list) {

      StringUtil.splace(mapSB, spaceInitNum + 4);

      String bean = genBeanName(map);

      mapSB.append(bean);
      StringUtil.enter(mapSB);
    }

    StringUtil.splace(mapSB, spaceInitNum + 4);
    mapSB.append("return bean;");

    StringUtil.enter(mapSB);
    StringUtil.splace(mapSB, spaceInitNum + 2);
    mapSB.append("}");

    StringUtil.enter(mapSB);
    StringUtil.splace(mapSB, spaceInitNum);
    mapSB.append("}");

    return mapSB.toString();
  }


  private String genBeanName(Map map) {
    String columnName = (String) map.get("COLUMN_NAME");
    String dataType = (String) map.get("DATA_TYPE");

    String fieldType = getJavaFieldTytpe(dataType);
    String fileName = getJavaFieldName(columnName);

    String param1 = "rs.get" + fieldType + "(\"" + columnName + "\")";

    return "bean.set" + fileName + "(" + param1 + ");";
  }


}
