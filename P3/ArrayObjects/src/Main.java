import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        System.out.print("Masukkan Panjang Array: ");
        int lenghtArray=sc08.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[lenghtArray];
        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan Panjang: ");
            ppArray[i].panjang = sc08.nextInt();
            System.out.print("Masukkan Lebar: ");
            ppArray[i].lebar = sc08.nextInt();
        }
        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }
        sc08.close();
    }
}
