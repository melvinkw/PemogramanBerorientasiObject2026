public class MainTiket {
    public static void main(String[] args) {
        System.out.println("=== SISTEM PEMESANAN TIKET KERETA ===");
        
        TiketKeretaEksekutif tiketVIP = new TiketKeretaEksekutif(
            "TRX-001", 
            150000.0, 
            "Argo Bromo Anggrek", 
            "2023-11-01", 
            "AC, Kursi Reclining, Makan Malam"
        );

        tiketVIP.cetakTiket();
        
        tiketVIP.pilihKursi();
        
        tiketVIP.pesanMakanan();
        tiketVIP.aksesRuangTunggu();

        System.out.println("\n--- Detail Tiket ---");
        System.out.println(tiketVIP.getInfo());
    }
}