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
public class TableService {
  @Autowired
  private TableDao tableDao;

  public void generatorJDBCMapper(String tableName) {
    StringBuffer mapSB = new StringBuffer();

    List<Map<String, Object>> list = tableDao.getTableInfo(tableName);

    String mapperName = MySqlToJavaUtil.tranMySQLTableToJavaBean(tableName);

    mapSB.append("private class " + mapperName + "RowMapper implements RowMapper<" + mapperName + "Bean> {");
    StringUtil.enter(mapSB);

    StringUtil.splace(mapSB, 2);
    mapSB.append("@Override");
    StringUtil.enter(mapSB);

    StringUtil.splace(mapSB, 2);
    mapSB.append("public " + mapperName + "Bean mapRow(ResultSet rs, int arg1) throws SQLException {");
    StringUtil.enter(mapSB);

    StringUtil.splace(mapSB, 4);
    mapSB.append("private class " + mapperName + "RowMapper implements RowMapper<" + mapperName + "Bean> {");
    StringUtil.enter(mapSB);

    for (Map map : list) {

      StringUtil.splace(mapSB, 6);

      String bean = genBeanName(map);

      mapSB.append(bean);
      StringUtil.enter(mapSB);
    }

    StringUtil.splace(mapSB, 6);
    mapSB.append("return bean;");

    StringUtil.enter(mapSB);
    StringUtil.splace(mapSB, 4);
    mapSB.append("}");

    StringUtil.enter(mapSB);
    mapSB.append("}");

    System.out.println(mapSB.toString());
  }


  private String genBeanName(Map map) {
    String columnName = (String) map.get("COLUMN_NAME");
    String dataType = (String) map.get("DATA_TYPE");

    String tableType = MySqlToJavaUtil.tranMysqlTOJavaType(dataType);

    String param1 = "rs.get" + tableType + "(\"" + columnName + "\")";

    String humpColumnName = HumpUtil.underlineToHump(columnName);

    humpColumnName = StringUtil.upperFirstLetter(humpColumnName);

    return "bean.set" + humpColumnName + "(" + param1 + ");";
  }


}
