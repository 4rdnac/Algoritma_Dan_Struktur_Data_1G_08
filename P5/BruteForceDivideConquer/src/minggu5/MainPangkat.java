package minggu5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Masukkan Jumlah elemen yang dihitung: ");
        int elemen = sc08.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.println("Masukkan nilai yang akan dipangkatkan: ");
            png[i].nilai = sc08.nextInt();
            System.out.println("Masukkan nilai pemankat: ");
            png[i].pangkat = sc08.nextInt();
        }
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
        sc08.close();
    }
}
