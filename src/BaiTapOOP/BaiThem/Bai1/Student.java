package BaiTapOOP.BaiThem.Bai1;

public class Student {
//    🟢 BÀI 1 – ĐÓNG GÓI (Encapsulation)
//
//    Yêu cầu:
//    Tạo class Student
//
//Thuộc tính:
//    id
//            name
//    score
//    Các thuộc tính để private
//
//    Tạo getter / setter
//    Không cho score < 0 hoặc score > 10
//
//    Test:
//    Student s = new Student();
//    s.setName("Nam");
//    s.setScore(9);
//
//    System.out.println(s.getName());
//    System.out.println(s.getScore());
//
//
//👉 Mục tiêu: che giấu dữ liệu + kiểm soát truy cập

    private int id;
    private String name;
    private float score;

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        if (score >=0 && score <= 10){
            this.score = score;
        }
        else System.out.println("Điểm ko hợp lệ");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
