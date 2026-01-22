package TrangThaiStatic_Bai13;

public class TinhToan {
//    🔹 BÀI 6 – static method
//    Yêu cầu:
//            1. Tạo class TinhToan
//2. Tạo method:
//    static int tinhTong(int a, int b)
//    Trong main:
//    Gọi method không tạo object
//    In kết quả
//🎯 Mục tiêu: hiểu static method
//
//🧠 NHỚ 1 CÂU NÀY
//
//    Cái gì dùng chung → static
//    Cái gì riêng từng object → non-static

    static int tinhTong(int a , int b){
        return a+b;
    }

    public static void main(String[] args) {
        int kq = tinhTong(12,6);
        System.out.println(kq);
    }


}
