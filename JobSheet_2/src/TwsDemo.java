public class TwsDemo {
    public static void main(String[] args) {
        Tws tws1 = new Tws();
        tws1.merk = "Xiaomi";
        tws1.warna = "Hitam";
        tws1.baterai = 100;
        tws1.volume = 30;
        tws1.isConnected = false;

        System.out.println("Proses TWS 1");
        tws1.hubungkanPerangkat();
        tws1.aturVolume(50);

        System.out.println();

        Tws tws2 = new Tws();
        tws2.merk = "Realme";
        tws2.warna = "Putih";
        tws2.baterai = 120;
        tws2.volume = 10;
        tws2.isConnected = true;

        System.out.println("Proses TWS 2");
        tws2.putuskanPerangkat();

        System.out.println("Informasi TWS 1:");
        tws1.displayInfo();

        System.out.println("Informasi TWS 2:");
        tws2.displayInfo();
    }
}
