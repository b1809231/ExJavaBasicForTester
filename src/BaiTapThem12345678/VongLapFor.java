package BaiTapThem;

public class VongLapFor {
    public static void main(String[] args) {

        System.out.println("In các số từ 1 → 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        System.out.println("In các số chẵn từ 0 → 20");
        for (int j = 0; j <= 20; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }

        System.out.println("Tính tổng các số từ 1 → 10");
        int tong = 0;
        for (int k = 1; k <= 10; k++) {
            tong += k;
        }
        System.out.println(tong);

    }
}
