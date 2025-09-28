package ifforarray;

public class GioiThieuArray {
    public static void main(String[] args) {
        int[] mangInt = {1,4,5,6,7};
        double[] mangDouble = {1.1, 1.2, 1.3, 1.4};
        System.out.println("Mang so nguyen: ");
        for (int i = 0; i < mangInt.length; i++) {
            System.out.println(mangInt[i]);
        }
        System.out.println("Mang so thuc: ");
        for (int i = 0; i < mangDouble.length; i++) {
            System.out.println(mangDouble[i]);
        }
    }
}
