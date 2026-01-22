package PhamViTruyCapVaHamXayDung_Bai12.bai3;

public class SanPham {
//    🔹 BÀI 3 – Constructor không tham số
//    Yêu cầu:
//            1. Tạo class SanPham
//2. Thuộc tính:
//    ten
//            gia
//3. Tạo constructor không tham số
// Gán giá trị mặc định cho ten và gia
//4. Trong main
//    Tạo object
//    In ra thông tin
//🎯 Mục tiêu: hiểu constructor tự chạy khi new


    String ten;
    float gia;

    public SanPham(){
        String ten = "Hoa";
        float gia = 130000F;
        this.ten = ten;
        this.gia = gia;
    }

    public static void main(String[] args) {
        SanPham sp = new SanPham();
        System.out.println(sp.ten);
        System.out.println(sp.gia);
    }


}
