package com.learnit.oop.solid.i.solution;

/**
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class Plane implements Drivable, Flyable{
    @Override
    public void drive() {
        System.out.println("Có thể chạy trên đường băng - nhưng chậm hơn siêu xe chút xíu");
    }

    @Override
    public void fly() {
        System.out.println("Có thể bay với vận tốc: 640 - 965 km/h");
    }
}
