## Bài toán về nguyên lý 5: Tính tương thích động – Dependency Inversion principle (DIP)

## 1. Architecture


## 2. Contents
    Khái niệm dependency inversion có ý bao hàm cả việc thiết kế các lớp chức năng riêng biệt để tái sử dụng + vận dụng 
    dependency injection cách hợp lí, mọi người nên chú ý kẻo nhầm lẫn nhé.

    Một cách đơn giản thì dependency injection là một kĩ thuật lập trình, trong đó có 2 đối tượng: đối tượng cung cấp service (dependency) và đối tượng sử dụng service, đối tượng cung cấp service sẽ được truyền vào đối tượng sử dụng từ bên ngoài (khác cách thông thường là đối tượng sử dụng sẽ phải new đối tượng cung cấp dịch vụ từ bên trong). Về khái niệm dependency injection, chúng ta phân làm 3 loại:

        + Constructor injection: Truyền đối tượng cung cấp service (dependency) vào hàm khởi tạo của đối tượng sử dụng.
        + Setter injection: Dependency được truyền vào thông qua hàm getter và setter của đối tượng sử dụng.
        + Interface injection: Dependency được truyền vào một hàm nào đó của đối tượng sử dụng, hàm này cần phải có input param là một interface của dependency.

## 3. Phát biểu
    English:
        1. High-level modules should not depend on low-level modules.
        Both should depend on abstractions.
        2. Abstractions should not depend on details. Details should
        depend on abstractions.

    Vietsub:
    Mỗi thành phần hệ thống (class, module, …) chỉ nên phụ thuộc vào các abstractions, 
    không nên phụ thuộc vào các concretions hoặc implementations cụ thể.

## 4. Ví dụ


## 5. Tham khảo
    1. Udemy
    2. SOLID – Nguyên tắc 5: Tính tương thích động – Dependency Inversion principle (DIP)
        https://nhungdongcodevui.com/2017/04/19/solid-la-gi-nguyen-tac-5-tinh-tuong-thich-dong-dependency-inversion-principle-dip/
        https://www.codeproject.com/Articles/703634/SOLID-architecture-principles-using-simple-Csharp
        https://scotch.io/bar-talk/s-o-l-i-d-the-first-five-principles-of-object-oriented-design
        https://www.codeproject.com/articles/615139/an-absolute-beginners-tutorial-on-dependency-inver