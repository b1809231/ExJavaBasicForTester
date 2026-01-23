package TinhKeThuaVaDongGoi_Bai14;

import org.w3c.dom.ls.LSOutput;

public class NhanVien {
//    📝 BÀI TẬP 3 – KẾ THỪA + ĐÓNG GÓI
//🎯 Mục tiêu
//
//    Kết hợp 2 tính OOP
//📌 Yêu cầu
//1. Class NhanVien
//    a. Thuộc tính private:
//    ten
//            luong
//    b. Getter / Setter
//    c. Setter luong chỉ cho > 0
//            2. Class NhanVienFullTime kế thừa NhanVien
//    Thêm thuộc tính:
//    phuCap
//    Phương thức:
//    tinhLuongThucLanh()
//3. Trong main:
//    Tạo đối tượng NhanVienFullTime
//    Gán dữ liệu
//    In lương thực lãnh

    private String ten;
    private float luong;
    //private float luongCung =0;



    public NhanVien(String ten, float luong) {
        this.ten = ten;
        setLuong(luong);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        if (luong > 0) {
            this.luong = luong;
        } else {
            System.out.println("Lương phải lớn hơn 0");
        }
    }

    public void hienThiThongTin(){
        System.out.println("Ten: "+ getTen());
        System.out.println("Luong: "+ getLuong());
    }

}
