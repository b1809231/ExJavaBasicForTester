package DaHinhVaTruuTuong_Bai15.TruuTuong.Bai2;

public class PartTimeEmployee extends Employee{
    private double sogio;
    private double tiengio;



    public PartTimeEmployee(String name, double sogio, int tiengio) {
        super(name);
        this.tiengio = tiengio;
        this.sogio = sogio;
    }



    @Override
    double getSalary() {
        return sogio*tiengio;
    }
}
