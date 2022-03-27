package com.learnit.oop.solid.o.solution;

import com.learnit.oop.solid.o.entity.User;

/**
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class MortgageLoadValidator implements Validator{
    @Override
    public boolean isValid(User user) {
        /**
         * Thực hiện việc validate thông tin người dùng.
         * Nếu đủ điều kiện -> return true;
         * Nếu không đủ điều kiện -> return false.
         */
        System.out.println("Validate infor User/MortgageLoadValidator");
        return false;
    }
}
