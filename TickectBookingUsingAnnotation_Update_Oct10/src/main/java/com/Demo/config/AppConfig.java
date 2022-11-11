package com.Demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {
	@Autowired
	Environment env;

	@Bean
	DataSource dataSource() {
		DriverManagerDataSource drvrmngr = new DriverManagerDataSource();
		drvrmngr.setDriverClassName(env.getProperty("db.driver"));
		drvrmngr.setUrl(env.getProperty("db.url"));
		drvrmngr.setUsername(env.getProperty("db.user"));
		drvrmngr.setPassword(env.getProperty("db.password"));

		return drvrmngr;
	}

}
