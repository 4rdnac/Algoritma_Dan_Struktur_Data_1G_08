package P8;

public class Gudang08 {
    Barang08[] tumpukan;
    int size;
    int top;

    public Gudang08(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang08[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang08 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang08 ambilBarang() {
        if (!cekKosong()) {
            Barang08 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang08 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang08 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s(Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi08 stack = new StackKonversi08();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode /= 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public Barang08 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang08 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public int sequentialSearch(int cari) {
        for (int i = 0; i < tumpukan.length; i++) {
            if (tumpukan[i] != null && tumpukan[i].kode == cari) {
                return i;
            }
        }
        return -1;
    }

    public void cariBarang(int hasil) {
        if (hasil != -1) {
            System.out.println(
                    "Barang dengan kode " + tumpukan[hasil].kode + " ditemukan di gudang pada posisi: " + hasil);
        } else {
            System.out.println("Barang tidak ditemukan dalam gudang.");
        }
    }
}
