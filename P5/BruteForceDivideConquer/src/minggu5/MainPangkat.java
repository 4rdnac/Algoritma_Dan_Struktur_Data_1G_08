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
            System.out.println("Masukkan nilai yang akan dipangkatkan: ");
            int nilai = sc08.nextInt();
            System.out.println("Masukkan nilai pemangkat: ");
            int pangkat = sc08.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }
        
        System.out.println("===========================================");
        System.out.println("                Menu Pangkat               ");
        System.out.println("========================================== ");
        System.out.println("1. Menggunakan Brute Force ");
        System.out.println("2. Menggunakan Devide Conquer ");
        System.out.println("3. exit ");
        System.out.print("Silahkan Pilih Metode Perhitungan : ");
        int pilih = sc08.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("============================================");
                System.out.println("Hasil pangkat menggunakan Brute force ");
                for (int i = 0; i < png.length; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("============================================");
                System.out.println("Hasil pangkat menggunakan Devide and Conquer ");
                for (int i = 0; i < png.length; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            case 3:
                System.out.println("Terima Kasih");
                break;
            default:
                System.out.println("Input Salah");
        }
        sc08.close();
    }
}
