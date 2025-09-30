package khainiemkethua;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date ngaySinh = simpleDateFormat.parse("1/1/2000");
        ConNguoi conNguoi1 = new ConNguoi("Nguyen Van A", ngaySinh, "TP. Ho Chi Minh");
        System.out.print("\nBan "+
                conNguoi1.getHoVaTen()+
                " co ngay sinh la "+
                conNguoi1.getNgaySinh()+
                " va o "+
                conNguoi1.getDiaChi()+
                " hien tai moi di hoc ve va dang ");
        conNguoi1.an();
        System.out.print("\nSau do ");
        conNguoi1.uong();
        System.out.print("\nVa cuoi cung la");
        conNguoi1.ngu();
    }
}
