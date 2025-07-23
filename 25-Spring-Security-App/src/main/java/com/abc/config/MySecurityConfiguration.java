package com.abc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class MySecurityConfiguration {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(auth -> auth
				.requestMatchers("/api/employee-service/register/").permitAll() // public
				.requestMatchers("/api/employee-service/**").authenticated()) // All other private
		        .httpBasic(Customizer.withDefaults())
				.formLogin(form -> form.disable())
				.logout(logout -> logout.disable())
				.csrf(csrf -> csrf.disable());

		return http.build();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
		
		UserDetails user = User.withUsername("hitesh")
			 .password(passwordEncoder.encode("hitesh@123"))
			 .roles("USER")
			 .build();
		UserDetails admin = User.withUsername("admin")
		     .password(passwordEncoder.encode("admin@123"))
		     .roles("ADMIN")
		     .build();
		return new InMemoryUserDetailsManager(user,admin);
	}
}
