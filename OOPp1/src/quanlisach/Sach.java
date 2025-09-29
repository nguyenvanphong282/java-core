package quanlisach;

public class Sach {
    private String tenSach;
    private TacGia tacGia;
    private double giaSach;
    private int namXuatBan;

    public Sach(String tenSach, TacGia tacGia, double giaSach, int namXuatBan) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.giaSach = giaSach;
        this.namXuatBan = namXuatBan;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public double getGiaSach() {
        return giaSach;
    }

    public void setGiaSach(double giaSach) {
        this.giaSach = giaSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
    public double giamGia(double chiSo){
        if(this.giaSach > 200){
            return (chiSo/100) * this.giaSach;
        }else {
            return 0;
        }
    }
    public double giaSauKhiGiam(double chiSo){
        return this.giaSach - giamGia(chiSo);
    }
    public boolean checkTrungNamXuatBan(Sach sachKhac){
        return this.namXuatBan == sachKhac.namXuatBan;
    }
}
