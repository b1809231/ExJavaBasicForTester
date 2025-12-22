package BaiTap3_ToanTuvaEpKieu_Bai4;

public class ToanTu {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 50;

        //Toán tử số học => trả kết quả số
        System.out.println("a+b = "+(a+b));
        System.out.println("a-b = "+(a-b));
        System.out.println("a*b = "+(a*b));
        System.out.println("a/b = "+ (float)a/(float)b);
        System.out.println("d mod c ="+ d%c);
        System.out.println("a giảm dần = "+ (a--));
        System.out.println("a tăng dần = "+ (a++));
        System.out.println("a cộng gán gtri =" + (a+=b));
        System.out.println("a trừ gán gtri =" + (a-=b));
        int e = 25;
        int f = 10;
        System.out.println("e nhân gán gtri =" + (e*=f));
        System.out.println("e chia gán gtri =" + (e/=f));
        System.out.println("e lấy số dư gán gtri =" +(e%=f));

        //Toán tử qua hệ => trả kết qủa dạng boolean (true/false)
        System.out.println("--------------------------------");
        int g = 50;
        int h = 90;
        System.out.println("g = h đúng ko: "+ (g==h));
        System.out.println("g != h khác ko: "+ (g!=h));
        System.out.println("g > h đúng ko: "+(g>h));
        System.out.println("g < h đúng ko: "+(g<h));
        System.out.println("g >= h đúng ko: "+(g>=h));
        System.out.println("g <= h đúng ko: "+(g<=h));

        //Toán tử logic => trả kết qủa dạng boolean (true/false)
        System.out.println("--------------------------------");
        int i = 2;
        int j = 5;

        System.out.println("i và j > 5 đúng không: " +(i>5 && j>5)); // toán tử và tất cả đúng thì đúng hết, 1 cái sai thì sai hết
        System.out.println("i hoặc j >= 5 đúng không: " +(i>5 || j>=5));//toán tử hoặc tất cả sai thì sai hết, 1 cái đúng thì đúng hết















    }
}
