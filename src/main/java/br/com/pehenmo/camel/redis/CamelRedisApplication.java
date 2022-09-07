package br.com.pehenmo.camel.redis;

import org.apache.camel.CamelContext;
import org.apache.camel.component.http.HttpComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CamelRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelRedisApplication.class, args);
	}

}
