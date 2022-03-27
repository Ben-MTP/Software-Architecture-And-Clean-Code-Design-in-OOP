package com.learnit.oop.solid.i.problem;

/**
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class Boat implements Vehicle{
    @Override
    public void driver() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sail() {
        System.out.println("Bơi nhanh như một chiếc thuyền");
    }
}
