package edu.uady.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.UUID;

@SpringBootApplication
public class UadyProducerApplication implements CommandLineRunner {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public static void main(String[] args) {
        SpringApplication.run(UadyProducerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        while (true) {
            kafkaTemplate.send("uady-topic", "Mensaje enviado: " + UUID.randomUUID());
            Thread.sleep(3000);
        }
    }
}
