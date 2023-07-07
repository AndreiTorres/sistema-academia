package edu.uady.escolar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EscolarApplication {

    public static void main(String[] args) {
        SpringApplication.run(EscolarApplication.class, args);
    }

}
