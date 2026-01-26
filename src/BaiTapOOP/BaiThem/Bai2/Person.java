package BaiTapOOP.BaiThem.Bai2;

public class Person {
//    🟢 BÀI 2 – KẾ THỪA (Inheritance)
//
//    Yêu cầu:
//    Class Person
//    name
//            age
//    method showInfo()
//    Class Student kế thừa Person
//    thêm studentId
//    Test:
//    Student s = new Student();
//    s.setName("Lan");
//    s.setAge(20);
//    s.setStudentId("SV01");
//    s.showInfo();
//👉 Mục tiêu: tái sử dụng code

    private String name;
    private int age;

//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo(){
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: "+age);

    }

}
