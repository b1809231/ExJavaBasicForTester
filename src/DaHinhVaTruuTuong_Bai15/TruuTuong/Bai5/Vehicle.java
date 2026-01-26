package DaHinhVaTruuTuong_Bai15.TruuTuong.Bai5;

abstract class Vehicle {
//    🟡 Bài 5 – Abstract + method dùng chung
//    Yêu cầu:
//    Abstract class Vehicle
//    abstract method move()
//    method thường startEngine()
//    Class con:
//    Car
//            Bike
//    Test:
//    Vehicle v1 = new Car();
//    Vehicle v2 = new Bike();
//
//    v1.startEngine();
//    v1.move();
//
//    v2.startEngine();
//    v2.move();

    abstract void move();
    public void startEngine(){System.out.println("Engine started");};




}
