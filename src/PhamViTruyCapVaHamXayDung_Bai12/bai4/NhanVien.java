package PhamViTruyCapVaHamXayDung_Bai12.bai4;

public class NhanVien {
//    🔹 BÀI 4 – Constructor có tham số
//    Yêu cầu:
//            1. Tạo class NhanVien
//2. Thuộc tính:
//    ten
//            luong
//3. Tạo constructor có tham số:
//    NhanVien(String ten, double luong)
//4. Trong main
//    Tạo 2 nhân viên khác nhau
//    In thông tin từng người
//🎯 Mục tiêu: truyền dữ liệu vào object khi tạo

    String ten;
    float luong;

    public NhanVien(String ten, int luong){
        this.ten = ten;
        this.luong = luong;
    }

    public void showIn4(){
        System.out.println("Ten nhan vien: "+ ten);
        System.out.println("Luong: "+ luong);
    }

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Kim Huyen", 1393875);
        nv1.showIn4();
        NhanVien nv2 = new NhanVien("Anh Hoa", 2393875);
        nv2.showIn4();

    }
}
