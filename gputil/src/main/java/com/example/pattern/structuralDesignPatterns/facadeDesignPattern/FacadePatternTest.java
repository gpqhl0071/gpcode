package com.example.pattern.structuralDesignPatterns.facadeDesignPattern;

import java.sql.Connection;

/**
 * @author gao peng
 * @date 2019/8/6 9:55
 */
public class FacadePatternTest {
  public static void main(String[] args) {
    String tableName = "Employee";

    //generating MySql HTML report and Oracle PDF report without using Facade
    Connection con = MySqlHelper.getMySqlDBConnection();
    MySqlHelper mySqlHelper = new MySqlHelper();
    mySqlHelper.generateMySqlHTMLReport(tableName, con);

    Connection con1 = OracleHelper.getOracleDBConnection();
    OracleHelper oracleHelper = new OracleHelper();
    oracleHelper.generateOraclePDFReport(tableName, con1);

    //generating MySql HTML report and Oracle PDF report using Facade
    HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
    HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
  }
}
