package BaiTapOOP.BaiSV.Bai3;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private String diaChi;
    private String soDienThoai;

    public SinhVien() {
        maSV = 0;
        hoTen = "";
        diaChi = "";
        soDienThoai = "0000000";
    }

    public SinhVien(int maSV, String hoTen, String diaChi, String soDienThoai) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        setSoDienThoai(soDienThoai);
    }

    // Getter / Setter
    public int getMaSV() {
        return maSV;
    }

    public void setSoDienThoai(String sdt) {
        if (sdt != null && sdt.matches("\\d{7}"))
            this.soDienThoai = sdt;
        else
            this.soDienThoai = "0000000";
    }

    @Override
    public String toString() {
        return maSV + " - " + hoTen + " - " + diaChi + " - " + soDienThoai;
    }
}
