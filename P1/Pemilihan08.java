import java.util.Scanner;

public class Pemilihan08 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        double nilaiAkhir;
        double inputNilaiTugas = -1;
        double inputNilaiKuis = -1;
        double inputNilaiUTS = -1;
        double inputNilaiUAS = -1;
        String nilaiHuruf = null;
        boolean inputNilai = true;
        while (inputNilai) {
            System.out.println("========================");
            System.out.print("Masukkan Nilai Tugas : ");
            inputNilaiTugas = sc08.nextInt();
            System.out.print("Masukkan Nilai Kuis : ");
            inputNilaiKuis = sc08.nextInt();
            System.out.print("Masukkan Nilai UTS : ");
            inputNilaiUTS = sc08.nextInt();
            System.out.print("Masukkan Nilai UAS : ");
            inputNilaiUAS = sc08.nextInt();
            if (inputNilaiTugas < 0 || inputNilaiTugas > 100 || inputNilaiKuis < 0 || inputNilaiKuis > 100
                    || inputNilaiUTS < 0 || inputNilaiUTS > 100 || inputNilaiUAS < 0 || inputNilaiUAS > 100) {
                System.out.println("========================");
                System.out.println("nilai tidak valid");
                inputNilai = true;
            } else {
                inputNilai = false;
            }
        }
        nilaiAkhir = (inputNilaiTugas * 0.2 + inputNilaiKuis * 0.2 + inputNilaiUTS * 0.30 + inputNilaiUAS * 0.30);
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
        }
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("========================");
        if (nilaiHuruf.equals("D")) {
            System.out.println("Anda Tidak Lulus");
        } else if (nilaiHuruf.equals("E")) {
            System.out.println("Anda Tidak Lulus");
        } else {
            System.out.println("Selamat Anda Lulus");
        }
        sc08.close();
    }
}