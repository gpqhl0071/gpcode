package com.example1.importResource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = {"classpath:spring-bean2.xml"})
public class XmlConfiguration {
}
