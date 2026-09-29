public class Tiket_Pesawat extends Tiket {
    public int nomorPenerbangan;

    public Tiket_Pesawat() {
        super(); 
        System.out.println("Objek class Tiket_Pesawat dibuat.");
    }

    public Tiket_Pesawat(int kodeBooking, String namaPembeli, double hargaTiket, int nomorKursi, int nomorPenerbangan) {
        super(kodeBooking, namaPembeli, hargaTiket, nomorKursi); // Memanggil konstruktor berparameter milik parent
        this.nomorPenerbangan = nomorPenerbangan;
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += "\nNomor Penerbangan: " + this.nomorPenerbangan + "\n";
        return info;
    }
}