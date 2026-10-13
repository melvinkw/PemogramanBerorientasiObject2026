public class Tiket_Bus extends Tiket {
    public String namaBus;

    public Tiket_Bus() {
        super();
        System.out.println("Objek class Tiket_Bus dibuat.");
    }

    public Tiket_Bus(int kodeBooking, String namaPembeli, double hargaTiket, int nomorKursi, String namaBus) {
        super(kodeBooking, namaPembeli, hargaTiket, nomorKursi);
        this.namaBus = namaBus;
    }

    // PENAMBAHAN OVERRIDING
    @Override
    public void cetakTiket() {
        super.cetakTiket();
        System.out.println("Nama Bus\t: " + this.namaBus);
        System.out.println("Total Harga (Inc. Pajak)\t: Rp " + hitungHargaTotal());
        System.out.println("-------------------------------------------------");
    }

    // PENAMBAHAN OVERRIDING
    @Override
    public double hitungHargaTotal() {
        // Tiket bus tidak ada biaya tambahan selain pajak dasar
        return super.hitungHargaTotal();
    }
}