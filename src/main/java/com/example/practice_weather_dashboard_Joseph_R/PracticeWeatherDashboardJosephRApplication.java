package com.example.practice_weather_dashboard_Joseph_R;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PracticeWeatherDashboardJosephRApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeWeatherDashboardJosephRApplication.class, args);

        RestTemplate restTemplate = new RestTemplate();
	}

}
