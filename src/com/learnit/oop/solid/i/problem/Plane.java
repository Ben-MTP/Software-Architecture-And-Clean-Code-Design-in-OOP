package com.learnit.oop.solid.i.problem;

/**
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class Plane implements Vehicle{
    @Override
    public void driver() {
        System.out.println("Chạy được nhưng hơi chậm chút thôi");
    }

    @Override
    public void fly() {
        System.out.println("Bay như một chiếc máy bay != con chim");
    }

    @Override
    public void sail() {
        throw new UnsupportedOperationException();
    }
}
