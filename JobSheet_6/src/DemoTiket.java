public class DemoTiket {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN KONSTRUKTOR TANPA PARAMETER ===");
        
        Tiket_Pesawat tp1 = new Tiket_Pesawat();
        tp1.kodeBooking = 101;             
        tp1.namaPembeli = "Budi Santoso";    
        tp1.hargaTiket = 1500000;          
        tp1.nomorKursi = 12;                  
        tp1.nomorPenerbangan = 777;          
        
        System.out.println("\n--- Info Tiket Pesawat 1 ---");
        System.out.println(tp1.getAllInfo());


        System.out.println("=== PENGUJIAN KONSTRUKTOR BERPARAMETER ===");
        
        Tiket_Kereta tk1 = new Tiket_Kereta(202, "Andi Wijaya", 350000, 4, 8);
        Tiket_Bus tb1 = new Tiket_Bus(303, "Citra Lestari", 150000, 22, "Harapan Jaya");
        
        System.out.println("\n--- Info Tiket Kereta 1 ---");
        System.out.println(tk1.getAllInfo());

        System.out.println("--- Info Tiket Bus 1 ---");
        System.out.println(tb1.getAllInfo());
    }
}