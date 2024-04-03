package P6;

public class MainHotel {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService();
        
        hotelService.tambah(new Hotel("Hotel A", "Kota F", 200000, (byte) 4));
        hotelService.tambah(new Hotel("Hotel B", "Kota G", 450000, (byte) 5));
        hotelService.tambah(new Hotel("Hotel C", "Kota H", 250000, (byte) 3));
        hotelService.tambah(new Hotel("Hotel D", "Kota I", 400000, (byte) 4));
        hotelService.tambah(new Hotel("Hotel E", "Kota J", 350000, (byte) 2));
        
        System.out.println("Data hotel sebelum sorting:");
        hotelService.tampilAll();
        
        hotelService.bubbleSort();
        System.out.println("\nData hotel setelah sorting berdasarkan harga termurah:");
        hotelService.tampilAll();
        
        hotelService.selectionSort();
        System.out.println("\nData hotel setelah sorting berdasarkan rating terbaik:");
        hotelService.tampilAll();
    }
}