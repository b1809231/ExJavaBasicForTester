package PhamViTruyCapVaHamXayDung_Bai12.bai1;

public class TestAccess {
    //4. Tạo class khác TestAccess cùng package
//            5. Trong main, thử truy cập từng thuộc tính và ghi chú:
//    Thuộc tính nào truy cập được?
//    Thuộc tính nào bị lỗi?
//            🎯 Mục tiêu: hiểu phạm vi truy cập trong cùng package
    public static void main(String[] args) {
        DemoAccess access = new DemoAccess();
        System.out.println(access.ten); //đc vì ten public
        //System.out.println(access.tuoi); //lỗi vì tuổi private
        System.out.println(access.diachi);// đc vì diachi protected( truy cập cùng packagge đc)
        System.out.println(access.sdt); //default truy cập trong package đc

    }





}
