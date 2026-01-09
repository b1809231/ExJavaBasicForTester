package LopVaDoiTuong_Bai11;

public class MayTinh {
//    🟢 BÀI 6 – Class + phương thức có tham số
//
//    Yêu cầu:
//            1 Tạo class MayTinh
//2 Phương thức:
//    cong(int a, int b) → in tổng
//    tru(int a, int b) → in hiệu
//3Trong main:
//    Tạo object
//    Gọi 2 phương thức
//🎯 Mục tiêu: object + tham số

    void cong(float a, float b){
        System.out.println("Tổng = " + (a+b));
    }
    void tru(float a, float b){
        System.out.println("Hiệu = " + (a-b));
    }

    public static void main(String[] args) {
        MayTinh mt = new MayTinh();
        mt.cong(12,20);
        mt.tru(12,54);
    }


}
