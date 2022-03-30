package com.learnit.oop.solid.d.solution;

import java.util.Arrays;

/**
 * Tính toán giá trị trung bình của nhiệt độ
 *      Mục đích trả về một cách chính xác nhiệt độ tại một khu vực nào đó.
 *
 * @author ManhKM on 3/30/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class WeatherAggregator {
    /**
     * Liệt kê toàn bộ các nguồn cung cấp dữ liệu
     * Ở đây sử dụng WeatherSource: như một abstract data.
     * Mà không cần quan tâm đến triển khai của nó là những thứ gì.
     * Tính Dependency Inversion là đây.
     */
    private WeatherSource[] weatherSources;

    public WeatherAggregator(WeatherSource[] weatherSources){
        this.weatherSources = weatherSources;
    }

    /**
     * Hệ thống sẽ trả ra một API ở ngoài cho hệ thống khác gọi vào:
     *      getTemperature() -> return giá trị trung bình của nhiệt độ.
     *
     * @return
     */
    public double getTemperature(){
        return Arrays.stream(weatherSources)
                .mapToDouble(WeatherSource::getTemperatureCelcius)
                .average()
                .getAsDouble();
    }
}
