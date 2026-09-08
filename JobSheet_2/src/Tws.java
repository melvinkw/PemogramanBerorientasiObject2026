public class Tws {
    public String merk;
    public String warna;
    public int baterai;
    public int volume;
    public boolean isConnected;

    public void displayInfo(){
        System.out.println("Merk        : " + merk);
        System.out.println("Warna       : " + warna);
        System.out.println("Baterai     : " + baterai + " mAh");
        System.out.println("Volume      : " + volume);
        System.out.println("Connected   : " + isConnected);
    }

    public void hubungkanPerangkat(){
        isConnected = true;
        System.out.println(merk + " connected successfully");
    }

    public void putuskanPerangkat(){
        isConnected = false;
        System.out.println(merk + " disconnected successfully");
    }

    public void aturVolume(int volumeBaru){
        if(volumeBaru >= 0 && volumeBaru <= 100){
            volume = volumeBaru;
            System.out.println("Volume set to " + volume);
        } else {
            System.out.println("Volume must be between 0 and 100");
        }
    }
}
