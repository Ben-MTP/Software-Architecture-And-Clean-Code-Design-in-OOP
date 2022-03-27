package com.learnit.oop.solid.i.solution;

/**
 * Nó có tính chất giống kiểu Đa Hình trong lập trình OOP.
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class InterfaceSegregationPrincipleDemo {
    public static void main(String[] args) {
        Flyable plane = new Plane();
        Drivable plane2 = new Plane();      // Khởi tạo một cái gì đó có thể chạy từ máy bay.

        plane.fly();
        plane2.drive();

        Sailable vortex = new Vortex();
        if(vortex instanceof Drivable){
            ((Drivable) vortex).drive();
        } else if(vortex instanceof Flyable){
            ((Flyable) vortex).fly();
        } else {
            System.out.println("Máy móc không thuộc về loại nào cả");
        }
        vortex.sail();
    }
}
