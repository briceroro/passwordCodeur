package com.example.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class PasswordCodeurApplication {

public static void main(String[] args) {
		
		
		
		BCryptPasswordEncoder bCryptPasswordEncoderLocal = new BCryptPasswordEncoder();
		String encodepwd = bCryptPasswordEncoderLocal.encode("test123");
		System.out.println("mot de passe encodé  encoder = " +encodepwd);
	}

}
