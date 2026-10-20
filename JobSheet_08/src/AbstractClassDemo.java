//PRATIKUM 01
/* public class AbstractClassDemo {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan(10, "Rumput", "Savana");
        hewan1.cetakInfo();
        hewan1.bergerak();
        hewan1.bernapas();

        Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();
    }
} */

//Jawaban soal 1 = Program berjalan dengan sukses tanpa error, objek hewan1 dan lebah1 berhasil diinstantiasi. Untuk output yg muncul hanya informasi dari cetakinfo() karena method bergerak() dan bernapas() tidak memiliki implementasi.
//Jawaban soal 2 = The answer is simple: because this is the Animal class, and it will serve as the parent class for all animals, whereas each animal moves and breathes in different ways.
//Jawaban soal 3 = Karena class lebah menggunakan kata kunci EXTENDS HEWAN, maka class lebah merupakan subclass dari class hewan. Dengan kata lain, class lebah mewarisi semua atribut dan method dari class hewan


//PRATIKUM 02
public class AbstractClassDemo {
    public static void main(String[] args) {
        // Hewan hewan1 = new Hewan(10, "Rumput", "Savana"); // ERROR (Abstract)
        
        Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        System.out.println("--- LEBah ---");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();

        Ular ular1 = new Ular(true, 2.5, "Tikus", "Hutan Tropis");
        System.out.println("\n--- ULAR ---");
        ular1.cetakInfo();
        ular1.bergerak();
        ular1.bernapas();
    }
}

//Jawaban soal 1 = Karena setiap hewan memiliki cara bergerak dan bernapas yang berbeda, maka method bergerak() dan bernapas() dideklarasikan sebagai abstract method di class Hewan. Dengan begitu, setiap subclass (seperti Lebah dan Ular) harus mengimplementasikan method tersebut sesuai dengan karakteristik masing-masing hewan. Hal ini memastikan bahwa setiap hewan memiliki perilaku yang spesifik dan sesuai dengan jenisnya
//Jawaban soal 2 = Error muncul karena class Hewan memiliki abstract method, tetapi class Hewan itu sendiri belum dideklarasikan sebagai abstract class. Di Java, jika sebuah class memiliki minimal satu abstract method, class tersebut wajib hukumnya menjadi abstract class
//Jawaban soal 3 = Ya, wajib
//Jawaban soal 4 = Tidak, abstract class boleh tidak memiliki abstract method. Abstract class dapat memiliki kombinasi antara abstract method dan concrete method (method dengan implementasi). Namun, jika sebuah class memiliki abstract method, maka class tersebut harus dideklarasikan sebagai abstract class
//Jawaban soal 5 = Karena class hewan sudah dideklarasikan sebagai abstract class, maka kita tidak bisa membuat objek langsung dari class Hewan. Abstract class tidak dapat diinstansiasi secara langsung karena sifatnya yang abstrak dan tidak lengkap. Sebagai gantinya, kita harus membuat objek dari subclass yang mengimplementasikan semua abstract method dari class Hewan, seperti Lebah dan Ular
//Jawaban soal 6 = Ya, abstract class bisa memiliki constructor
//Jawaban soal 7 = Ya, dapat dipanggil. Namun, bukan dengan cara new, melainkan dipanggil dari constructor subclass-nya menggunakan perintah super()
//Jawaban soal 8 = Karena bergerak() dan bernapas() adalah abstract method (tidak punya body di superclass), sehingga subclass wajib menyediakannya. Sedangkan cetakInfo() adalah concrete method (sudah punya body utuh di superclass), jadi subclass bisa langsung mewarisinya tanpa perlu membuat ulang (kecuali ingin menambahkan info baru, seperti pada Ular dan Lebah)
//Jawaban soal 9 = Sebagai kontrak atau aturan wajib. Abstract method memastikan bahwa semua subclass yang dibuat dari class tersebut pasti memiliki method dengan nama dan parameter yang sama, meskipun implementasi (isinya) diserahkan sepenuhnya kepada masing-masing subclass
//Jawaban soal 10 = Sebagai cetakan dasar (blueprint) yang tidak bisa dibuat objeknya secara langsung karena sifatnya masih terlalu umum. Abstract class digunakan untuk mengelompokkan atribut dan perilaku umum yang dimiliki oleh beberapa class turunan