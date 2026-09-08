public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "254107060076";
        m1.nama = "Melvin Karya Wiryawan";
        m1.alamat = "Malang";
        m1.kelas = "SIB-2G";

        m1.displayBiodata();

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "254107060086";
        m2.nama = "Nabbel Haqqi Elraq";
        m2.alamat = "Malang";
        m2.kelas = "SIB-2G";

        m2.displayBiodata();

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "2541070600";
        m3.nama = "Calista Nathania Ardijatmono";
        m3.alamat = "Malang";
        m3.kelas = "SIB-2G";

        m3.displayBiodata();
    }
}
