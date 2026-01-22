package TrangThaiStatic_Bai13;

public class ThongKe {
//    🔹 BÀI 4 – static đếm số object (QUAN TRỌNG)
//    Yêu cầu:
//            1. Tạo class ThongKe
//2. Khai báo:
//    static int tongSoNguoi = 0;
//3. Trong constructor:
//    Mỗi lần tạo object → tăng tongSoNguoi
//4. Trong main:
//    Tạo 3 object
//    In tổng số người
//🎯 Mục tiêu: static dùng cho thống kê

    static int tongsoNguoi = 0;

    ThongKe(){
        tongsoNguoi++;
    }

    public static void main(String[] args) {
        ThongKe tk = new ThongKe();
        ThongKe tk2 = new ThongKe();
        ThongKe tk3 = new ThongKe();
        System.out.println(tongsoNguoi);


    }
}
