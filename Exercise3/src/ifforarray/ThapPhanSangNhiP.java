package ifforarray;

import java.util.Scanner;

public class ThapPhanSangNhiP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nhiPhan = "";
        System.out.println("Nhap so nguyen n: ");
        int n = sc.nextInt();

        while(n>0){
            nhiPhan = (n%2) + nhiPhan;
            n=n/2;
        }
        System.out.println(nhiPhan);
    }
}
