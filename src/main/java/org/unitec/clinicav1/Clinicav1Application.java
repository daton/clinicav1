package org.unitec.clinicav1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class Clinicav1Application implements CommandLineRunner {

	@Autowired
	RepoMongo mongo;


	@Autowired
	MongoTemplate mongoTemplate;
	public static void main(String[] args) {
		SpringApplication.run(Clinicav1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		//mongoTemplate.save(new Mensaje("Lluvia"));

		System.out.println("harto");


	}
}
