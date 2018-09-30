package com.example.work.util.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 数据库中字段，映射成java BEAN
 *
 * @author gao peng
 * @date 2018/9/30 11:00
 */
@Service
public class GeneratorBeanService extends BaseService {

  public String handle(String tableName) {

    List<Map<String, Object>> list = getColoumByTableName(tableName);

    StringBuffer sb = new StringBuffer();

    for (Map<String, Object> map : list) {
      String columnName = (String) map.get("COLUMN_NAME");
      String dataType = (String) map.get("DATA_TYPE");
      String comment = (String) map.get("COLUMN_COMMENT");

      String type = getJavaFieldTytpe(dataType);

      if (type.equals("Int")) {
        type = "int";
      } else if(type.equals("Timestamp")){
        type = "Date";
      }

      sb.append("/**\n\r");
      sb.append(" * " + comment + "\n\r");
      sb.append(" */\n\r");
      sb.append("private " + type + " " + getJavaFieldNameFirstLower(columnName) + "; \n\r");
    }

    return sb.toString();
  }
}
