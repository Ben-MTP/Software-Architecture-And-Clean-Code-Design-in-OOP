package com.learnit.oop.solid.o.solution;

import com.learnit.oop.solid.o.entity.User;

/**
 * Thực hiện việc xác thực thông tin người dùng.
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public interface Validator {
    boolean isValid(User user);
}
