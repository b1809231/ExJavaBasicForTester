package BaiTapOOP.BaiThem.Bai2;

public class Student extends Person{

    private String studentId;

//    public Student(String name, int age, String studentId) {
//        super(name, age);
//        this.studentId = studentId;
//    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void ThongTíninhVien(){
        showInfo();
        System.out.println("studentId: "+getStudentId());

    }


}
