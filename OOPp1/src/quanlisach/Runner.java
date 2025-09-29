package quanlisach;

public class Runner {
    public static void main(String[] args) {
        Ngay n1 = new Ngay(1,1,1999);
        TacGia tacGia1 = new TacGia("PhongIT",n1);
        Sach s1 = new Sach("Lap trinh Java",tacGia1,400,1990);
        System.out.println(s1.getTenSach());
        System.out.println("Gia sach "+s1.getTenSach()+" la: "+s1.getGiaSach());
    }
}
