package DaHinhVaTruuTuong_Bai15.TruuTuong.Bai3;

public class Circle extends Shape{

    private float bk;

    public Circle(int bk) {
        this.bk = bk;
    }

    @Override
    double area() {
        return Math.pow(bk,2)*Math.PI;
    }
}
