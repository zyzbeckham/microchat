package org.microchat;

import lombok.Data;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ConfigurationProperties(prefix = "micro.chat")
@EnableConfigurationProperties
@Data
@RestController
public class OauthServerApplication {

	private String name;

	public static void main(String[] args) {
		SpringApplication.run(OauthServerApplication.class, args);
	}

	@GetMapping("/echo")
	public String echo () {
		return this.getName();
	}

}
