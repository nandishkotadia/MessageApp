package org.websocket.messageapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.velocity.VelocityAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration(exclude = {VelocityAutoConfiguration.class})
@SpringBootApplication
@ComponentScan(basePackages = {"org.websocket.message.service","org.websocket.user.service","org.websocket.lastread.service"})
@EntityScan(basePackages = "org.websocket.models")
@EnableJpaRepositories("org.websocket.repositories")
public class App
{
   public static void main( String[] args )
   {
      System.out.println( "Hello World!" );
      SpringApplication.run(App.class, args);
   }
}
