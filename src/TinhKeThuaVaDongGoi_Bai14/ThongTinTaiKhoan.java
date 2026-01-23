package TinhKeThuaVaDongGoi_Bai14;

public class ThongTinTaiKhoan {
    public static void main(String[] args) {
        TaiKhoan tk = new TaiKhoan("justin");
        System.out.println(tk.getSoTaiKhoan());
        tk.napTien(2000);
        tk.rutTien(2000);
        System.out.println("So du con lai: "+tk.getSoDu());

    }
}
