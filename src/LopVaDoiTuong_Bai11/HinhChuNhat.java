package LopVaDoiTuong_Bai11;

public class HinhChuNhat {

//    🟢 BÀI 3 – Class có phương thức xử lý dữ liệu
//
//    Yêu cầu:
//            1 Tạo class HinhChuNhat
//2 Thuộc tính:
//    chieuDai
//            chieuRong
//3 Phương thức:
//    tinhDienTich() → in diện tích
//4 Trong main:
//    Tạo 1 hình chữ nhật
//    Gán giá trị
//    Gọi phương thức
//🎯 Mục tiêu: object + xử lý logic

    float chieudai;
    float chieurong;

    public void tinhDienTich(){
        System.out.println("Dien tich hinh chu nhat la: " + (chieudai*chieurong));
    }

    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.chieudai = 12;
        hcn.chieurong = 4.5f;
        hcn.tinhDienTich();

    }
}
