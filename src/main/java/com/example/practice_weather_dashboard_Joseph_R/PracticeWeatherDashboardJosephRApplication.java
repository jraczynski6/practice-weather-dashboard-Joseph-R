package com.example.practice_weather_dashboard_Joseph_R;

import com.example.practice_weather_dashboard_Joseph_R.config.ApiConfig;
import com.example.practice_weather_dashboard_Joseph_R.model.WeatherResponse;
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

            String input = scanner.nextLine();
            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    fetchAndDisplay("New York", restTemplate, apiKey);
                    break;
                case 2:
                    fetchAndDisplay("St. Louis", restTemplate, apiKey);
                    break;
                case 3:
                    fetchAndDisplay("Chicago", restTemplate, apiKey);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void fetchAndDisplay(String city, RestTemplate restTemplate, String apiKey) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q="
                + city + "&appid=" + apiKey + "&units=imperial";

        WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class);

        System.out.println("\n=== Weather in " + city + " ===");
        if (response != null && response.getMain() != null && response.getWeather() != null && response.getWeather().length > 0) {
            System.out.println("Temperature: " + response.getMain().getTemp() + "°F");
            System.out.println("Humidity: " + response.getMain().getHumidity() + "%");
            System.out.println("Condition: " + response.getWeather()[0].getDescription());
        } else {
            System.out.println("Weather data not available for " + city);
        }
    }
}
