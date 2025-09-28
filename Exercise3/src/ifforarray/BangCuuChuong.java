package ifforarray;

public class BangCuuChuong {
    public static void main(String[] args) {
        System.out.println("Bang cuu chuong! ");
        for (int i = 2; i <=9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = "+ (i*j));
            }
            System.out.println("Day la bang cuu chuong "+i);
            System.out.println("----------------------------");
        }
    }
}
