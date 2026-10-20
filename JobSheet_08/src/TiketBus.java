class TiketBus extends TiketAbstract {
    private String namaBus;

    public TiketBus(int kodeBooking, String namaPembeli, double hargaTiket, int nomorKursi, String namaBus) {
        super(kodeBooking, namaPembeli, hargaTiket, nomorKursi);
        this.namaBus = namaBus;
    }

    @Override
    public void cetakTiket() {
        System.out.println("=== TIKET BUS ===");
        System.out.println("Kode Booking    : " + kodeBooking);
        System.out.println("Nama Pembeli    : " + namaPembeli);
        System.out.println("Nama Bus        : " + namaBus);
        System.out.println("Nomor Kursi     : " + nomorKursi);
    }

    @Override
    public double hitungHargaTotal() {
        return hargaTiket + (hargaTiket * pajakDasar); // Harga + Pajak
    }
}