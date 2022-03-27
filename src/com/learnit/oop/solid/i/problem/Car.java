package com.learnit.oop.solid.i.problem;

/**
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class Car implements Vehicle{
    @Override
    public void driver() {
        System.out.println("Chạy nhanh như một chiếc siêu xe");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sail() {
        throw new UnsupportedOperationException();
    }
}
