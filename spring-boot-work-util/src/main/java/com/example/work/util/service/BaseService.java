package com.example.work.util.service;

import com.example.util.HumpUtil;
import com.example.util.MySqlToJavaUtil;
import com.example.util.StringUtil;
import com.example.work.util.dao.TableDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @author gao peng
 * @date 2018/9/28 10:15
 */
public class BaseService {
  @Autowired
  private TableDao tableDao;

  public int spaceInitNum = 2;

  /**
   * 根据表明，读取表结构信息
   *
   * @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
   * @param: [tableName]
   * @author gao peng
   * @date 2018/9/28 14:01
   */
  public List<Map<String, Object>> getColoumByTableName(String tableName) {
    return tableDao.getTableInfo(tableName);
  }

  /**
   * 数据库字段命名规则修改为JAVA驼峰格式
   *
   * @return java.lang.String
   * @param: [columnName]
   * @author gao peng
   * @date 2018/9/28 14:01
   */
  public String getJavaFieldName(String columnName) {
    String humpColumnName = HumpUtil.underlineToHump(columnName);

    return StringUtil.upperFirstLetter(humpColumnName);
  }

  /**
   * 转换成JAVA的类型，调用工具工具方法
   *
   * @return java.lang.String
   * @param: [dataType]
   * @author gao peng
   * @date 2018/9/28 14:01
   */
  public String getJavaFieldTytpe(String dataType) {
    return MySqlToJavaUtil.tranMysqlTOJavaType(dataType);
  }

  /**
   * 组装字符串，并换行
   *
   * @return void
   * @param: [sb, str]
   * @author gao peng
   * @date 2018/9/28 14:00
   */
  public void writeLine(StringBuffer sb, String str) {
    sb.append(str);
    StringUtil.enter(sb);
  }

  /**
   * 判断是否为主键（目前根据名字判断），后续可以优化，通过数据库读取主键标识
   *
   * @return boolean
   * @param: [map]
   * @author gao peng
   * @date 2018/9/28 14:00
   */
  public boolean checkPrimary(Map map) {
    String tableName = (String) map.get("COLUMN_NAME");
    if (tableName.equals("id")) {
      return true;
    }
    return false;
  }

}
