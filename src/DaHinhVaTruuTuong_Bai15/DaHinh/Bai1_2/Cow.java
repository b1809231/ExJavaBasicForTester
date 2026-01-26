package DaHinhVaTruuTuong_Bai15.DaHinh.Bai1_2;

public class Cow extends Animal {
//    🟢 Bài 2 – Đa hình với mảng object
//    Yêu cầu:
//    Vẫn dùng Animal
//    Thêm class Cow
//    Tạo mảng Animal[]
//    Test:
//    Animal[] animals = {
//            new Dog(),
//            new Cat(),
//            new Cow()
//    };
//    for (Animal a : animals) {
//        a.sound();
//    }
//👉 Không dùng if / instanceof
@Override
public void sound() {
    System.out.println("Cow moos");
}
}

