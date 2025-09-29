package getterandsetter;

public class Runner {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(20, 12, 2004);
        MyDate myDate2 = new MyDate(21, 11, 2003);
        System.out.println("Ngay: "+myDate1.getDay());
        System.out.println("Thang: "+myDate1.getMonth());
        System.out.println("Nam: "+myDate1.getYear());
        System.out.println(myDate1.toString());
        System.out.println("-------------------");
        System.out.println("Ngay: "+myDate2.getDay());
        System.out.println("Thang: "+myDate2.getMonth());
        System.out.println("Nam: "+myDate2.getYear());
        System.out.println(myDate2.toString());
        System.out.println("--------------------");
        myDate1.setDay(31);
        System.out.println("Ngay sau khi chinh sua: "+myDate1.getDay());
        System.out.println("---------------------");
        System.out.println(myDate1.toString());
    }
}
