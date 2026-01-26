package DaHinhVaTruuTuong_Bai15.DaHinh.Bai1_2;

public class main {
//    public static void main(String[] args) {
//        Animal a1 = new Dog();
//        Animal a2 = new Cat();
//        a1.sound();
//        a2.sound();
//    }

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cow()
        };

        for (Animal a : animals) {
            a.sound();
        }
    }
    }

