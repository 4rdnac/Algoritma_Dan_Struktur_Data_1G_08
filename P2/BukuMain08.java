package P2;

public class BukuMain08 {
    public static void main(String[] args) {
        Buku08 bk1 = new Buku08();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilkanInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilkanInformasi();
        Buku08 bk2 = new Buku08("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilkanInformasi();
        Buku08 bukuCandra = new Buku08("Terserah", "Candra Ahmad Dani", 88, 8, 50000);
        bukuCandra.tampilkanInformasi();
    }
}