package com.learnit.oop.solid.l.problem;

/**
 * Giả sử:
 * Có một cuộc đua trong khu rừng nọ.
 * Có một tập hợp các đối thủ cần thi đấu với nhau.
 * Nếu các đối thủ thực hiện cuộc thi bay -> thì 100% đối tượng Ostrick sẽ bị tạch
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class LiskovSubstitutionPrincipleDemo {
    public static void main(String[] args) {
        Bird[] birds = new Bird[] {new Crow(), new Ostrich(), new Sparrow()};
        for (Bird item : birds) {
            /**
             * Thực hiện động tác bay
             * xxx -> problem.Ostrich.fly(Ostrich.java:14)
             * Khi đó exception sảy ra ở lớp Ostrich -> tạch toàn bộ chương trình
             */
            item.fly();

            // Thực hiện động tác ăn
            item.eat();
        }
    }
}
