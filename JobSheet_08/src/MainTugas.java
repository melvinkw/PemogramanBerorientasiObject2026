public class MainTugas {
    public static void main(String[] args) {
        TiketPesawat pesawat = new TiketPesawat(101, "Melvin", 1500000, 12, 777);
        TiketKereta kereta = new TiketKereta(102, "Nabeel", 300000, 5, 3);
        TiketBus bus = new TiketBus(103, "Natha", 150000, 1, "Sinar Jaya");

        pesawat.cetakTiket();
        System.out.println("Total Harga     : Rp" + pesawat.hitungHargaTotal());
        pesawat.ubahJadwal("25-12-2024");
        pesawat.tampilkanSyaratKetentuan();
        System.out.println("---------------------------------");

        kereta.cetakTiket();
        System.out.println("Total Harga     : Rp" + kereta.hitungHargaTotal());
        kereta.ubahJadwal("26-12-2024", "Urusan Keluarga"); // Overloading method ubahJadwal
        kereta.tampilkanSyaratKetentuan();
        System.out.println("---------------------------------");

        bus.cetakTiket();
        System.out.println("Total Harga     : Rp" + bus.hitungHargaTotal());
        bus.ubahJadwal("27-12-2024");
        bus.tampilkanSyaratKetentuan();
    }
}