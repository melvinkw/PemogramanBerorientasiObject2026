import java.time.LocalDate;

public class HospitalDemo {
    public static void main(String[] args) {
        Employee ani = new Employee("1234", "Dr. Ani");
        Employee bagus = new Employee("4567", "Dr. Bagus");

        Employee desi = new Employee("1234", "Ns. Desi");
        Employee eka = new Employee("4567", "Ns. Eka");

        Patient pasien1 = new Patient("343298", "Puspa Widya");
        pasien1.addConsultation(LocalDate.of(2021, 8, 11), ani, desi);
        pasien1.addConsultation(LocalDate.of(2021, 9, 11), bagus, eka);

        System.out.println(pasien1.getInfo());

        Patient pasien2 = new Patient("997744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }
}
