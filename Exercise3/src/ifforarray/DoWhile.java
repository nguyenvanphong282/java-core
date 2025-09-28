package ifforarray;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap vao so n > 0: ");
            n = sc.nextInt();
        }while(n>0);
    }
}
