public class DemoTiket {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN TIKET PESAWAT ===");
        Tiket_Pesawat tp1 = new Tiket_Pesawat();
        tp1.kodeBooking = 101;             
        tp1.namaPembeli = "Melvin Karya Wiryawan";    
        tp1.hargaTiket = 1500000;          
        tp1.nomorKursi = 12;                  
        tp1.nomorPenerbangan = 777;          
        
        System.out.println("\n--- Info Tiket Pesawat 1 ---");
        // Pemanggilan Overridden Method
        tp1.cetakTiket();
        
        // Pemanggilan Overloaded Method
        tp1.ubahJadwal("6 Oktober 2026");
        
        // Pemanggilan Final Method
        tp1.tampilkanSyaratKetentuan();


        System.out.println("\n=== PENGUJIAN TIKET KERETA & BUS ===");
        Tiket_Kereta tk1 = new Tiket_Kereta(202, "james bond", 350000, 4, 8);
        Tiket_Bus tb1 = new Tiket_Bus(303, "john wick", 150000, 22, "Harapan Jaya");
        
        System.out.println("\n--- Info Tiket Kereta 1 ---");
        // Pemanggilan Overridden Method
        tk1.cetakTiket();
        
        // Pemanggilan Overloaded Method dengan 2 Parameter
        tk1.ubahJadwal("20 November 2026", "Sakit");

        System.out.println("\n--- Info Tiket Bus 1 ---");
        // Pemanggilan Overridden Method
        tb1.cetakTiket();
    }
}