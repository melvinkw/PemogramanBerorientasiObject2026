abstract class TiketAbstract {
    protected int kodeBooking;
    protected String namaPembeli;
    protected double hargaTiket;
    protected int nomorKursi;
    protected final double pajakDasar = 0.1; // 10%

    public TiketAbstract(int kodeBooking, String namaPembeli, double hargaTiket, int nomorKursi) {
        this.kodeBooking = kodeBooking;
        this.namaPembeli = namaPembeli;
        this.hargaTiket = hargaTiket;
        this.nomorKursi = nomorKursi;
    }

    public abstract void cetakTiket();
    public abstract double hitungHargaTotal();

    public void ubahJadwal(String tanggalBaru) {
        System.out.println("Jadwal berhasil diubah ke: " + tanggalBaru);
    }

    public void ubahJadwal(String tanggalBaru, String alasan) {
        System.out.println("Jadwal diubah ke: " + tanggalBaru + " | Alasan: " + alasan);
    }

    public final void tampilkanSyaratKetentuan() {
        System.out.println("[S&K] Tiket tidak dapat dikembalikan (non-refundable).");
    }
}