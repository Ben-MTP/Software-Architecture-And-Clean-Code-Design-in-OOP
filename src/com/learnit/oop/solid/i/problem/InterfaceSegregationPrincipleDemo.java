package com.learnit.oop.solid.i.problem;

/**
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class InterfaceSegregationPrincipleDemo {
    public static void main(String[] args) {
        Vehicle car   = new Car();
        Vehicle plane = new Plane();
        Vehicle boat  = new Boat();

        /**
         * Chỉ một phần tính năng được định nghĩa mới sử dụng
         * Phần còn lại hơi thừa nếu không được sử dụng.
         */
        car.driver();
        plane.driver();plane.fly();
        boat.sail();
    }
}
