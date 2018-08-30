package com.example.es;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.core.env.Environment;

import java.net.InetAddress;

@SpringBootApplication
@EntityScan(basePackages={"com.example.es.entity"})
public class EsApplication {
	private static final Logger log = LoggerFactory.getLogger(EsApplication.class);
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(EsApplication.class);
		Environment env = app.run(args).getEnvironment();
		log.info("\n----------------------------------------------------------\n\t" +
						"Application '{}' is running! Access URLs:\n\t" +
						"Local: \t\thttp://localhost:{}\n\t" +
						"External: \thttp://{}:{}\n\t" +
						"-----------------------------------------------------------------",
				env.getProperty("spring.application.name"),
				env.getProperty("server.port"),
				env.getProperty("server.port"),
				env.getProperty("server.port"));
	}
}
