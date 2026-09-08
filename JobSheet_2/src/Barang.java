public class Barang {
    public String kode;
    public String namaBarang;
    public Double hargaKotor;
    public Double diskon;

    public double getHargaBersih(){
        return hargaKotor - diskon * hargaKotor ;
    }

    public void displayInfo(){
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + namaBarang);
        System.out.println("Harga Kotor : " + hargaKotor);
        System.out.println("Diskon      : " + diskon);
        System.out.println("Harga Bersih: " + getHargaBersih());
    }
}
