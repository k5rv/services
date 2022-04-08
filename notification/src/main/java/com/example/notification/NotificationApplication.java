package com.example.notification;

import com.example.amqp.RabbitMQMessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.example.notification", "com.example.amqp"})
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.example.clients")
public class NotificationApplication {
  public static void main(String[] args) {
    SpringApplication.run(NotificationApplication.class, args);
  }

/*  @Bean
  CommandLineRunner commandLineRunner(
      RabbitMQMessageProducer producer, NotificationConfig notificationConfig) {
    return args -> {
      producer.publish(
          new Person("Ahmed", 20),
          notificationConfig.getInternalExchange(),
          notificationConfig.getInternalNotificationRoutingKey());
    };
  }

  record Person(String name, int age) {}*/

}
