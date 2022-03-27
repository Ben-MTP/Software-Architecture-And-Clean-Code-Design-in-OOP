package com.learnit.oop.solid.o.solution;

import com.learnit.oop.solid.o.entity.User;

/**
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class OpenClosePrincipleDemo {
    public static void main(String[] args) {
        User user = new User();
        LoadHandler loadHandler = new PersonalLoadHandler(new PersonalLoadValidator());
        loadHandler.approveLoad(user);


        LoadHandler loadHandlerMortgage = new MortgageLoadHandler(new MortgageLoadValidator());
        loadHandlerMortgage.approveLoad(user);

    }
}
