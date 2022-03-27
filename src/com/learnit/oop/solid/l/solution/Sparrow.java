package com.learnit.oop.solid.l.solution;

/**
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class Sparrow implements FlyingBird{
    @Override
    public void eat() {
        System.out.println("Ăn như một con chim sẻ");
    }

    @Override
    public void fly() {
        System.out.println("Bay như một con chim sẻ");
    }
}
