package com.learnit.oop.solid.d.solution;

import java.util.ArrayList;

/**
 * @author ManhKM on 3/30/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class AppMainWeather {
    public static void main(String[] args) {
        BccWeatherApi bccWeatherApi   = new BccWeatherApi();
        AccuweatherApi accuweatherApi = new AccuweatherApi();
        WeatherSource[] weatherSources = new WeatherSource[]{bccWeatherApi, accuweatherApi};

        WeatherAggregator weatherAggregator = new WeatherAggregator(weatherSources);
        System.out.println("Weather Aggregator: "+weatherAggregator.getTemperature());
    }
}
