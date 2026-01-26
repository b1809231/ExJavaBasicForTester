package DaHinhVaTruuTuong_Bai15.TruuTuong.Bai5;

public class main {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.startEngine();
        v1.move();

        v2.startEngine();
        v2.move();
    }
}
