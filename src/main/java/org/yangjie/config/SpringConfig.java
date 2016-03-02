package org.yangjie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * 数据库连接配置
 */
@Configuration	// 注解为spring配置java类
@ComponentScan("org.yangjie") // 注解扫描包
public class SpringConfig {
	
	
	@Bean  // 用于读取配置文件
	public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
}
