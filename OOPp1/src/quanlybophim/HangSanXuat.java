package quanlybophim;

public class HangSanXuat {
    private String tenHangSX;
    private String quocGia;

    public HangSanXuat(String tenHangSX, String quocGia) {
        this.tenHangSX = tenHangSX;
        this.quocGia = quocGia;
    }

    public String getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }
}
