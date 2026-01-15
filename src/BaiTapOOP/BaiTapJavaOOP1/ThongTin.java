package BaiTapOOP.BaiTapJavaOOP1;

public class ThongTin {
    public static void main(String[] args) {


        NhanVien nv1 = new NhanVien();
        nv1.maNV= "1334534563";
        nv1.ten = "Nguyen Thien Huu";
        nv1.tuoi = 15;
        nv1.showInfo();

        NhanVien nv2 = new NhanVien();
        nv2.maNV= "13345453";
        nv2.ten = "Nguyen Anh Nhan";
        nv2.tuoi = 15;
        nv2.showInfo();
    }
}
