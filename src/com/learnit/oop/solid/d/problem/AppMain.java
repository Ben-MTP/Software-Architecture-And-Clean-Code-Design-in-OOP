package com.learnit.oop.solid.d.problem;

/**
 * @author ManhKM on 3/28/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class AppMain {
    public static void main(String[] args) {
        WeatherAggregator weatherAggregator = new WeatherAggregator();
        weatherAggregator.getTemperature();
    }
}
