package hashcodeandequals;

public class Runner {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(20,12,2004);
        MyDate myDate2 = new MyDate(21,11,2003);
        MyDate myDate3 = new MyDate(20,1,2004);
        MyDate myDate4 = new MyDate(20,12,2004);
        MyDate myDate5 = new MyDate(1,1,2001);
        MyDate myDate6 = new MyDate(1,1,2001);
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
        myDate1.setDay(20);
        System.out.println(myDate1.toString());
        System.out.println("---------------------");
        System.out.println("ket qua so sanh giua myDate1 va myDate2 la: "+myDate1.equals(myDate2));
        System.out.println("ket qua so sanh giua myDate1 va myDate3 la: "+myDate1.equals(myDate3));
        System.out.println("ket qua so sanh giua myDate1 va myDate4 la: "+myDate1.equals(myDate4));
        System.out.println("ket qua so sanh giua myDate2 va myDate3 la: "+myDate2.equals(myDate3));
        System.out.println("ket qua so sanh giua myDate2 va myDate4 la: "+myDate2.equals(myDate4));
        System.out.println(myDate5.equals(myDate6));
        System.out.println("======================");
        System.out.println("Hashcode 1: "+myDate1.hashCode());
        System.out.println("Hashcode 2: "+myDate2.hashCode());
        System.out.println("Hashcode 3: "+myDate3.hashCode());
        System.out.println("Hashcode 4: "+myDate4.hashCode());
        System.out.println("Hashcode 5: "+myDate5.hashCode());
        System.out.println("Hashcode 6: "+myDate6.hashCode());
    }
}
