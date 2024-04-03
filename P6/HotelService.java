package P6;

public class HotelService {
    Hotel[] hotels;
    int jml;

    HotelService() {
        hotels = new Hotel[10];
        jml = 0;
    }

    void tambah(Hotel hotel) {
        if (jml < hotels.length) {
            hotels[jml] = hotel;
            jml++;
        } else {
            System.out.println("Kapasitas hotel sudah penuh.");
        }
    }

    public void tampilAll() {
        for (int i = 0; i < jml; i++) {
            System.out.println("Nama: " + hotels[i].nama + ", Kota: " + hotels[i].kota + ", Harga: " + hotels[i].harga
                    + ", Bintang: " + hotels[i].bintang);
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < jml - 1; i++) {
            for (int j = 0; j < jml - i - 1; j++) {
                if (hotels[j].harga > hotels[j + 1].harga) {
                    Hotel temp = hotels[j];
                    hotels[j] = hotels[j + 1];
                    hotels[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < jml - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < jml; j++) {
                if (hotels[j].bintang > hotels[minIndex].bintang) {
                    minIndex = j;
                }
            }
            Hotel temp = hotels[minIndex];
            hotels[minIndex] = hotels[i];
            hotels[i] = temp;
        }
    }
}
