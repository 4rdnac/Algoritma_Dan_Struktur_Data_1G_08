public class Fungsi08 {
    public static void main(String[] args) {
        int stokRoyalGarden[][] = { { 10, 5, 15, 7 }, { 6, 11, 9, 12 }, { 2, 10, 10, 5 }, { 5, 7, 12, 9 } };
        int harga[] = { 75000, 50000, 60000, 10000 };
        int penghasilanCabang[] = new int[4];
        int bungaMati[] = { 1, 2, 0, 5 };

        FungsiPenghasilanCabang(stokRoyalGarden, harga, penghasilanCabang);
        royalGarden4(stokRoyalGarden, bungaMati);
    }

    static void FungsiPenghasilanCabang(int stokRoyalGarden[][], int harga[], int penghasilanCabang[]) {
        for (int i = 0; i < harga.length; i++) {
            int jumlahPenghasilanCabang = 0;
            for (int j = 0; j < harga.length; j++) {
                jumlahPenghasilanCabang += stokRoyalGarden[i][j] * harga[j];
            }
            penghasilanCabang[i] = jumlahPenghasilanCabang;
        }
        for (int i = 0; i < harga.length; i++) {
            System.out.println("Penghasilan Cabang RoyalGarden " + (i + 1) + " : " + penghasilanCabang[i]);
        }
    }

    static void royalGarden4(int stokRoyalGarden[][], int bungaMati[]) {
        for (int i = 0; i < stokRoyalGarden.length; i++) {
            stokRoyalGarden[3][i] -= bungaMati[i];
        }
        System.out.println(
                "====================================\nStock bunga pada cabang Royal Garden 4 : \n====================================");
        System.out.println("Aglonema: " + stokRoyalGarden[3][0]);
        System.out.println("Keladi: " + stokRoyalGarden[3][1]);
        System.out.println("Alocasia: " + stokRoyalGarden[3][2]);
        System.out.println("Mawar: " + stokRoyalGarden[3][3]);
    }
}
