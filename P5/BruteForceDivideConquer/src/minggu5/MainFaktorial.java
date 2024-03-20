package minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc08.nextInt();
        Faktorial[] fk = new Faktorial[iJml];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc08.nextInt();
        }
        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                    "Hasil perhitnugan faktorial menggunakan Brute Force adalah " + fk[i].faktorialIBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Divide and Conquer adalah "
                    + fk[i].faktorialDC(fk[i].nilai));
        }
        sc08.close();
    }
}