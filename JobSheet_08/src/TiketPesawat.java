public class TiketPesawat extends TiketAbstract {
    private int nomorPenerbangan;

    public TiketPesawat(int kodeBooking, String namaPembeli, double hargaTiket, int nomorKursi, int nomorPenerbangan) {
        super(kodeBooking, namaPembeli, hargaTiket, nomorKursi);
        this.nomorPenerbangan = nomorPenerbangan;
    }

    @Override
    public void cetakTiket() {
        System.out.println("=== TIKET PESAWAT ===");
        System.out.println("Kode Booking    : " + kodeBooking);
        System.out.println("Nama Pembeli    : " + namaPembeli);
        System.out.println("No. Penerbangan : " + nomorPenerbangan);
        System.out.println("Nomor Kursi     : " + nomorKursi);
    }

    @Override
    public double hitungHargaTotal() {
        return hargaTiket + (hargaTiket * pajakDasar); // Harga + Pajak
    }
} 
