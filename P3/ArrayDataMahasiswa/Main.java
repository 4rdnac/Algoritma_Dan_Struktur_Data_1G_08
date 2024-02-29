package P3.ArrayDataMahasiswa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataMahasiswa[] mahasiswa = new DataMahasiswa[3];
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
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
        }
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            System.out.println("nama: " + mahasiswa[i].nama);
            System.out.println("nim: " + mahasiswa[i].nim);
            System.out.println("jenis kelamin: " + mahasiswa[i].jenisKelamin);
            System.out.println("ipk: " + mahasiswa[i].ipk);
        }
        double rataIpk = hitungRataIpk(mahasiswa);
        System.out.println("\nRata-rata IPK: " + rataIpk);

        DataMahasiswa mahasiswaTerbaik = dataMahasiswaTerbaik(mahasiswa);
        System.out.println("\nData Mahasiswa dengan IPK Terbesar:");
        System.out.println("Nama: " + mahasiswaTerbaik.nama);
        System.out.println("NIM: " + mahasiswaTerbaik.nim);
        System.out.println("Jenis Kelamin: " + mahasiswaTerbaik.jenisKelamin);
        System.out.println("IPK: " + mahasiswaTerbaik.ipk);

        scanner.close();
    }

    public static double hitungRataIpk(DataMahasiswa[] mahasiswa) {
        double totalIpk = 0;
        for (int i = 0; i < mahasiswa.length; i++) {
            totalIpk += mahasiswa[i].ipk;
        }
        return totalIpk / mahasiswa.length;
    }

    public static DataMahasiswa dataMahasiswaTerbaik(DataMahasiswa[] mahasiswa) {
        DataMahasiswa mahasiswaTerbaik = mahasiswa[0];
        for (int i = 1; i < mahasiswa.length; i++) {
            if (mahasiswa[i].ipk > mahasiswaTerbaik.ipk) {
                mahasiswaTerbaik = mahasiswa[i];
            }
        }
        return mahasiswaTerbaik;
    }

}