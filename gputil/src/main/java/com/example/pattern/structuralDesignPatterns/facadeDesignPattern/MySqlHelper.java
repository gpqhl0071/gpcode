package com.example.pattern.structuralDesignPatterns.facadeDesignPattern;

import java.sql.Connection;

/**
 * @author gao peng
 * @date 2019/8/6 9:53
 */
public class MySqlHelper {
  public static Connection getMySqlDBConnection() {
    //get MySql DB connection using connection parameters
    return null;
  }

  public void generateMySqlPDFReport(String tableName, Connection con) {
    //get data from table and generate pdf report
  }

  public void generateMySqlHTMLReport(String tableName, Connection con) {
    //get data from table and generate pdf report
  }
}
