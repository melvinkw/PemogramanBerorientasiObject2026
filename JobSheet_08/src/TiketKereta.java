class TiketKereta extends TiketAbstract {
    private int nomorGerbong;

    public TiketKereta(int kodeBooking, String namaPembeli, double hargaTiket, int nomorKursi, int nomorGerbong) {
        super(kodeBooking, namaPembeli, hargaTiket, nomorKursi);
        this.nomorGerbong = nomorGerbong;
    }

    @Override
    public void cetakTiket() {
        System.out.println("=== TIKET KERETA ===");
        System.out.println("Kode Booking    : " + kodeBooking);
        System.out.println("Nama Pembeli    : " + namaPembeli);
        System.out.println("No. Gerbong     : " + nomorGerbong);
        System.out.println("Nomor Kursi     : " + nomorKursi);
    }

    @Override
    public double hitungHargaTotal() {
        return hargaTiket + (hargaTiket * pajakDasar); 
    }
}