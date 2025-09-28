package nhanxuatdatavatoantu;

import java.util.Scanner;

public class ToanTuMotNgoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        boolean c = true;

        System.out.println(" -A = " +(-a));
        System.out.println(" -B = " +(-b));
        System.out.println(" !C = "+ (!c));
        System.out.println((-a) + " = " + (-b) +" : "+(!c));
        System.out.println("--------------------------");
        System.out.println(" A = "+ a);// vd: 5
        System.out.println(" A++ = "+ (a++)); //a++ = 5 (print truoc khi tang)
        System.out.println(a); //a=6
        System.out.println(" A - 1 = "+(a-1)); // a-1 =5
        System.out.println(a); // a=6
        System.out.println(" ++A = "+ (++a)); //++a=7 (tang truoc khi print)
        System.out.println(a); //a=7
        System.out.println("--------------------------");
        System.out.println(" A-- = "+ (a--)); //a=7
        System.out.println(a); //a=6
        System.out.println(" --A = "+ (--a)); //a=5
        System.out.println(a); //a=5
    }
}
