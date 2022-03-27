package com.learnit.oop.solid.o.solution;

import com.learnit.oop.solid.o.entity.User;

/**
 * Thực hiện liệt kê các thao tác cần có cho việc sử lý
 *      approveSomething...
 * Mặc định trong interface là public -> vì mục đích là cho lớp con triển khai tiếp.
 * @author ManhKM on 3/27/2022
 * @project Software-Architecture-And-Clean-Code-Design-in-OOP
 */
public interface LoadHandler {
    void approveLoad(User user);
}
