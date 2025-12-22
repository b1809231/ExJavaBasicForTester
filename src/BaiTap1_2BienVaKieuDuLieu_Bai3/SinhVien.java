package BaiTap1_2BienVaKieuDuLieu_Bai3;

public class SinhVien {
    public static String lop = "Công nghệ sinh học"; // Biến tĩnh
    public String eMail ="sinhvien2025@gmail.com"; //Biến toàn cục

    public void inThongTin(){
        String namHoc= "2025";
        System.out.println("Năm học: "+namHoc);  //Biến cục bộ

    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();  // Tạo đối tượng để gọi biến toàn cục
        sv.inThongTin();
        System.out.println("Email: "+sv.eMail);
        System.out.println("Ngành: "+ lop); //Trong 1 class biến static gọi trực tiếp

        //gọi biến static khác lớp tenLop.tenBien
        // gọi từ class ThongTin sang
        System.out.println(ThongTin.id);
        System.out.println(ThongTin.hoTen);
        System.out.println(ThongTin.tuoi);

    }
    }
