package P2;

public class Buku08 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilkanInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah Halamag : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : Rp " + harga);
    }

    void terjual(int jml) {
        if (stok >= jml && stok > 0) {
            stok -= jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku08() {

    }

    public Buku08(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}
