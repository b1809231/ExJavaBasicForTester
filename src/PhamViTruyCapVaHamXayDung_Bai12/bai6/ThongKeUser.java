package PhamViTruyCapVaHamXayDung_Bai12.bai6;

public class ThongKeUser {
//    🔹 BÀI 6 – static + constructor
//    Yêu cầu:
//            1. Tạo class ThongKeUser
//2. Thuộc tính:
//    static int tongSoUser
//3. Trong constructor:
//    Mỗi lần tạo object → tăng tongSoUser
//4. Trong main
//    Tạo nhiều object
//    In tổng số user
//🎯 Mục tiêu: hiểu static dùng chung cho class

    static int tongSoUser;


    ThongKeUser(){
        tongSoUser++;
    }

    public static void main(String[] args) {
        ThongKeUser tk1 = new ThongKeUser();
        ThongKeUser tk2= new ThongKeUser();
        ThongKeUser tk3 = new ThongKeUser();
        ThongKeUser tk4 = new ThongKeUser();
        ThongKeUser tk5 = new ThongKeUser();

        System.out.println(tongSoUser);
    }
}
