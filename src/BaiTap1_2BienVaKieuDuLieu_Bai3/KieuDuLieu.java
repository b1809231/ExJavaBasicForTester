package BaiTap1_2BienVaKieuDuLieu_Bai3;

public class KieuDuLieu {
    public static void main(String[] args) {
        String name = "Nguyen Hoang Quyen"; //chuoi
        int tuoi = 25;  //so nguyen -2147483648 2147483647
        byte tuoikhi2020 = 20; //so nguyen nho -128 127
        char kyTugoi ='Q'; //Ky tu
        boolean gioiTinh = false; //true false
        short diemKhachHang = 3000; //so nguyen -32768 32767
        long diemVIP = 90000L; //so nguyen lon -2^63 2^63-1
        float tienGui = 3000000000F; //so thuc
        double tienLai = 3.330D; //so thuc kich thuoc lon

        System.out.println(name);
        System.out.println(tuoi);
        System.out.println(tuoikhi2020);
        System.out.println(kyTugoi);
        System.out.println(gioiTinh);
        System.out.println(diemKhachHang);
        System.out.println(diemVIP);
        System.out.println(tienGui);
        System.out.println(tienLai);
    }

}
