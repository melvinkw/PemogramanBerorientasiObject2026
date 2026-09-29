public class Tiket {
    public int kodeBooking;
    public String namaPembeli;
    public double hargaTiket;
    public int nomorKursi;

    public Tiket() {
        System.out.println("Objek dari class Tiket (Parent) dibuat.");
    }

    public Tiket(int kodeBooking, String namaPembeli, double hargaTiket, int nomorKursi) {
        this.kodeBooking = kodeBooking;
        this.namaPembeli = namaPembeli;
        this.hargaTiket = hargaTiket;
        this.nomorKursi = nomorKursi;
    }

    public String getInfo() {
        return "Kode Booking\t: " + kodeBooking + "\n" +
               "Nama Pembeli\t: " + namaPembeli + "\n" +
               "Harga Tiket\t: Rp " + hargaTiket + "\n" +
               "Nomor Kursi\t: " + nomorKursi;
    }
}