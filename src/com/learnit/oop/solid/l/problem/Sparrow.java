package com.learnit.oop.solid.l.problem;

/**
 * Sparrow -> đại diện cho một đối tượng là con chim sẻ
 * Về lý thuyết: Chim sẻ là một loài chim bay được và ăn được.
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class Sparrow implements Bird{

    @Override
    public void fly() {
        System.out.println("Bay theo kiểu một con chim sẻ");
    }

    @Override
    public void eat() {
        System.out.println("Ăn theo kiểu một con chim sẻ");
    }
}
