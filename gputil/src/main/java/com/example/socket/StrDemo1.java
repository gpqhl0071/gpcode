package com.example.socket;

import cn.hutool.json.JSONUtil;

/**
 * @author gao peng
 * @date 2019/9/10 16:07
 */
public class StrDemo1 {

  private String AgentOrgCode;
  private String MerCode;
  private String ProductId;
  private String OrgAccType;
  private String TermCode;
  private String BatchNo;
  private String SerialNo;
  private String CardNo;
  private String TxnOrderId;
  private String TxnTime;
  private String TxnAmt;
  private String CurrType;
  private String Cnaps;
  private String ProvinceName;
  private String CityName;
  private String BankName;
  private String SubBranchName;
  private String AccType;
  private String AccNo;
  private String AccName;
  private String IdType;
  private String IdNo;
  private String MobileNo;
  private String NotifyUrl;
  private String SignMac;

  public String getAgentOrgCode() {
    return AgentOrgCode;
  }

  public void setAgentOrgCode(String agentOrgCode) {
    AgentOrgCode = agentOrgCode;
  }

  public String getMerCode() {
    return MerCode;
  }

  public void setMerCode(String merCode) {
    MerCode = merCode;
  }

  public String getProductId() {
    return ProductId;
  }

  public void setProductId(String productId) {
    ProductId = productId;
  }

  public String getOrgAccType() {
    return OrgAccType;
  }

  public void setOrgAccType(String orgAccType) {
    OrgAccType = orgAccType;
  }

  public String getTermCode() {
    return TermCode;
  }

  public void setTermCode(String termCode) {
    TermCode = termCode;
  }

  public String getBatchNo() {
    return BatchNo;
  }

  public void setBatchNo(String batchNo) {
    BatchNo = batchNo;
  }

  public String getSerialNo() {
    return SerialNo;
  }

  public void setSerialNo(String serialNo) {
    SerialNo = serialNo;
  }

  public String getCardNo() {
    return CardNo;
  }

  public void setCardNo(String cardNo) {
    CardNo = cardNo;
  }

  public String getTxnOrderId() {
    return TxnOrderId;
  }

  public void setTxnOrderId(String txnOrderId) {
    TxnOrderId = txnOrderId;
  }

  public String getTxnTime() {
    return TxnTime;
  }

  public void setTxnTime(String txnTime) {
    TxnTime = txnTime;
  }

  public String getTxnAmt() {
    return TxnAmt;
  }

  public void setTxnAmt(String txnAmt) {
    TxnAmt = txnAmt;
  }

  public String getCurrType() {
    return CurrType;
  }

  public void setCurrType(String currType) {
    CurrType = currType;
  }

  public String getCnaps() {
    return Cnaps;
  }

  public void setCnaps(String cnaps) {
    Cnaps = cnaps;
  }

  public String getProvinceName() {
    return ProvinceName;
  }

  public void setProvinceName(String provinceName) {
    ProvinceName = provinceName;
  }

  public String getCityName() {
    return CityName;
  }

  public void setCityName(String cityName) {
    CityName = cityName;
  }

  public String getBankName() {
    return BankName;
  }

  public void setBankName(String bankName) {
    BankName = bankName;
  }

  public String getSubBranchName() {
    return SubBranchName;
  }

  public void setSubBranchName(String subBranchName) {
    SubBranchName = subBranchName;
  }

  public String getAccType() {
    return AccType;
  }

  public void setAccType(String accType) {
    AccType = accType;
  }

  public String getAccNo() {
    return AccNo;
  }

  public void setAccNo(String accNo) {
    AccNo = accNo;
  }

  public String getAccName() {
    return AccName;
  }

  public void setAccName(String accName) {
    AccName = accName;
  }

  public String getIdType() {
    return IdType;
  }

  public void setIdType(String idType) {
    IdType = idType;
  }

  public String getIdNo() {
    return IdNo;
  }

  public void setIdNo(String idNo) {
    IdNo = idNo;
  }

  public String getMobileNo() {
    return MobileNo;
  }

  public void setMobileNo(String mobileNo) {
    MobileNo = mobileNo;
  }

  public String getNotifyUrl() {
    return NotifyUrl;
  }

  public void setNotifyUrl(String notifyUrl) {
    NotifyUrl = notifyUrl;
  }

  public String getSignMac() {
    return SignMac;
  }

  public void setSignMac(String signMac) {
    SignMac = signMac;
  }

  public static void main(String[] args) {

    StrDemo1 s = new StrDemo1();

    s.setAgentOrgCode("");
    s.setMerCode("");
    s.setProductId("");
    s.setOrgAccType("");
    s.setTermCode("");
    s.setBatchNo("");
    s.setSerialNo("");
    s.setCardNo("");
    s.setTxnOrderId("");
    s.setTxnTime("");
    s.setTxnAmt("");
    s.setCurrType("");
    s.setCnaps("");
    s.setProvinceName("");
    s.setCityName("");
    s.setBankName("");
    s.setSubBranchName("");
    s.setAccType("");
    s.setAccNo("");
    s.setAccName("");
    s.setIdType("");
    s.setIdNo("");
    s.setMobileNo("");
    s.setNotifyUrl("");
    s.setSignMac("");


    System.out.println(JSONUtil.toJsonStr(s));
  }
}
