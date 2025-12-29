package BaiTapThem;

import java.util.Arrays;

public class XulyChuoi {
    public static void main(String[] args) {

        System.out.println("ĐỘ DÀI VÀ CHUẨN HOÁ CHUỖI");

        String str= "   Java Basic Programming   ";

        //in độ dài chuỗi ban đầu
        System.out.println("- ĐỘ dài chuỗi ban đầu là: "+ str.length());
        //Xoá khoảng trắng và in độ dài chuỗi sau khi xoá
        System.out.println("- Chuỗi sau khi xoá khoảng trắng: "+ str.trim());
        //độ dài chuỗi sau khi xoá khoảng trắng
        System.out.println("- ĐỘ dài chuỗi sau khi xoá khoảng trắng: "+ str.trim().length());


        System.out.println("SO SÁNH HAI CHUỖI");
        //So sánh 2 chuỗi
        String expected = "Login success";
        String actual = "login Success";

        //So sánh phân biệt hoa thường
        System.out.println("- So sánh mong đợi và thực tế giống nhau ko:" + expected.equals(actual) );
        //So sánh ko phân biệt hoa thường
        System.out.println("- So sánh mong đợi và thực tế giống nhau ko:" + expected.equalsIgnoreCase(actual) );


        System.out.println("KIỂM TRA NỘI DUNG CHUỖI");
        //Kiểm tra nội dung chuỗi
        String ctStr = "Error: Username or password is incorrect";


        System.out.println("- Chuỗi có chứa Error ko: " + ctStr.contains("Error"));
        System.out.println("- Chuỗi có chứa success ko: " + ctStr.contains("success"));

        System.out.println("CẮT CHUỖI");
        String trimStr = "JAVA-TESTER-2025";
        //in ừng giá trị sau khi cắt
        System.out.println("- Mảng chứa các phần tử sau khi cắt là: "+ Arrays.toString(trimStr.split("-")));
        System.out.println("- Phần tử thứ nhất: "+ trimStr.split("-")[0]);
        System.out.println("- Phần tử thứ hai: "+ trimStr.split("-")[1]);
        System.out.println("- Phần tử thứ ba: "+ trimStr.split("-")[2]);

        System.out.println("THAY THẾ VÀ CHUẨN HOÁ DỮ LIỆU");
        String crpStr= "email: test@gmail.com";
        //thay email bằng Email
        System.out.println("- Sau khi thay email = Email: " + crpStr.replace("email", "Email"));


        System.out.println("KIỂM TRA CHUỖI RỖNG");
        String s1 = "";
        String s2 = "   ";
        System.out.println("- Kiểm tra rỗng chuỗi s1: " + s1.isEmpty()); //Không có giá trị trong chuỗi
        System.out.println("- Kiểm tra rỗng chuỗi s2: " + s2.isEmpty()); //Nhận giá trị space

        System.out.println("ĐIẾM KÝ TỰ");
        String dem= "java programming";
        int TongSoKyTua = 0;

        for (int i=0 ; i< dem.length(); i++){
            if(dem.charAt(i) == 'a'){
                TongSoKyTua++;
            }
        }
        System.out.println("- Tổng số ký tự a: "+ TongSoKyTua);
    }
}
