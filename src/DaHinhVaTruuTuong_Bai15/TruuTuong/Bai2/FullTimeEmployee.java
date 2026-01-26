package DaHinhVaTruuTuong_Bai15.TruuTuong.Bai2;

public class FullTimeEmployee extends Employee{
    double salary;
    public FullTimeEmployee(String name, float salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    double getSalary() {
        return salary;
    }
}
