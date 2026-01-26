package DaHinhVaTruuTuong_Bai15.TruuTuong.Bai2;

public class main {
    public static void main(String[] args) {


    Employee e1 = new FullTimeEmployee("An", 10000000);
    Employee e2 = new PartTimeEmployee("Binh", 80, 50000);

    System.out.println(e1.getSalary());
    System.out.println(e2.getSalary());
    }
}
