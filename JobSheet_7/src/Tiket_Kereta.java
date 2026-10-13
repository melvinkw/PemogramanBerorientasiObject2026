public class Tiket_Kereta extends Tiket {
    public int nomorGerbong;

    public Tiket_Kereta() {
        super();
        System.out.println("Objek class Tiket_Kereta dibuat.");
    }

    public Tiket_Kereta(int kodeBooking, String namaPembeli, double hargaTiket, int nomorKursi, int nomorGerbong) {
        super(kodeBooking, namaPembeli, hargaTiket, nomorKursi);
        this.nomorGerbong = nomorGerbong;
    }

    // PENAMBAHAN OVERRIDING
    @Override
    public void cetakTiket() {
        super.cetakTiket();
        System.out.println("Nomor Gerbong\t: " + this.nomorGerbong);
        System.out.println("Total Harga (Inc. Pajak)\t: Rp " + hitungHargaTotal());
        System.out.println("-------------------------------------------------");
    }

    // PENAMBAHAN OVERRIDING
    @Override
    public double hitungHargaTotal() {
        double asuransi = 10000;
        return super.hitungHargaTotal() + asuransi;
    }
}   