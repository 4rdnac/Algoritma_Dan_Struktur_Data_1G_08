package P8;

import java.util.Scanner;

public class PostFixMain08 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc08.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        PostFix08 post = new PostFix08(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
        sc08.close();
    }
}