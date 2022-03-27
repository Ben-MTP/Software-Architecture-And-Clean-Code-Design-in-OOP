package com.learnit.oop.solid.o.problem;

import com.learnit.oop.solid.o.entity.User;

/**
 * Thực hiện việc triển khai các logic cho vay tiền
 *      dựa theo việc đầu vào là thông tin người dùng đã chính xác hoặc không?
 *
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public class LoanHandler {
    private PersonalLoadValidator personalLoadValidator;
    private MortgageLoadValidator mortgageLoadValidator;

    /**
     * Thực hiện việc phê duyệt việc logic cho vay tiền theo cá nhân
     *      Nếu thực hiện xác thực thông tin người dùng thành công thì
     *      tiến hành việc thủ tục phê duyệt quy trình.
     * @param user
     */
    public void approvePersonalLoad(User user){
        if(personalLoadValidator.isValidUserForPersonalLoad(user)){
            /**
             * Coding logic something.
             */
        }
    }

    public void approveMortgage(User user){
        if (mortgageLoadValidator.isValidUserForMortgage(user)){
            /**
             * Coding logic something for ApproveMortgage
             */
        }
    }
}
