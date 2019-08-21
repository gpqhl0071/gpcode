package com.example.demo.controller;

import java.util.List;

/**
 * @author gao peng
 * @date 2019/8/14 9:14
 */
public class DemoVo {
  private String id;
  private String singleAmountBegin;
  private String singleAmountEnd;
  private String dayMaxAmount;
  private String level;
  private String remark;

  private List<String> startTime;
  private List<String> endTime;
  private List<List<Integer>> weeks;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getSingleAmountBegin() {
    return singleAmountBegin;
  }

  public void setSingleAmountBegin(String singleAmountBegin) {
    this.singleAmountBegin = singleAmountBegin;
  }

  public String getSingleAmountEnd() {
    return singleAmountEnd;
  }

  public void setSingleAmountEnd(String singleAmountEnd) {
    this.singleAmountEnd = singleAmountEnd;
  }

  public String getDayMaxAmount() {
    return dayMaxAmount;
  }

  public void setDayMaxAmount(String dayMaxAmount) {
    this.dayMaxAmount = dayMaxAmount;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public List<String> getStartTime() {
    return startTime;
  }

  public void setStartTime(List<String> startTime) {
    this.startTime = startTime;
  }

  public List<String> getEndTime() {
    return endTime;
  }

  public void setEndTime(List<String> endTime) {
    this.endTime = endTime;
  }

  public List<List<Integer>> getWeeks() {
    return weeks;
  }

  public void setWeeks(List<List<Integer>> weeks) {
    this.weeks = weeks;
  }

  @Override
  public String toString() {
    return "DemoVo{" +
        "id='" + id + '\'' +
        ", singleAmountBegin='" + singleAmountBegin + '\'' +
        ", singleAmountEnd='" + singleAmountEnd + '\'' +
        ", dayMaxAmount='" + dayMaxAmount + '\'' +
        ", level='" + level + '\'' +
        ", remark='" + remark + '\'' +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", weeks=" + weeks +
        '}';
  }
}
