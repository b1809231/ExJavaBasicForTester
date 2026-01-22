package TrangThaiStatic_Bai13;

public class Demo {
//    🔹 BÀI 5 – static vs non-static
//    Yêu cầu:
//            1. Tạo class Demo
//2. Khai báo:
//    int a (thường)
//    static int b
//3. Trong main:
//    Tạo 2 object
//    Thay đổi a và b
//    In kết quả
//🎯 Mục tiêu: so sánh riêng vs chung

    int a;
    static  int b;

    public static void main(String[] args) {
        Demo dm = new Demo();

        dm.a = 12;
         b =9;
        System.out.println(dm.a);
        System.out.println(b);
    }



}
