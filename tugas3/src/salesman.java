//scanner
import java.util.Scanner;

public class salesman {
    public static void main(String[] args){
        //deklarasi variabel
        String nama;
        double penjualan, uangjasa, totaluangjasa;
        Scanner input = new Scanner(System.in);
        //input data
        System.out.print("Masukkan nama salesman: ");
        nama = input.nextLine();
        System.out.print("Masukkan total penjualan salesman: ");
        penjualan = input.nextInt();
        //proses
        if (penjualan <= 200000) {
            uangjasa = 10000;
            totaluangjasa = uangjasa + (penjualan * 0.1);
        } else if (penjualan <= 500000) {
            uangjasa = 20000;
            totaluangjasa = uangjasa + (penjualan * 0.15);
        } else {
            uangjasa = 30000;
            totaluangjasa = uangjasa + (penjualan * 0.2);
        }
        //output
        System.out.println("Nama salesman: " + nama);
        System.out.println("Total penjualan salesman: " + penjualan);
        System.out.println("Uang jasa salesman: " + uangjasa);
        System.out.println("Total uang jasa salesman: " + totaluangjasa);
    }
}
