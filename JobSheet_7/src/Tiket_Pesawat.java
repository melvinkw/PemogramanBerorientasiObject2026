public class Tiket_Pesawat extends Tiket {
    public int nomorPenerbangan;

    public Tiket_Pesawat() {
        super(); 
        System.out.println("Objek class Tiket_Pesawat dibuat.");
    }

    // PENAMBAHAN OVERRIDING
    @Override
    public void cetakTiket() {
        super.cetakTiket();
        System.out.println("Nomor Penerbangan\t: " + this.nomorPenerbangan);
        System.out.println("Total Harga (Inc. Pajak)\t: Rp " + hitungHargaTotal());
        System.out.println("-------------------------------------------------");
    }

    // PENAMBAHAN OVERRIDING
    @Override
    public double hitungHargaTotal() {
        double biayaBagasi = 50000;
        return super.hitungHargaTotal() + biayaBagasi;
    }
}