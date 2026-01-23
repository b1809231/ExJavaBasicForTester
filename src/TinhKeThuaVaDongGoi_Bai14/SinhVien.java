package TinhKeThuaVaDongGoi_Bai14;

public class SinhVien extends Nguoi{
    //    📝 BÀI TẬP 2 – KẾ THỪA (INHERITANCE)
//🎯 Mục tiêu
//    Hiểu extends và dùng lại code
//📌 Yêu cầu
//1. Tạo class Nguoi
//2. Thuộc tính:
//    ten
//            tuoi
//3. Phương thức:
//    hienThiThongTin()
//4. Tạo class SinhVien kế thừa Nguoi
//5. Thêm thuộc tính:
//    maSV
//6. Thêm phương thức:
//    hienThiSinhVien()
//7. Trong main:
//    Tạo 1 SinhVien
//    Gán giá trị
//    Gọi tất cả phương thức

    private String maSV;

    public SinhVien( String ten,int tuoi,  String maSV) {
        super(ten, tuoi);
        this.maSV = maSV;
    }



    public void hienThiSinhVien(){
        System.out.println("Ma sinh vien: "+ maSV);

    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien("Hoa", 12, "454645");
        sv.hienThiThongTin();
        sv.hienThiSinhVien();

    }



}
