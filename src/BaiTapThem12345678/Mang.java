package BaiTapThem;

public class Mang {
    public static void main(String[] args) {
        int mang[] ={1,10,9,15,20};
        float tong = 0;

        System.out.println("Duyet amng in ra");
        for(int i=0; i< mang.length; i++){
            System.out.println(mang[i]);
            tong += mang[i];
        }

        System.out.println("Tong cac phan tu cua mang = "+ tong);
    }

}
