package TrangThaiStatic_Bai13.BaiThemNua;

public class Person {
//    🧩 Bài 4: static vs non-static
//    Yêu cầu:
//            1. Tạo class Person:
//    name (non-static)
//    static int population
//2. Mỗi lần tạo Person mới:
//    population++
//            3. Viết method:
//    showName() → non-static
//    static showPopulation()
//
//👉 Câu hỏi:
//            ❓ Vì sao static showPopulation() không gọi trực tiếp được name?

    String name;
    static int population;

    Person(){
        population++;
    }

    public void showName(){
        System.out.println(name);
    }

    static void showPopulation(){
        //name; //Loi
        System.out.println(population);
    }

    //Tra loicau hoi: do name ko phai bien static, nen muon goi phai tao object goi





}
