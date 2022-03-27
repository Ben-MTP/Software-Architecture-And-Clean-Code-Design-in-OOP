package com.learnit.oop.solid.i.solution;

/**
 * Vortex là một chiếc xe vừa có thể chạy vừa có thể bơi
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class Vortex implements Drivable, Sailable{
    @Override
    public void drive() {
        System.out.println("Có thể chạy trên đường - Nhưng chậm hơn xe máy");
    }

    @Override
    public void sail() {
        System.out.println("Có thể lướt trên mặt nước nhờ sức gió");
    }
}
