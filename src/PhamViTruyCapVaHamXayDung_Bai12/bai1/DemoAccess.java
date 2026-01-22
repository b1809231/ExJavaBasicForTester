package PhamViTruyCapVaHamXayDung_Bai12.bai1;

public class DemoAccess {
//    🔹 BÀI 1 – Nhận biết phạm vi truy cập
//    Yêu cầu:
//            1 Tạo class DemoAccess
//2. Khai báo 4 thuộc tính:
//    public String ten
//    private int tuoi
//    protected String diaChi
//    String sdt (default)
//3. Trong cùng class, in ra cả 4 thuộc tính
//4. Tạo class khác TestAccess cùng package
//            5. Trong main, thử truy cập từng thuộc tính và ghi chú:
//    Thuộc tính nào truy cập được?
//    Thuộc tính nào bị lỗi?
//            🎯 Mục tiêu: hiểu phạm vi truy cập trong cùng package

    public String ten;
    private int tuoi;
    protected String diachi;
    String sdt;

    public static void main(String[] args) {
        DemoAccess ac = new DemoAccess();
        System.out.println("Ho va ten:" + ac.ten);
        System.out.println("Tuoi: "+ ac.tuoi);
        System.out.println("Dia chi: "+ ac.diachi);
        System.out.println("So dien thoai: "+ ac.sdt);
    }


}
