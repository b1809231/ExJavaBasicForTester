package DaHinhVaTruuTuong_Bai15.TruuTuong;

abstract class Animal {
//    🟢 Bài 1 – Abstract class cơ bản
//            Yêu cầu:
//    Tạo abstract class Animal
//    abstract method sound()
//    method thường sleep() (in: "Animal is sleeping")
//    Tạo class Dog, Cat kế thừa Animal
//            Override sound()
//    Test:
//    Animal a1 = new Dog();
//    Animal a2 = new Cat();
//
//    a1.sound();
//    a2.sound();
//    a1.sleep();
//
//
//👉 Mục tiêu: hiểu abstract method bắt buộc override

    void sound(){
        System.out.println("tieng kieu");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }
}
