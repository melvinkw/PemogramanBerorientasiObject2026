class TiketKeretaEksekutif extends TiketKereta {
    private String fasilitasTambahan;

    public TiketKeretaEksekutif(String idTiket, double hargaDasar, String namaKereta, String tanggal, String fasilitasTambahan) {
        super(idTiket, hargaDasar, namaKereta, "Eksekutif", tanggal);
        this.fasilitasTambahan = fasilitasTambahan;
    }

    public void pesanMakanan() {
        System.out.println("Memesan makanan mewah untuk penumpang " + namaKereta);
    }

    public void aksesRuangTunggu() {
        System.out.println("Mengakses Ruang Tunggu VIP (Fasilitas: " + fasilitasTambahan + ")");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Fasilitas: " + fasilitasTambahan;
    }
}