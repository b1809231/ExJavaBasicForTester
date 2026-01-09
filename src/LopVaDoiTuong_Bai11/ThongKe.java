package LopVaDoiTuong_Bai11;

public class ThongKe {
//    🟢 BÀI 5 – Static vs Non-static
//
//    Yêu cầu:
//            1 Tạo class ThongKe
//2 Thuộc tính:
//    static int tongSoNguoi
//3 Phương thức:
//    static void tangSoNguoi() → tăng tongSoNguoi
//4 Trong main:
//    Gọi phương thức nhiều lần
//    In tổng số người
//🎯 Mục tiêu: hiểu static thuộc về class, không cần object

    static int tongSoNguoi = 0;

    static void tangSoNguoi(){
        tongSoNguoi++;
    }

    public static void main(String[] args) {

//       Vì tangSoNguoi() là static
//👉 Gọi trực tiếp bằng tên class
        ThongKe.tangSoNguoi();
        ThongKe.tangSoNguoi();

        System.out.println(tongSoNguoi);
    }
}
