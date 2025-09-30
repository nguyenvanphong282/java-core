package khainiemkethua;

import java.util.Date;

public class HocSinh extends ConNguoi{
    private String tenLop;
    private String tenTruong;
    private String diaChiTruongHoc;

    public HocSinh(String hoVaTen, Date ngaySinh, String diaChi) {
        super(hoVaTen, ngaySinh, diaChi);
    }

    public HocSinh(String hoVaTen, Date ngaySinh, String diaChi, String tenLop, String tenTruong, String diaChiTruongHoc) {
        super(hoVaTen, ngaySinh, diaChi);
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
        this.diaChiTruongHoc = diaChiTruongHoc;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public String getDiaChiTruongHoc() {
        return diaChiTruongHoc;
    }

    public void setDiaChiTruongHoc(String diaChiTruongHoc) {
        this.diaChiTruongHoc = diaChiTruongHoc;
    }
}
