package com.learnit.oop.solid.l.solution;

/**
 * Khởi tạo đối tượng: Crow - con quạ đen
 *      Nó extend lại từ FlyingBird mà FLyingBird được extends từ Bird.
 *          Nên Crow -> override 2 method fly() + eat()...
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class Crow implements FlyingBird{
    @Override
    public void eat() {
        System.out.println("Ăn như một con quạ");
    }

    @Override
    public void fly() {
        System.out.println("Bay như một con quạ");
    }
}
