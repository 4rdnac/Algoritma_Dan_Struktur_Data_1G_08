package P10.Praktikum1;

import java.util.Scanner;

public class QueueMain08 {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc08.nextInt();
        Queue08 Q = new Queue08(n);

        int pilih;
        do {
            menu();
            pilih = sc08.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Maaukkan data baru: ");
                    int dataMasuk = sc08.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    System.out.println("Maaukkan data baru: ");
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;

                default:
                    break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
        sc08.close();
    }
}
