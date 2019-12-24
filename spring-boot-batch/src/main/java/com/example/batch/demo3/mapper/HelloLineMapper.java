package com.example.batch.demo3.mapper;

import com.example.batch.demo3.bean.DeviceCommand;

import org.springframework.batch.item.file.LineMapper;

public class HelloLineMapper implements LineMapper<DeviceCommand> {

  @Override
  public DeviceCommand mapLine(String line, int lineNumber) throws Exception {

    // 逗号分割每一行数据
    String[] args = line.split(",");

    // 创建DeviceCommand对象
    DeviceCommand deviceCommand = new DeviceCommand();

    // 设置id值到对象中
    deviceCommand.setId(args[0]);

    // 设置status值到对象中
    deviceCommand.setStatus(args[1]);

    // 返回对象
    return deviceCommand;
  }
}
