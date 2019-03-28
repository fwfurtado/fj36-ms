package br.com.caelum.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AuthorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthorApplication.class, args);
    }
}
