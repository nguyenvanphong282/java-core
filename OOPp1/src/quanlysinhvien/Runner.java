package quanlysinhvien;

public class Runner {
    public static void main(String[] args) {
        NgaySinh ngaySinh1 = new NgaySinh(1,1,1990);
        NgaySinh ngaySinh2 = new NgaySinh(2,2,1991);
        NgaySinh ngaySinh3 = new NgaySinh(2,3,2000);

        LopHoc lopHoc1 = new LopHoc("CN2301A", "Công nghệ thông tin");
        LopHoc lopHoc2 = new LopHoc("KM23A", "Công nghệ thông tin");
        LopHoc lopHoc3 = new LopHoc("XD2301B", "Viện xây dựng");

        SinhVien sinhVien1 = new SinhVien("Nguyen Van A", "0822011", ngaySinh1, lopHoc1,"Nam", 2.4);
        SinhVien sinhVien2 = new SinhVien("Nguyen Thi C", "0822111", ngaySinh2, lopHoc2,"Nu", 4);
        SinhVien sinhVien3 = new SinhVien("Nguyen Thanh Po", "0822444", ngaySinh3, lopHoc3,"Nam", 3);

        sinhVien1.hocLuc();
        sinhVien2.hocLuc();
        sinhVien3.hocLuc();

        System.out.println("--------------------");

        System.out.print("Sinh vien: "+
                sinhVien1.getHoTen()+
                " co ngay sinh "+
                sinhVien1.getNgaySinh().getDay()+
                "/"+
                sinhVien1.getNgaySinh().getMonth()+
                "/"+
                sinhVien1.getNgaySinh().getYear()+
                " hoc o lop "+
                sinhVien1.getLopHoc().getTenLop()+
                " voi so diem "+
                sinhVien1.getDiemTrungBinh()+
                " va hoc luc la ");
        sinhVien1.hocLuc();

        System.out.print("Sinh vien: "+
                sinhVien2.getHoTen()+
                " co ngay sinh "+
                sinhVien2.getNgaySinh().getDay()+
                "/"+
                sinhVien2.getNgaySinh().getMonth()+
                "/"+
                sinhVien2.getNgaySinh().getYear()+
                " hoc o lop "+
                sinhVien2.getLopHoc().getTenLop()+
                " voi so diem "+
                sinhVien2.getDiemTrungBinh()+
                " va hoc luc la ");
        sinhVien2.hocLuc();

        System.out.print("Sinh vien: "+
                sinhVien3.getHoTen()+
                " co ngay sinh "+
                sinhVien3.getNgaySinh().getDay()+
                "/"+
                sinhVien3.getNgaySinh().getMonth()+
                "/"+
                sinhVien3.getNgaySinh().getYear()+
                " hoc o lop "+
                sinhVien3.getLopHoc().getTenLop()+
                " voi so diem "+
                sinhVien3.getDiemTrungBinh()+
                " va hoc luc la ");
        sinhVien3.hocLuc();
    }
}
