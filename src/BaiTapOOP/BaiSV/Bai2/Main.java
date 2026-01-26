package BaiTapOOP.BaiSV.Bai2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
//    Xây dựng class chứa hàm main: tạo 3 đối tượng sinh viên sv1, sv2, sv3,
//    trong đó: sv1 chứa thông tin của chính mình (tạo bằng constructor đủ thông số, thông tin
//    biết rồi khỏi nhập từ bàn phím).
//    sv2 là thông tin người bạn thân nhất của em (tạo bằng constructor đủ thông số,
//    thông tin biết rồi khỏi nhập từ bàn phím). sv3 tạo bằng constructor mặc định.
//    Nhập các thông tin cho sv3 từ bàn phím rồi sau đó dùng các setter để gán vào cho các thuộc tính tương ứng. In bảng danh sách sinh viên gồm 4 cột là MSSV, họ tên, điểm LT”, điểm TH, điểm TB (bảng có 3 dòng cho 3 sinh viên)
//}*/


    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(100, "Tran Kim",2f,  5f);
        System.out.println(sv1.toString());

        System.out.println("-------------");
        SinhVien sv2 = new SinhVien();
        sv2.setMaSV(101);
        sv2.setHoTen("Nguyen Tram");
        sv2.setDiemLT(4f);
        sv2.setDiemTH(6f);
        System.out.println(sv2.toString());

        System.out.println("-------------");
        SinhVien sv3 = new SinhVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: " );
        sv3.setMaSV(sc.nextInt());
        System.out.println("Nhập Tên sinh viên: " );
        sv3.setHoTen(sc.next());
        System.out.println("Điểm lý thuyết: " );
        sv3.setDiemLT(sc.nextFloat());
        System.out.println("Điểm thực hành: " );
        sv3.setDiemTH(sc.nextFloat());
        System.out.println(sv3.toString());



    }

}
