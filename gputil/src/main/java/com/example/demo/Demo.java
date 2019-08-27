package com.example.demo;


import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.StrUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author gao peng
 * @date 2019/5/14 15:37
 */
public class Demo {

  public static void main(String[] args) throws Exception {

    ArrayList<String> list1 = CollectionUtil.newArrayList("a", "x");
    ArrayList<String> list2 = CollectionUtil.newArrayList("c", "d");

    Collection<String> union = CollectionUtil.intersection(list1, list2);

    System.out.println(union.size());

  }
}

class DemoVo {

  private int id;
  private String channel;

  private long singleAmountBegin;
  private String singleAmountEnd;
  private String dayMaxAmount;
  private String level;
  private String remark;
  private Date createTime;

  private List<WithdrawUpdateRoutingTimeVO> timesVO;

  @Override
  public String toString() {
    return "WithdrawUpdateRoutingVO{" +
        "id='" + id + '\'' +
        ", channel='" + channel + '\'' +
        ", singleAmountBegin='" + singleAmountBegin + '\'' +
        ", singleAmountEnd='" + singleAmountEnd + '\'' +
        ", dayMaxAmount='" + dayMaxAmount + '\'' +
        ", level='" + level + '\'' +
        ", remark='" + remark + '\'' +
        ", timesVO=" + timesVO +
        '}';
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public long getSingleAmountBegin() {
    return singleAmountBegin;
  }

  public void setSingleAmountBegin(long singleAmountBegin) {
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

  public List<WithdrawUpdateRoutingTimeVO> getTimesVO() {
    return timesVO;
  }

  public void setTimesVO(List<WithdrawUpdateRoutingTimeVO> timesVO) {
    this.timesVO = timesVO;
  }
}

class WithdrawUpdateRoutingTimeVO {
  private String startTime;
  private String endTime;
  private List<Integer> weeks;

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public List<Integer> getWeeks() {
    return weeks;
  }

  public void setWeeks(List<Integer> weeks) {
    this.weeks = weeks;
  }
}





