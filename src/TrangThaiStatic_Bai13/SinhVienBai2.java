package TrangThaiStatic_Bai13;

public class SinhVienBai2 {
//    BÀI TẬP STATIC TRONG JAVA
//🔹 BÀI 1 – Nhận biết biến static
//    Yêu cầu:
//            1. Tạo class SinhVien
//2. Khai báo:
//    String ten (biến thường)
//    static String truong = "DH ABC"
//3. Trong main:
//    Tạo 2 sinh viên
//    Gán tên khác nhau
//    In:
//    Tên từng sinh viên
//    Tên trường
//🎯 Mục tiêu: thấy rõ biến static dùng chung

//    🔹 BÀI 2 – static thay đổi ảnh hưởng toàn bộ object
//    Yêu cầu:
//            1. Dùng lại class SinhVien
//2. Trong main:
//    Đổi truong sang "DH XYZ"
//    In lại thông tin sinh viên
//🎯 Mục tiêu: hiểu 1 biến static – nhiều object dùng chung
//    🔹 BÀI 3 – static không cần tạo object
//    Yêu cầu:
//            1. Không tạo object
//    In trực tiếp tên trường bằng:
//    SinhVien.truong
//🎯 Mục tiêu: hiểu static thuộc về class

    String ten;
    static String truong = "DH ABC";

    public static void main(String[] args) {
        truong = "Dai hoc 123";
        SinhVienBai2 sv1 = new SinhVienBai2();
        sv1.ten = "Nguyen";
        System.out.println(sv1.ten);
        System.out.println(SinhVienBai2.truong);

        SinhVienBai2 sv2 = new SinhVienBai2();
        sv2.ten = "Anh";
        System.out.println(sv2.ten);
        System.out.println(SinhVienBai2.truong);


    }


}
