package P7.TestSearching;

public class Buku08 {
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku08(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }
    public void TampilDataBuku08() {
        System.out.println("============================");
        System.out.println("Kode Buku \t: " + kodeBuku);
        System.out.println("Judul Buku \t: " + judulBuku);
        System.out.println("Tahun Terbit \t: " + tahunTerbit);
        System.out.println("Pengarang \t: " + pengarang);
        System.out.println("Stock \t\t: " + stock);
    }
}
