package com.learnit.oop.solid.d.solution;

/**
 * Đối với BccWeatherApi được tính toán theo một đơn vị đo khác -> độ F.
 * @author ManhKM on 3/30/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class BccWeatherApi implements WeatherSource{
    /**
     * Lấy ra giá trị nhiệt độ C mục đích.
     * Hệ thống khác có thể gọi ở đây -> lấy độ C.
     * @return
     */
    @Override
    public double getTemperatureCelcius() {
        return toCelcius(getTemperatureFahrenheit());
    }

    /**
     * Hàm chuyển đổi từ độ F sang độ C:
     *      (F - 32)/1.8F.
     * @param temperatureFahrenheit
     * @return
     */
    private double toCelcius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) / 1.8f;
    }

    /**
     * Hàm lấy nhiệt độ F riêng của hệ thống BbcWeatherAPI.
     * @return
     */
    private double getTemperatureFahrenheit() {
        return 0; //Demo data
    }
}
