package com.learnit.oop.solid.o.problem;

import com.learnit.oop.solid.o.entity.User;

/**
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class OpenClosedPrincipleDemo {
    public static void main(String[] args) {
        LoanHandler loanHandler = new LoanHandler();
        User user = new User();

        loanHandler.approveMortgage(user);
        loanHandler.approvePersonalLoad(user);
    }
}
