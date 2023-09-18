import java.util.Scanner;

public class HargaBayar20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah, jumlahHalaman;
        String merk; 
        double dis, total, bayar, jmlDis;
        System.out.println("Masukkan Harga Barang Yang Dibeli : ");
        harga = input.nextInt();
        System.out.println("Masukkan Jumlah Barang Yang Dibeli : ");
        jumlah = input.nextInt();
        System.out.println("Masukkan Merk : ");
        merk = input.next();
        System.out.println("Masukkan Jumlah Halaman Barang Yang Dibeli : ");
        jumlahHalaman = input.nextInt();
        System.out.println("Masukkan Diskon : ");
        dis = input.nextDouble();

        total = harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Barang yang anda beli adalah : " + merk);
        System.out.println("Jumlah Halaman barang yand dibeli adalah : " + jumlahHalaman);
        System.out.println("Diskon yang anda dapatkan adalah : " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah : " +bayar);
    }
}