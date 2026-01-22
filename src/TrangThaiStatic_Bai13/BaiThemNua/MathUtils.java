package TrangThaiStatic_Bai13.BaiThemNua;

public class MathUtils {
//    🧩 Bài 3: Phương thức static
//
//    Yêu cầu:
//            1. Tạo class MathUtils có:
//    phương thức static int sum(int a, int b)
//    phương thức static int multiply(int a, int b)
//2. Gọi các phương thức này trong main mà không cần tạo object.
//            👉 Mục tiêu: hiểu cách gọi ClassName.method().

    static int sum(int a, int b){
        return a+b;
    }

    static int multiply(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(multiply(5,10));
    }
}
