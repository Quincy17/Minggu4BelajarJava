import java.util.Scanner;
public class Lingkaran20 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int r;
        double keliling,luas,phi;
        phi= 3.14;
        System.out.println("Masukkan jari-jari lingkaran : ");
        r = input.nextInt();

        luas = phi*r*r;
        keliling= phi*r*2;

        System.out.println("Luas = " + luas);
        System.out.println("Keliling = " + keliling);

    }
}