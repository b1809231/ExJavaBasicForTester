package BaiTapOOP.BaiSV.Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();

        Scanner sc = new Scanner(System.in);
        hcn.setCd(sc.nextFloat());
        hcn.setCr(sc.nextFloat());
        System.out.println(hcn.toString());
    }
}
