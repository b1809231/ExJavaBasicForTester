package BaiTapOOP.BaiTapJavaOOP1;

public class NhanVien {


//    - Tạo project mới làm bài tập phần Java OOP
//- Tạo package để phân chia rõ ràng các bài tập cho phù hợp (tuỳ ý)
//- Tạo class NhanVien và các biến, hàm cho phù hợp để lưu lại thông tin
// nhân viên cơ bản (họ tên, tuổi,...)
//            - Tạo class ThongTin để gọi lại thông tin nhân viên từ
//            class NhanVien trên

    public  String ten;
    public int tuoi;
    public String maNV;

    public void showInfo(){
        System.out.println("Ma nhan vien" + maNV);
        System.out.println("Ten nhan vien: "+ ten);
        System.out.println("Tuoi: " + tuoi);
    }
}
