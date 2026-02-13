package com.example.practice_weather_dashboard_Joseph_R.config;

import java.io.InputStream;
import java.util.Properties;

public class ApiConfig {

    public static String getApiKey() throws Exception {
        InputStream input = ApiConfig.class.getClassLoader().getResourceAsStream("config.properties");

        Properties prop = new Properties();
        prop.load(input);
        return prop.getProperty("API_KEY");
    }
}
