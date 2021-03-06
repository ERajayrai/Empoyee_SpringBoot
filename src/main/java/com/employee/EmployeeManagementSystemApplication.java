package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication

@ComponentScan(basePackages = "com.*")
@EntityScan("com.employee.model.db")
@EnableElasticsearchRepositories(basePackages = "com.employee.data.service")
@EnableJpaRepositories(basePackages = {"com.employee.dao.service"})

public class EmployeeManagementSystemApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

}
