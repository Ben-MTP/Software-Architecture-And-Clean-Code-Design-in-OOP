package com.learnit.oop.solid.o.entity;

/**
 * Khởi tạo đối tượng người dùng
 * Mục đích là để dùng cho các trường hợp Validate xem người dùng có đủ điều kiện
 *      để cho vay tiền hay không?
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class User {
    private String name;
    private String age;

    public User() {
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
