package PhamViTruyCapVaHamXayDung_Bai12.bai2;

public class SinhVien extends Nguoi {
    //2. Tạo class SinhVien kế thừa Nguoi
//3. Trong SinhVien, thử truy cập:
//    ten
//            tuoi
//🎯 Mục tiêu: phân biệt protected và private
    public static void main(String[] args) {
        Nguoi sv = new Nguoi();
        System.out.println(sv.ten);
       // System.out.println(sv.tuoi);//private nên chỉ truy cập đc ở lớp cha thôi

    }

}
