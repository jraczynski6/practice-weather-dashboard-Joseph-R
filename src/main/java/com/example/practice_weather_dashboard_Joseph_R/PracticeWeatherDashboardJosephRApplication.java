package com.example.practice_weather_dashboard_Joseph_R;

import com.example.practice_weather_dashboard_Joseph_R.config.ApiConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

@SpringBootApplication
public class PracticeWeatherDashboardJosephRApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(PracticeWeatherDashboardJosephRApplication.class, args);

        RestTemplate restTemplate = new RestTemplate();
        String apiKey = ApiConfig.getApiKey();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Morning Weather Dashboard ===");
            System.out.println("1. New York");
            System.out.println("2. St. Louis");
            System.out.println("3. Chicago");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
        }


	}

}
