package khainiemkethua;

import java.util.Date;

public class ConNguoi {
    private String hoVaTen;
    private Date ngaySinh;
    private String diaChi;

    public ConNguoi(String hoVaTen, Date ngaySinh, String diaChi) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void an(){
        System.out.println("mam mam mam mam mam ....");
    }

    public void ngu(){
        System.out.println("kho kho kho kho kho ....");
    }

    public void uong(){
        System.out.println("uc uc uc uc uc ....");
    }
}
