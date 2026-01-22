package TrangThaiStatic_Bai13.BaiThemNua;

public class User {
//    🔥 Bài 7: Tổng hợp (khó hơn)
//    Yêu cầu:
//            1. Tạo class User:
//    id (int)
//    name (String)
//    static int autoId
//2. Mỗi lần tạo User:
//    id tự động tăng (autoId++)
//    Tạo 5 user và in ra:
//    ID: 1 - Name: A
//    ID: 2 - Name: B
//    ...
//            👉 Mục tiêu: áp dụng static vào bài toán thực tế.

    int id;
    String name;
    static int autoId;

    User(){
        id = autoId ++;
    }

    public void showInfo(){
        System.out.println("ID: " + autoId + "- Name: "+ name);
    }

    public static void main(String[] args) {
        User us1 = new User();
        us1.name = "Hoa";
        us1.showInfo();

        User us2 = new User();
        us1.name = "Ngan";
        us1.showInfo();

    }
}
