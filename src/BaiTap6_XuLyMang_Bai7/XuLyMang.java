package BaiTap6_XuLyMang_Bai7;

public class XuLyMang {
    public static void main(String[] args) {

        int number[] = new int[30];
        int j = 0;


        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                number[j] = i;
                j++;
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);

        }


    }
}
