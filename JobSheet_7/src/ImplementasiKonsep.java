class SistemAkademik {
    // 1. FINAL METHOD: Tidak bisa di-override oleh subclass
    public final void cetakAturan() {
        System.out.println("Aturan Akademik: Kehadiran minimal 80%");
    }
    
    public void tampilkanData(String nama) {
        System.out.println("Nama: " + nama);
    }
}

class DosenAkademik extends SistemAkademik {
    // 2. OVERRIDING: Mengubah perilaku method dari superclass
    @Override
    public void tampilkanData(String nama) {
        System.out.println("Data Dosen (Override): " + nama);
    }

    // 3. OVERLOADING: Membuat method baru dengan nama sama tapi parameter berbeda
    public void tampilkanData(String nama, String nidn) {
        System.out.println("Data Dosen (Overloading): " + nama + " | NIDN: " + nidn);
    }
}

public class ImplementasiKonsep {
    public static void main(String[] args) {
        DosenAkademik dosen = new DosenAkademik();
        
        dosen.cetakAturan(); // Memanggil Final Method
        dosen.tampilkanData("Budi"); // Memanggil Overridden Method
        dosen.tampilkanData("Andi", "12345678"); // Memanggil Overloaded Method
    }
}