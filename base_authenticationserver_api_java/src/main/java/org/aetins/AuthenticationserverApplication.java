package org.aetins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author avinash
 *
 */
@SuppressWarnings("deprecation")
@SpringBootApplication
public class AuthenticationserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationserverApplication.class, args);
	}
	
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry
				.addMapping("/*")
				.allowedOrigins("http://localhost:8080");
			}
		};
	}

}
