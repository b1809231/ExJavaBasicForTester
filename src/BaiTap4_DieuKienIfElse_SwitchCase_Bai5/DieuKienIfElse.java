package BaiTap4_DieuKienIfElse_SwitchCase_Bai5;

public class DieuKienIfElse {
    public static void main(String[] args) {
        int number = 100;

        //Dieu kien if chayj tu tren xuong nen truong hop bang 100 va lon hon 50 dung
        //Nhung no se lay ket qua dau
        if(number ==100){
            System.out.println("Dung so 100");
        } else if (number >50) {
            System.out.println("So lon hon 50");
        }else if(number <50){
            System.out.println("So nho hon 50");
        }else {System.out.println("So nam ngoai dieu kien");}
    }
}
