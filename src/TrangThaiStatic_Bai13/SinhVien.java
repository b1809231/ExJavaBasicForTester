package TrangThaiStatic_Bai13;

public class SinhVien {
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

    String ten;
    static String truong = "DH ABC";

    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.ten = "Nguyen";
        System.out.println(sv1.ten);
        System.out.println(truong);

        SinhVien sv2 = new SinhVien();
        sv2.ten = "Anh";
        System.out.println(sv2.ten);
        System.out.println(truong);


    }


}
