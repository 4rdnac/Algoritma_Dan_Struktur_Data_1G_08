package P8;

import java.util.Scanner;

public class Utama08 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas gudang : ");
        int x = sc08.nextInt();
        Gudang08 gudang = new Gudang08(x);
        boolean isRun = true;
        while (isRun) {
            System.out.println("\nMenu :");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari Barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = sc08.nextInt();
            sc08.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc08.nextInt();
                    sc08.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc08.nextLine();
                    System.out.print("Masukkan kategori barang: ");
                    String kategori = sc08.nextLine();
                    Barang08 barangBaru = new Barang08(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Masukkan kode barang yang dicari: ");
                    int cari = sc08.nextInt();
                    gudang.cariBarang(gudang.sequentialSearch(cari));
                    break;
                case 7:
                    isRun = false;
                    sc08.close();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. silahkan coba lagi.");
                    break;
            }
        }
    }
}
