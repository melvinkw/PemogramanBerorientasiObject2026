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

    public String getAllInfo() {
        String info = super.getInfo();
        info += "\nNomor Gerbong\t: " + this.nomorGerbong + "\n";
        return info;
    }
}