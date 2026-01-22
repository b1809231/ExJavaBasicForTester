package PhamViTruyCapVaHamXayDung_Bai12.bai5;

public class HocSinh {
//    🔹 BÀI 5 – So sánh constructor & method
//    Yêu cầu:
//            1. Tạo class HocSinh
//2. Thuộc tính:
//    ten
//            diem
//3. Tạo:
//            1 constructor gán giá trị ban đầu
//    1 method hienThi()
//4. Trong main
//    Tạo object
//    Gọi method
//🎯 Mục tiêu: phân biệt constructor vs method

    String ten;
    int tuoi;

    HocSinh(){
        String ten = "Hoa An";
        int tuoi = 15;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public void hienThi(){
        System.out.println("Ten hoc sinh: " + ten);
        System.out.println("Tuoi: " + tuoi );
    }

    public static void main(String[] args) {
        HocSinh hs = new HocSinh();
        hs.hienThi();
    }

}
