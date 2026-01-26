package DaHinhVaTruuTuong_Bai15.TruuTuong.Bai3;

public class Rectangle extends Shape{

    private double cd;
    private double cr;

    public Rectangle(int cd, int cr) {
        this.cd =cd;
        this.cr = cr;
    }

    @Override
    double area() {
        return cd*cr;
    }


}
