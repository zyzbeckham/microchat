package org.microchat;

import lombok.Data;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ConfigurationProperties(prefix = "micro.chat")
@EnableConfigurationProperties
@Data
public class OauthServerApplication {

	private String name;

	public static void main(String[] args) {
		SpringApplication.run(OauthServerApplication.class, args);
	}

	@Bean
	public ApplicationRunner echo () {
		return args -> System.out.println(this.getName());
	}

}
