import java.util.Scanner;

public class Perulangan08 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        long NIM = sc08.nextLong();
        long n = NIM % 10;
        if (n < 10) {
            n += 10;
        }
        System.out.println("n : "+n);
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print("* ");
            } else if (i == 6 || i == 10) {
            } else {
                System.out.print(i + " ");
            }
        }
        sc08.close();
    }
}
