package TinhKeThuaVaDongGoi_Bai14;

public class TaiKhoan {
//    BÀI TẬP 1 – ĐÓNG GÓI (ENCAPSULATION)
//🎯 Mục tiêu
//    Hiểu cách private field + getter/setter
//📌 Yêu cầu
//1. Tạo class TaiKhoan
//2. Thuộc tính (private):
//    soTaiKhoan
//            soDu
//3. Phương thức:
//    getSoTaiKhoan()
//    getSoDu()
//    napTien(int tien)
//    👉 chỉ cho phép nạp tiền > 0
//    rutTien(int tien)
//    👉 chỉ rút khi số dư đủ
//4. Trong main:
//    Tạo 1 tài khoản
//    Nạp tiền, rút tiền
//    In số dư

    private String soTaiKhoan;
    private double soDu;

    public TaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = 0; // mặc định ban đầu = 0
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    public void napTien(int tien){
        if(tien<0){
            System.out.println("Vui long nap so tien lon hon 0");
        } else
            soDu+= tien;
        System.out.println("So du hien tai la:" +soDu);
    }

    public void rutTien(int tien){
        if(tien<= soDu){
            soDu -= tien;
            System.out.println("Rut tien thanh cong:" +tien);
        } else
            System.out.println("So du khong du");
    }
}
