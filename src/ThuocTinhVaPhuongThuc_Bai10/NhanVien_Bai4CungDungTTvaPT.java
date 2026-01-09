package ThuocTinhVaPhuongThuc_Bai10;

public class NhanVien_Bai4CungDungTTvaPT {
//    BÀI 4 – Thuộc tính + phương thức cùng dùng
//1. Tạo class NhanVien
//2. Thuộc tính:
//    ten
//            luong
//
//3. Phương thức:
//    hienThiThongTin() → in tên + lương
//
//4. Trong main:
//    Tạo 2 nhân viên khác nhau
//    Gọi phương thức hiển thị
//
//🎯 Mục tiêu: thấy rõ object khác nhau – dữ liệu khác nhau

    String ten;
    String luong;

    public void hienThiThongTin(){
        System.out.println("Ten: " + ten + " co muc" + " Luong: " + luong );
    }

    public static void main(String[] args) {
        NhanVien_Bai4CungDungTTvaPT nv1 = new NhanVien_Bai4CungDungTTvaPT();
        nv1.ten = "Anh";
        nv1.luong = "13000000";
        nv1.hienThiThongTin();

        NhanVien_Bai4CungDungTTvaPT nv2 = new NhanVien_Bai4CungDungTTvaPT();
        nv2.ten = "Hoa";
        nv2.luong = "1273845";
        nv2.hienThiThongTin();
    }
}
