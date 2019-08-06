package com.example.pattern.structuralDesignPatterns.facadeDesignPattern;

import java.sql.Connection;

/**
 * @author gao peng
 * @date 2019/8/6 9:54
 */
public class OracleHelper {
  public static Connection getOracleDBConnection() {
    //get Oracle DB connection using connection parameters
    return null;
  }

  public void generateOraclePDFReport(String tableName, Connection con) {
    //get data from table and generate pdf report
  }

  public void generateOracleHTMLReport(String tableName, Connection con) {
    //get data from table and generate pdf report
  }
}
