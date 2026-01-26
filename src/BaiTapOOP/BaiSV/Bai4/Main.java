package BaiTapOOP.BaiSV.Bai4;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        HangThucPham htp = new HangThucPham(
                "TP01",
                "Sữa hộp",
                15000,
                new Date(124, 0, 1),
                new Date(124, 11, 31)
        );

        System.out.println(htp);
    }
}
