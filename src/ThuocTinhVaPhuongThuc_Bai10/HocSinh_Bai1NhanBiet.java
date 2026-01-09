package ThuocTinhVaPhuongThuc_Bai10;

public class HocSinh_Bai1NhanBiet{
//
//  1  Tạo class HocSinh
//2. Khai báo thuộc tính:
//    ten
//            tuoi
//    lop
//3. Tạo phương thức:
//    hocBai() → in ra: "Hoc sinh dang hoc bai"
//            4. Trong main:
//    Tạo 1 đối tượng học sinh
//    Gán giá trị cho thuộc tính
//    Gọi phương thức
//    Mục tiêu: phân biệt cái có và cái làm

    String ten = "Huynh";
    int tuoi = 13;
    String lop = "12A";

    public void hocBai(){
        System.out.println("Hoc sinh dang hoc bai:");
    }

    public static void main(String[] args) {
        HocSinh_Bai1NhanBiet hocSinh = new HocSinh_Bai1NhanBiet();

//        hocSinh.ten = "Huynh";
//        hocSinh.tuoi= 17;
//        hocSinh.lop = "12A1";

        hocSinh.hocBai();
        System.out.println("Ten: " + hocSinh.ten);
        System.out.println("Tuoi: " + hocSinh.tuoi);
        System.out.println("Lop: " + hocSinh.lop);


    }
}
