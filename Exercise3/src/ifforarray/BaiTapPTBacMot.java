package ifforarray;

import java.util.Scanner;

public class BaiTapPTBacMot {
    public static void main(String[] args) {
        double a,b,x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a=sc.nextDouble();
        System.out.print("Nhap b: ");
        b=sc.nextDouble();
        //a = 0 -> b=0 -> vo so nghiem
        //      -> b!=0 -> vo nghiem
        //a!=0 -> x=-b/a
        if(a==0){
            if(b==0) {
                System.out.println("PT vo so nghiem!");
            }else {
                System.out.println("PT vo nghiem!");
            }
        }else {
            x = -b/a;
            System.out.println("Ket qua cua PT = "+x);
        }
    }
}
