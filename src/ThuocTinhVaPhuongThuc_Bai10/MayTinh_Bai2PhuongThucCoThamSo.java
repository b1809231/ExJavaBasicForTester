package ThuocTinhVaPhuongThuc_Bai10;

public class MayTinh_Bai2PhuongThucCoThamSo {
//    BÀI 2 – Phương thức có tham số
//📌 Yêu cầu
//1. Tạo class MayTinh
//2. Tạo phương thức:
//    tinhTong(int a, int b)
//    In ra tổng của 2 số
//3. Gọi phương thức trong main với nhiều giá trị khác nhau
//
//🎯 Mục tiêu: hiểu tham số của phương thức

    public void tinhTong(int a, int b){
        System.out.println("Tong a+b = "+ (a+b));
    }

    public static void main(String[] args) {
    MayTinh_Bai2PhuongThucCoThamSo tinhTong = new MayTinh_Bai2PhuongThucCoThamSo();
    tinhTong.tinhTong(12, 14);
    tinhTong.tinhTong(23, 14);
    tinhTong.tinhTong(1289, 14);



    }
}
