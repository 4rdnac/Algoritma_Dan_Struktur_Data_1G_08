package P3.ArrayBangunRuang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kerucut");
        System.out.print("Masukkan jari-jari: ");
        double jariJariKerucut = scanner.nextDouble();
        System.out.print("Masukkan sisi miring: ");
        double sisiMiringKerucut = scanner.nextDouble();
        Kerucut kerucut = new Kerucut(jariJariKerucut, sisiMiringKerucut);

        System.out.println("Limas Segi Empat");
        System.out.print("Masukkan panjang sisi alas: ");
        double panjangSisiAlas = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggiLimas = scanner.nextDouble();
        LimasSegiEmpat limas = new LimasSegiEmpat(panjangSisiAlas, tinggiLimas);

        System.out.println("Bola");
        System.out.print("Masukkan jari-jari: ");
        double jariJariBola = scanner.nextDouble();
        Bola bola = new Bola(jariJariBola);

        System.out.println("Hasil Perhitungan:");
        System.out.println("Kerucut");
        System.out.println("Luas Permukaan: " + kerucut.hitungLuasPermukaan());
        System.out.println("Volume: " + kerucut.hitungVolume());

        System.out.println("Limas Segi Empat");
        System.out.println("Luas Permukaan: " + limas.hitungLuasPermukaan());
        System.out.println("Volume: " + limas.hitungVolume());

        System.out.println("Bola");
        System.out.println("Luas Permukaan: " + bola.hitungLuasPermukaan());
        System.out.println("Volume: " + bola.hitungVolume());

        scanner.close();
    }
}