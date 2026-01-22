package TrangThaiStatic_Bai13.BaiThemNua;

public class ConfigBaiThem {
//    🧩 Bài 5: Static Block
//    Yêu cầu:
//            1. Tạo class Config:
//    static String dbUrl
//2. Dùng static block để gán:
//    dbUrl = "jdbc:mysql://localhost:3306/testdb";
//3. In giá trị dbUrl trong main.
//            👉 Mục tiêu: hiểu static block chạy trước main.


    static  String dbUrl;

    static{
        dbUrl= "jdbc:mysql://localhost:3306/testdb";
        System.out.println("block da chay");
    }

    public static void main(String[] args) {
        System.out.println("main chay");
    }

}
