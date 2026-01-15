package BaiTapOOP.BaiTapJavaOOP2.persion;

public class Person {
//    + Tạo class "Person" với các thông tin: name, age, gender, address, phone
//	+ Hàm xây dựng và hàm get tương ứng để giải quyết bài toán theo yêu cầu

    private String name;
    private int age;
    private boolean gender;
    private String address;
    private String phone;

    public Person(String name, int age, boolean gender, String address,String phone){
        this.name = name;
        this.age = age;
        this.gender=gender;
        this.address = address;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean getGender(){
        return gender;
    }

    private String getAddress(){
        return address;
    }
    private String getPhone(){
        return phone;
    }
    void showInfo(){
        System.out.println("Ten nhan vien: "+ getName());
        System.out.println("Tuoi: "+ getAge());
        System.out.println("Gioi tinh: "+ getGender());
        System.out.println("Dia chi: "+ getAddress());
        System.out.println("So dien thoai: "+ getPhone());

    }



}
