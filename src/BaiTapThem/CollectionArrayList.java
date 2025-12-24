package BaiTapThem;

import java.util.ArrayList;

public class CollectionArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrLSinhVien = new ArrayList<>();

        arrLSinhVien.add("Tran Thien Kim");
        arrLSinhVien.add("Tran Minh tien");
        arrLSinhVien.add("Nguyen Ngoc Tram");
        arrLSinhVien.add("Doan Giao");
        arrLSinhVien.add("Tran Tu Nhu");

        for(String value: arrLSinhVien){
            System.out.println(value);
        }

        System.out.println("So sinh vien la: " + arrLSinhVien.size());

    }
}
