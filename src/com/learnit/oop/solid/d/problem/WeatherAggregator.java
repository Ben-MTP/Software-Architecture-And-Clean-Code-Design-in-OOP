package com.learnit.oop.solid.d.problem;

/**
 * @author ManhKM on 3/28/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class WeatherAggregator {
    private AccuweatherApi accuweatherApi = new AccuweatherApi();
    private BbcWeatherApi bbcWeatherApi = new BbcWeatherApi();

    public double getTemperature(){
        return (accuweatherApi.getTemperatureCelcius()
            + toCelcius(bbcWeatherApi.getTemperatureFahrenheit())) / 2;
    }

    private double toCelcius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) / 1.8f;
    }
}
