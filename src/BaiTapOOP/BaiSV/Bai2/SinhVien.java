package BaiTapOOP.BaiSV.Bai2;

public class SinhVien {
   /** Bài 2:Viết chương trình OOP quản lý sinh viên đơn giản: Nhập, xuất thông tin, tính điểmtrung bình.

    - Viết lớp Sinh viên như sau:Attributes, instance fields (private):
    Mã sinh viên là số nguyên.
        Họ tên: chuỗi ký tự.
    Điểm LT, điểm TH : float
    
    Constructor:
    Constructor mặc định (để khởi tạo đối tượng với các thông tin kiểu số là 0, kiểu
    chuỗi làchuỗi rỗng).
    Constructor thứ hai nhận đầy đủ thông tin để khởi tạo giá trị cho tất cả các biến instance.
    Methods:
    Các getter và setter cho mỗi thuộc tính.
    Tính điểm trung bình.
    Phương thức toString để diễn tả đối tượng ở dạng chuỗi.
    Xây dựng class chứa hàm main: tạo 3 đối tượng sinh viên sv1, sv2, sv3,
    trong đó: sv1 chứa thông tin của chính mình (tạo bằng constructor đủ thông số, thông tin
    biết rồi khỏi nhập từ bàn phím).
    sv2 là thông tin người bạn thân nhất của em (tạo bằng constructor đủ thông số,
    thông tin biết rồi khỏi nhập từ bàn phím). sv3 tạo bằng constructor mặc định.
    Nhập các thông tin cho sv3 từ bàn phím rồi sau đó dùng các setter để gán vào cho các thuộc tính tương ứng. In bảng danh sách sinh viên gồm 4 cột là MSSV, họ tên, điểm LT”, điểm TH, điểm TB (bảng có 3 dòng cho 3 sinh viên)
}*/
   private int maSV;
   private String hoTen;
   private float diemLT;
   private float diemTH;

    public SinhVien() {
        this.maSV = 0;
        this.hoTen= "";
        this.diemLT =0;
        this.diemTH = 0;
    }

    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public float getDiemTH(float diemTH) {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public float diemTB(){
        return (diemLT+diemTH);
    }

    public String toString(){
        return "Mã sinh viên: " +  maSV+ "\n" +
                "Họ và tên: " +hoTen + "\n" +
                "Điểm lý thuyết: " + diemLT + "\n" +
                "Điểm thực hành: " + diemTH +"\n" +
                "Điểm trung bình: " + diemTB() ;
    }
}
