package com.learnit.oop.solid.o.solution;

import com.learnit.oop.solid.o.entity.User;

/**
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class MortgageLoadHandler implements LoadHandler{
    private Validator validator;

    public MortgageLoadHandler(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void approveLoad(User user) {
        if(validator.isValid(user)){
            /**
             * Nếu việc thực hiện validate thông tin thành công...
             */
            System.out.println("Phê duyệt thông tin thành công");
        } else {
            System.out.println("Phê duyệt thông tin không thành công");
        }
    }
}
