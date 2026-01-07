package ThuocTinhVaPhuongThuc_Bai10;

public class TinhToan_Bai3PhuongThucCoGiaTriTraVe {

//    BÀI 3 – Phương thức có giá trị trả về
//1. Tạo class TinhToan
//2. Tạo phương thức:
//    int tinhHieu(int a, int b)
//    Trả về hiệu của a và b
//3. Trong main:
//    Gọi phương thức
//    Lưu kết quả vào biến
//
//4. In kết quả ra màn hình
//
//🎯 Mục tiêu: hiểu return

    public int tinhHieu(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        TinhToan_Bai3PhuongThucCoGiaTriTraVe hieu = new TinhToan_Bai3PhuongThucCoGiaTriTraVe();

        float a = hieu.tinhHieu(1, 9);
        System.out.println(a);

    }
}
