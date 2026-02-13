package com.example.practice_weather_dashboard_Joseph_R.config;

import java.io.InputStream;
import java.util.Properties;

public class ApiConfig {

    // Load the API key from the config.properties file
    public static String getApiKey() throws Exception {
        // Use the class loader to read the config.properties file from the resources folder
        InputStream input = ApiConfig.class.getClassLoader().getResourceAsStream("config.properties");

        Properties prop = new Properties();
        prop.load(input);
        return prop.getProperty("API_KEY");
    }
}
