package com.learnit.oop.solid.l.problem;

/**
 * Định nghĩa ra một Đối tượng Crow (Con quạ)
 *      Theo lý thuyết:
 *          Quạ là một loại chim -> nó sẽ kế thừa được Bird() -> ở đây coi như là một
 *          object trừu tượng hóa.
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class Crow implements Bird{

    @Override
    public void fly() {
        System.out.println("Bay như một con quạ");
    }

    @Override
    public void eat() {
        System.out.println("Ăn đồ ăn theo kiểu một con quạ");
    }
}
