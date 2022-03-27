package com.learnit.oop.solid.l.problem;

/**
 * Ostrick -> là đại diện cho một đối tượng đà điểu
 *      Theo lý thuyết: Con đà điểu nó khác to và nặng.
 *          Khả năng ăn thì nó có, còn khả năng bay thì nó hoàn toàn là không?
 *      -> Một chú gà 90kg.
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class Ostrich implements Bird{
    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void eat() {
        System.out.println("Ăn theo kiểu một con đà điểu");
    }
}
