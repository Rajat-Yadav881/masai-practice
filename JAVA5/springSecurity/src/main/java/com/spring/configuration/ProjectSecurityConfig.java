package com.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
	
	@Bean
	public SecurityFilterChain masaiSecurityFilter(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests( (auth)->auth
				.requestMatchers("/masai/welcomeP").authenticated()
				.requestMatchers("/masai/welcome").permitAll()
		).httpBasic();

		return http.build();
	}
}
