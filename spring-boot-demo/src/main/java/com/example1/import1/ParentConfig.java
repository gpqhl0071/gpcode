package com.example1.import1;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JavaConfigA.class, JavaConfigB.class})
public class ParentConfig {
}
