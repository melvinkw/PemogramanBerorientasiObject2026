class TiketKeretaUTS extends TiketUTS {
    protected String namaKereta;
    protected String kelas;
    protected String tanggal;

    public TiketKeretaUTS(String idTiket, double hargaDasar, String namaKereta, String kelas, String tanggal) {
        super(idTiket, hargaDasar); // Memanggil constructor Tiket
        this.namaKereta = namaKereta;
        this.kelas = kelas;
        this.tanggal = tanggal;
    }

    public void pilihKursi() {
        System.out.println("Memilih kursi untuk kereta " + namaKereta + " kelas " + kelas);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Kereta: " + namaKereta + " | Kelas: " + kelas + " | Tanggal: " + tanggal;
    }
}