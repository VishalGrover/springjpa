package com.vishal.springjpa;

import com.vishal.springjpa.model.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringJpaApplication  implements CommandLineRunner {

	@Autowired
	private Time time;


	public static void main(String[] args) {
		SpringApplication.run(MySpringJpaApplication.class, args);

	}

	@Override
	public void run(String... string){
		System.out.println(time.getTimeValueList());
	}

}
