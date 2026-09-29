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

    public String getAllInfo() {
        String info = super.getInfo();
        info += "\nNama Bus\t: " + this.namaBus + "\n";
        return info;
    }
}