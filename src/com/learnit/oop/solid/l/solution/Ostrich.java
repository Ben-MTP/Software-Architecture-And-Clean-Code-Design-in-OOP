package com.learnit.oop.solid.l.solution;

/**
 * Khởi tạo đối tượng Ostrich - đà điểu
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class Ostrich implements Bird{
    @Override
    public void eat() {
        System.out.println("Ăn như một con đà điểu");
    }

    // Không có method fly()...
}
