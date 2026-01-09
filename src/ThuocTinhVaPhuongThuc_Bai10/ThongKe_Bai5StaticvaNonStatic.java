package ThuocTinhVaPhuongThuc_Bai10;

public class ThongKe_Bai5StaticvaNonStatic {
//    BÀI 5 – Static vs Non-static (QUAN TRỌNG)
//            1. Tạo class ThongKe
//2. Thuộc tính static int tongSoNguoi
//3. Phương thức static tangSoNguoi():
//    Mỗi lần gọi → tăng tongSoNguoi
//4. Trong main:
//    Gọi phương thức nhiều lần
//    In tổng số người
//
//🎯 Mục tiêu: hiểu static thuộc về class

    static int tongSoNguoi;

    static int tangSoNguoi(){
        return tongSoNguoi++;
    }

    public static void main(String[] args) {
        tangSoNguoi();
        tangSoNguoi();

        System.out.println(tangSoNguoi());
    }
}
