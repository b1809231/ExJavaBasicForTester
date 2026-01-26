package DaHinhVaTruuTuong_Bai15.DaHinh.Bai3;

import DaHinhVaTruuTuong_Bai15.DaHinh.Bai3.Shape;

public class Circle extends Shape {
    private float bk;

    public Circle(int bk) {
        this.bk = bk;
    }


    public double area() {
        return Math.pow(bk,2)*Math.PI;
    }

}
