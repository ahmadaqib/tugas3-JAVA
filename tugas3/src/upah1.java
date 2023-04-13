//scanner
import java.util.Scanner;

public class upah1 {
    public static void main(String[] args) {
        //deklarasi variabel
        String nama;
        int golongan, jamkerja, upah, upahlembur, totalupah;
        Scanner input = new Scanner(System.in);
        //input data
        System.out.print("Masukkan nama karyawan: ");
        nama = input.nextLine();
        System.out.print("Masukkan golongan karyawan: ");
        golongan = input.nextInt();
        System.out.print("Masukkan jam kerja karyawan: ");
        jamkerja = input.nextInt();
        //proses
        if (golongan == 1) {
            upah = 30000;
            if (jamkerja > 8) {
                upahlembur = (jamkerja - 8) * 3000;
            } else {
                upahlembur = 0;
            }
        } else if (golongan == 2) {
            upah = 40000;
            if (jamkerja > 8) {
                upahlembur = (jamkerja - 8) * 4000;
            } else {
                upahlembur = 0;
            }
        } else {
            upah = 0;
            upahlembur = 0;
        }
        totalupah = upah + upahlembur;
        //output
        System.out.println("Nama karyawan: " + nama);
        System.out.println("Golongan karyawan: " + golongan);
        System.out.println("Jam kerja karyawan: " + jamkerja);
        System.out.println("Upah karyawan: " + upah);
        System.out.println("Upah lembur karyawan: " + upahlembur);
        System.out.println("Total upah karyawan: " + totalupah);
    }
}