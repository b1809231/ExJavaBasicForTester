package DaHinhVaTruuTuong_Bai15.TruuTuong.Bai2;

abstract class Employee {
//    🟢 Bài 2 – Abstract class có thuộc tính
//
//            Yêu cầu:
//    Abstract class Employee
//    thuộc tính name
//            constructor
//    abstract method double getSalary()
//    Class con:
//    FullTimeEmployee (lương cố định)
//    PartTimeEmployee (số giờ * tiền/giờ)
//    Test:
//    Employee e1 = new FullTimeEmployee("An", 10000000);
//    Employee e2 = new PartTimeEmployee("Binh", 80, 50000);
//
//    System.out.println(e1.getSalary());
//    System.out.println(e2.getSalary());
//
//
//👉 Mục tiêu: abstract + constructor + override

    private String name;

    public Employee(String name) {
        this.name = name;
    }
    abstract  double getSalary();
}
