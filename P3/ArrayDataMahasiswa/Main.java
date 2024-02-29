package P3.ArrayDataMahasiswa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataMahasiswa[] mahasiswa = new DataMahasiswa[3];
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan nim: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan jenis kelamin: ");
            char jenisKelamin = scanner.nextLine().charAt(0);
            System.out.print("Masukkan ipk: ");
            double ipk = scanner.nextDouble();
            scanner.nextLine();
            mahasiswa[i] = new DataMahasiswa(nama, nim, jenisKelamin, ipk);
        }for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Data mahasiswa ke-"+(i+1));
            System.out.println("nama: "+mahasiswa[i].nama);
            System.out.println("nim: "+mahasiswa[i].nim);
            System.out.println("jenis kelamin: "+mahasiswa[i].jenisKelamin);
            System.out.println("ipk: "+mahasiswa[i].ipk);
        }
        scanner.close();
    }

}