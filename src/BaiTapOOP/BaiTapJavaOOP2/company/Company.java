package BaiTapOOP.BaiTapJavaOOP2.company;

import BaiTapOOP.BaiTapJavaOOP2.persion.Person;

public class Company {
    public static void main(String[] args) {
        Person cp = new Person("Hoa", 234, false, "Dong Thap", "358935794");
        System.out.println("Ten nhan vien: " + cp.getName());
        System.out.println("Tuoi: " + cp.getAge());
        System.out.println("Gioi tinh: " + cp.getGender());
       // System.out.println("Gioi tinh: " + cp.getAaddress);
    }

}
