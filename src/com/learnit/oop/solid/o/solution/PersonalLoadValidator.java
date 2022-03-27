package com.learnit.oop.solid.o.solution;

import com.learnit.oop.solid.o.entity.User;

/**
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class PersonalLoadValidator implements Validator{
    @Override
    public boolean isValid(User user) {
        System.out.println("Validate infor User/PersonalLoadValidator");
        return false;
    }
}
