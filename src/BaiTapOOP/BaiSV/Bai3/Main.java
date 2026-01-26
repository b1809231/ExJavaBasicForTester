package BaiTapOOP.BaiSV.Bai3;
import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public class TestSinhVien {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nhập số sinh viên: ");
            int n = sc.nextInt();
            sc.nextLine();

            SinhVien[] ds = new SinhVien[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Sinh viên " + (i + 1));
                System.out.print("Mã SV: ");
                int ma = sc.nextInt();
                sc.nextLine();

                System.out.print("Họ tên: ");
                String ten = sc.nextLine();

                System.out.print("Địa chỉ: ");
                String dc = sc.nextLine();

                System.out.print("SĐT (7 số): ");
                String sdt = sc.nextLine();

                ds[i] = new SinhVien(ma, ten, dc, sdt);
            }

            // Sắp xếp tăng dần theo mã SV
            Arrays.sort(ds, (a, b) -> a.getMaSV() - b.getMaSV());

            System.out.println("\nDanh sách sinh viên:");
            for (SinhVien sv : ds) {
                System.out.println(sv);
            }
        }
    }

}
