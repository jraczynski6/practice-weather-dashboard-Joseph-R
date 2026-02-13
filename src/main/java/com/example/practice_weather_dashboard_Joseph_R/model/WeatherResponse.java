package com.example.practice_weather_dashboard_Joseph_R.model;

// OpenWeather returns a nested JSON object.
// mirror the structure of the JSON response
//      {
//        "main": {
//          "temp": 72.5,
//          "humidity": 60
//          },
//        "weather": [
//          { "description": "clear sky" }
//        ]
//      }

public class WeatherResponse {

    private Main main;
    private WeatherDescription[] weather;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public WeatherDescription[] getWeather() {
        return weather;
    }

    public void setWeather(WeatherDescription[] weather) {
        this.weather = weather;
    }

    public static class Main {
        private double temp;
        private int humidity;

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }
    }

    public static class WeatherDescription {
        private String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
