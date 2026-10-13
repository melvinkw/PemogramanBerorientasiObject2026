public class Tiket {
    public int kodeBooking;
    public String namaPembeli;
    public double hargaTiket;
    public int nomorKursi;

    public final double pajakDasar = 0.1; // penambahan atribut final

    public Tiket() {
        System.out.println("Objek dari class Tiket (Parent) dibuat.");
    }

    public Tiket(int kodeBooking, String namaPembeli, double hargaTiket, int nomorKursi) {
        this.kodeBooking = kodeBooking;
        this.namaPembeli = namaPembeli;
        this.hargaTiket = hargaTiket;
        this.nomorKursi = nomorKursi;
    }

    // Method yang akan digunakan untuk overriding di class anak
    public void cetakTiket() {
        System.out.println("Kode Booking\t: " + kodeBooking);
        System.out.println("Nama Pembeli\t: " + namaPembeli);
        System.out.println("Harga Tiket\t: Rp " + hargaTiket);
        System.out.println("Nomor Kursi\t: " + nomorKursi);
    }

    // Method yang akan digunakan untuk overriding di class anak
    public double hitungHargaTotal(){
        return hargaTiket + (hargaTiket * pajakDasar);
    }

    // Method overloading dengan 1 parameter
    public void ubahJadwal(String tanggalBaru) {
        System.out.println("Jadwal tiket dengan kode booking " + kodeBooking + " telah diubah menjadi tanggal " + tanggalBaru);
    }

    // Method overloading dengan 2 parameter
    public void ubahJadwal(String tanggalBaru, String alasan) {
        System.out.println("Jadwal tiket dengan kode booking " + kodeBooking + " telah diubah menjadi tanggal " + tanggalBaru + " karena " + alasan);
    }

    // Method final yang tidak dapat di override di class anak
    public final void tampilkanSyaratKetentuan() {
        System.out.println("Syarat dan ketentuan tiket:");
        System.out.println("1. Tiket tidak dapat dikembalikan.");
        System.out.println("2. Tiket hanya berlaku untuk satu kali perjalanan.");
        System.out.println("3. Penumpang harus membawa identitas diri yang sah.");
    }
}