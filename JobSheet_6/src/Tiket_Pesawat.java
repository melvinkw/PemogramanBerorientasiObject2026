public class Tiket_Pesawat extends Tiket {
    public int nomorPenerbangan;

    public Tiket_Pesawat() {
        super(); 
        System.out.println("Objek class Tiket_Pesawat dibuat.");
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += "\nNomor Penerbangan: " + this.nomorPenerbangan + "\n";
        return info;
    }
}