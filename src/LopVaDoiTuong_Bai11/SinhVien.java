package LopVaDoiTuong_Bai11;

public class SinhVien {

//    Yêu cầu:
//            1 Tạo class SinhVien//
//2 Thuộc tính://
//    ten//
//            tuoi//
//3 Phương thức://
//    hienThiThongTin() → in tên và tuổi//
//4 Trong main://
//    Tạo 1 đối tượng SinhVien//
//    Gán giá trị cho thuộc tính//
//    Gọi phương thức hiển thị//
//🎯 Mục tiêu: biết tạo object và gọi phương thức
// 5 Trong main:
//
//    Tạo 2 sinh viên khác nhau
//
//    Mỗi sinh viên có tên & tuổi khác nhau
//
//    Gọi hienThiThongTin() cho từng sinh viên

    String ten;
    int tuoi;

    public void hienThiThongTin(){
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: "+ tuoi);
    }


    public static void main(String[] args) {
        //Bai 1
        SinhVien sv = new SinhVien();
        sv.ten = "Kim";
        sv.tuoi = 20;
        sv.hienThiThongTin();
        //Bai 2
        SinhVien sv2 = new SinhVien();
        sv2.ten = "Hoa";
        sv2.tuoi = 12;
        sv2.hienThiThongTin();
    }


}
