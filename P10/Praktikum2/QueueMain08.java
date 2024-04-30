package P10.Praktikum2;

import java.util.Scanner;

public class QueueMain08 {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc08.nextInt();
        Queue08 antri = new Queue08(n);

        int pilih;
        do {
            menu();
            pilih = sc08.nextInt();
            sc08.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc08.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc08.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc08.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc08.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc08.nextDouble();
                    Nasabah08 nb = new Nasabah08(norek, nama, alamat, umur, saldo);
                    sc08.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah08 data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Antrian yang dikeluarkan: " + data.norek + " " + data.nama + " "
                                + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
        sc08.close();
    }
}
