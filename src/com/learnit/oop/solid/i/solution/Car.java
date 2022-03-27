package com.learnit.oop.solid.i.solution;

/**
 * Định nghĩa một đối tượng xe hơi - siêu xe
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class Car implements Drivable{

    @Override
    public void drive() {
        System.out.println("Chạy như một siêu xe trên đường");
    }
}
