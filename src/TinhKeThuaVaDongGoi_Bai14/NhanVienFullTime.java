package TinhKeThuaVaDongGoi_Bai14;

public class NhanVienFullTime extends NhanVien{
    //    2. Class NhanVienFullTime kế thừa NhanVien
//    Thêm thuộc tính:
//    phuCap
//    Phương thức:
//    tinhLuongThucLanh()
//3. Trong main:
//    Tạo đối tượng NhanVienFullTime
//    Gán dữ liệu
//    In lương thực lãnh

    private float phuCap;

    public NhanVienFullTime(String ten, float luong, float phuCap) {
        super(ten, luong);
        this.phuCap = phuCap;
    }


    public void luongThucLanh(){
        System.out.println("luong thang nay cua ban: "+ (getLuong()+ phuCap));
    }

    public void hienThiThongTin(){
        System.out.println("Ten: "+ getTen());
        System.out.println("Luong: "+ getLuong());
        System.out.println("Luong phu cap: "+ phuCap);
    }

    public static void main(String[] args) {
        NhanVienFullTime nv = new NhanVienFullTime("Hoa", -4545, 2000f);
        nv.hienThiThongTin();
        nv.luongThucLanh();
    }

}
