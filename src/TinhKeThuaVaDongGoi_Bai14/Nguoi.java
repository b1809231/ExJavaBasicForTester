package TinhKeThuaVaDongGoi_Bai14;

public class Nguoi {
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

    private String ten;
    private int tuoi;

    public Nguoi( String ten, int tuoi) {
        this.tuoi = tuoi;
        this.ten = ten;
    }

//    public int getTuoi() {
//        return tuoi;
//    }
//
//    public void setTuoi(int tuoi) {
//        this.tuoi = tuoi;
//    }
//
//    public String getTen() {
//        return ten;
//    }
//
//    public void setTen(String ten) {
//        this.ten = ten;
//    }

    public void hienThiThongTin(){
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: "+tuoi);
    }
}
