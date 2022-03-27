## 1. Architecture
    Open file architecture with draw.io


## 2. Contents    
    + LoadHandler -> xử lý việc cho vay
        Vay với cá nhân(Personal)
        Vay với việc thế chấp (Mortgage)
        -> Chúng đều phải xử lý việc validate đầu vào là người dùng.
    + Validator: Việc thực hiện Validate trước rồi mới Handler.
    

## 3. Phát biểu
    Chúng ta nên hạn chế việc chỉnh sửa bên trong một Class hoặc Module có sẵn, thay vào đó hãy xem xét mở rộng chúng.

## 4. Ví dụ:
![img.png](../../docs/img.png)
![img_1.png](../../docs/img_1.png)    


## 5. Tham khảo:
    1. Udemy
    2. SOLID – Nguyên tắc 2: Đóng và Mở – Open / Closed principle (OCP)
        https://nhungdongcodevui.com/2017/03/25/solid-la-gi-nguyen-tac-2-dong-va-mo-open-closed-principle-ocp/
        https://www.codeproject.com/Articles/703634/SOLID-architecture-principles-using-simple-Csharp
        http://thaotrinh.info/nguyen-ly-solid-trong-lap-trinh-huong-doi-tuong-va-vi-du-su-dung-c-p2/
        https://scotch.io/bar-talk/s-o-l-i-d-the-first-five-principles-of-object-oriented-design


