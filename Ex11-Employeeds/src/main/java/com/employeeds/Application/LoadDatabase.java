package com.employeeds.Application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.employeeds.Domain.Employee;
import com.employeeds.Domain.Role;
import com.employeeds.Persistence.EmployeeRepository;

@Configuration
public class LoadDatabase {
	
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {
		
		return args -> {
			
			log.info("Preloading... " + repository.save(new Employee("Anton A.", Role.Employee)));
			log.info("Preloading... " + repository.save(new Employee("Clara B.", Role.Employee)));
			log.info("Preloading... " + repository.save(new Employee("Josep C.", Role.Employee)));
			log.info("Preloading... " + repository.save(new Employee("Mar D.", Role.Manager)));
			log.info("Preloading... " + repository.save(new Employee("Augusto E.", Role.Manager)));
			log.info("Preloading... " + repository.save(new Employee("Sonia G.", Role.Director)));
			log.info("Preloading... " + repository.save(new Employee("Ona F.", Role.President)));
			
		};
		
	}
		
}

