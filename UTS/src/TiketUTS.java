class TiketUTS {
    protected String idTiket;
    protected double hargaDasar;

    public TiketUTS(String idTiket, double hargaDasar) {
        this.idTiket = idTiket;
        this.hargaDasar = hargaDasar;
    }

    public void cetakTiket() {
        System.out.println("Mencetak tiket dengan ID: " + idTiket);
    }

    public String getInfo() {
        return "ID Tiket: " + idTiket + " | Harga Dasar: Rp" + hargaDasar;
    }
}