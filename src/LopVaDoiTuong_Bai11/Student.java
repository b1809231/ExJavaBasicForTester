package LopVaDoiTuong_Bai11;

import java.util.Scanner;

public class Student {
    String name ;
    int age;

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        age = sc.nextInt();
    }

    static void main() {

    }
    public static void main(String[] args) {
        Student st  = new Student();
        st.getInformation();
        st.display();
    }
}
