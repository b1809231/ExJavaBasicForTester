package BaiTap7_Collection_Bai8;

import java.util.ArrayList;

public class LuuThongTinVaoArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrLNhanVien = new ArrayList<>();

        arrLNhanVien.add("Nguyen Thi Hoang Quyen");
        arrLNhanVien.add("25 tuoi");
        arrLNhanVien.add("Can Tho");
        arrLNhanVien.add("Back end");

        System.out.println("THONG TIN NHAN VIEN");
        for (String value : arrLNhanVien){
            System.out.println(value);
        }
    }


}
