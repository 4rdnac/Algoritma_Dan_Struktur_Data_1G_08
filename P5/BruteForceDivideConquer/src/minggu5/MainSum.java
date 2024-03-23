package minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total(Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc08.nextInt();
        System.out.println("============================================================");
        Sum sm = new Sum(elm);

        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan Untung bulan ke - " + (i + 1) + " = ");
            sm.keuntungan[i] = sc08.nextDouble();
        }
        System.out.println("============================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println(
                "Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.TotalBF(sm.keuntungan));
        System.out.println("============================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = "
                + sm.TotalDC(sm.keuntungan, 0, sm.elemen - 1));
        sc08.close();
    }
}