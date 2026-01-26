package BaiTapOOP.BaiThem.Bai3;

public class Animal {
//    🟢 BÀI 3 – ĐA HÌNH (Polymorphism)
//
//    Yêu cầu:
//    Class Animal
//    method sound()
//    Class con:
//    Dog
//            Cat
//    Override sound()
//    Test:
//    Animal a1 = new Dog();
//    Animal a2 = new Cat();
//
//    a1.sound();
//    a2.sound();
//
//
//👉 Mục tiêu: cùng method – hành vi khác nhau

    public void sound(){
        System.out.println("Kêu");
    }
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}