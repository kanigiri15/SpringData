package com.springdata.demo;

import com.springdata.demo.SpringData.Repository;
import com.springdata.demo.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{


	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	Repository repository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("saving new person: no of persons saved {}",repository.save(new Person("nishith","Des moines", new Date())));
		logger.info("saving new person: no of persons saved {}",repository.save(new Person("Ranga", "Hyderabad", new Date())));
		logger.info("saving new person: no of persons saved {}",repository.save(new Person("James", "New York", new Date())));
		logger.info("saving new person: no of persons saved {}",repository.save(new Person("Ranga", "Edison", new Date())));
		logger.info("saving new person: no of persons saved {}",repository.save(new Person("Arya", "Des Moines", new Date())));
		logger.info("update person 100001 {}",repository.save(new Person(3,"nishith","Des moines", new Date())));

        logger.info("User for 100001 is: {}",repository.findOne(2));

        logger.info("All Users: {}",repository.findAll());
        repository.delete(4);
		logger.info("Deleted user '3'");
		logger.info("All Users: {}",repository.findAll());
/*		logger.info("All Users: {}",dao.findAll());
*/
	}
}
