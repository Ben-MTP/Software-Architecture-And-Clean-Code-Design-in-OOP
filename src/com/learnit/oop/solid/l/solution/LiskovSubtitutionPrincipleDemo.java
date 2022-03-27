package com.learnit.oop.solid.l.solution;

/**
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class LiskovSubtitutionPrincipleDemo {
    public static void main(String[] args) {
        /**
         * (FlyingBird) new Ostrich()
         * Lúc này sẽ có lỗi ngày ở biên dịch: -> tránh trường hợp lỗi cao hơn.
         * Thực hiện cuộc thi bay vừa ăn.
         */
        FlyingBird[] flyingBird = new FlyingBird[]{new Crow(), new Sparrow()};
        for (FlyingBird item: flyingBird) {
            item.fly();
            item.eat();
        }
        System.out.println("=========================================");

        /**
         * Thực hiện cuộc thi ăn
         */
        Bird[] birds = new Bird[]{new Crow(), new Ostrich(), new Sparrow()};
        for (Bird item: birds) {
            item.eat();
        }
    }
}
