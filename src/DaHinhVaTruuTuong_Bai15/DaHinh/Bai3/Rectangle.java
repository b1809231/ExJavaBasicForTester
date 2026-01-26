package DaHinhVaTruuTuong_Bai15.DaHinh.Bai3;

public class Rectangle extends Shape {

    private double cd;
    private double cr;

    public Rectangle(double cd, double cr) {
        this.cd =cd;
        this.cr = cr;
    }

    @Override
    public double area() {
        return cd*cr;
    }


}
