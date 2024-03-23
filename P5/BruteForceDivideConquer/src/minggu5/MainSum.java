package minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total(Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc08.nextInt();
        System.out.println("============================================================");

        for (int p = 0; p < jumlahPerusahaan; p++) {
            System.out.println("Perusahaan ke-" + (p + 1));
            System.out.print("Masukkan jumlah bulan: ");
            int jumlahBulan = sc08.nextInt();

            double[] keuntungan = new double[jumlahBulan];
            double totalKeuntungan = 0;

            for (int i = 0; i < jumlahBulan; i++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (i + 1) + ": ");
                keuntungan[i] = sc08.nextDouble();
                totalKeuntungan += keuntungan[i];
            }
            System.out.println("Total keuntungan perusahaan ke-" + (p + 1) + " selama " + jumlahBulan
                    + " bulan adalah: " + totalKeuntungan);
            System.out.println("============================================================");
        }
        sc08.close();
    }
}