package ifforarray;

import java.util.Scanner;

public class VongLapWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int x=1;
        while(i<10){
            System.out.println("I = "+i);
            i++;
        }
        System.out.println("------------------------------");
//        while(x!=0){
//            System.out.println("Nhap x bat ki de tiep tuc ngoai tru so 0!");
//            x=sc.nextInt();
//        }

        int j=10;
        while(j>=0){
            System.out.println("J = "+j);
            j--;
        }

        int a = 20;
        while(a>=0){
            System.out.println("----");
            a--;
            if(a%2==0) {
                System.out.println("A = " + a);
            }
        }

        int k = 1;
        while(k<=10){
            System.out.println("K = "+k);
            k++;
            if(k==5) break;
        }
    }
}
