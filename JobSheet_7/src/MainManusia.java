class Manusia {
    public void bernafas() {
        System.out.println("Manusia sedang bernafas");
    }
    public void makan() {
        System.out.println("Manusia sedang makan");
    }
}

class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen makan di kantin dosen");
    }
    public void lembur() {
        System.out.println("Dosen sedang lembur memeriksa tugas");
    }
}

class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan di kosan");
    }
    public void tidur() {
        System.out.println("Mahasiswa tidur setelah begadang");
    }
}

public class MainManusia {
    public static void main(String[] args) {
        // Dynamic Method Dispatch
        Manusia manusia1 = new Dosen();
        Manusia manusia2 = new Mahasiswa();

        manusia1.makan(); // Memanggil method makan() milik Dosen
        manusia2.makan(); // Memanggil method makan() milik Mahasiswa
    }
}