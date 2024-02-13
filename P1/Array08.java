import java.util.Scanner;

public class Array08 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        double[] nilaiMK = new double[8];
        double[] nilaiSetara = new double[8];
        double[] SKS = { 2, 2, 2, 3, 2, 2, 3, 2 };
        String[] nilaiHuruf = new String[8];
        String[] mataKuliah = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris",
                "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };

        System.out.println("=========================\nProgram Menghitung IP Semester\n=========================");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("masukkan Nilai untuk MK " + mataKuliah[i] + ":");
            nilaiMK[i] = sc08.nextDouble();
            if (nilaiMK[i] < 0 || nilaiMK[i] > 100) {
                System.out.println("nilai tidak valid");
                i--;
            }
        }
        for (int i = 0; i < mataKuliah.length; i++) {
            if (nilaiMK[i] > 80 && nilaiMK[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiMK[i] > 73 && nilaiMK[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiMK[i] > 65 && nilaiMK[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiMK[i] > 60 && nilaiMK[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiMK[i] > 50 && nilaiMK[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiMK[i] > 39 && nilaiMK[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else if (nilaiMK[i] <= 39) {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }
        }
        double jumlahNilai = 0;
        double jumlahSKS = 0;
        for (int i = 0; i < mataKuliah.length; i++) {
            jumlahNilai += nilaiSetara[i] * SKS[i];
            jumlahSKS += SKS[i];
        }
        double ip = jumlahNilai / jumlahSKS;
        double ipBulat = Math.round(ip * 100.0) / 100.0;
        System.out.println("=========================\nHasil Konversi Nilai\n=========================");
        System.out.printf("%-40s%-15s%-15s\n", "Mata Kuliah", "Nilai", "Nilai Huruf");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s%-15.2f%-15s\n", mataKuliah[i], nilaiMK[i], nilaiHuruf[i]);
        }
        System.out.println("=========================\nIP : " + ipBulat);
        sc08.close();
    }

}
