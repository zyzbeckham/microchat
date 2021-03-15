package org.microchat;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@ConfigurationProperties(prefix = "micro.chat")
@EnableConfigurationProperties
@Data
@RestController
public class OauthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthServerApplication.class, args);
	}

	@GetMapping("/echo")
	public String echo () {
		return DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss").format(LocalDateTime.now());
	}

}
