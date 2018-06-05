package com.practice.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.practice.models.VehicleRepository;

/*@Configuration
@EnableAutoConfiguration
@ComponentScan*/
@SpringBootApplication(scanBasePackages = {"com.practice","com.practice.models","com.practice.service"})
@EnableMongoRepositories(basePackageClasses = VehicleRepository.class)
public class VehicleAPIBoot {
	public static void main(String args[]) {
		SpringApplication.run(VehicleAPIBoot.class, args);
	}

}
