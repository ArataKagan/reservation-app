package com.akagan.checkin;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EntityScan(basePackageClasses = {
		CheckinApplication.class,
		Jsr310JpaConverters.class
})
public class CheckinApplication {
	
	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
	}

	public static void main(String[] args) {
		SpringApplication.run(CheckinApplication.class, args);
	}

}
