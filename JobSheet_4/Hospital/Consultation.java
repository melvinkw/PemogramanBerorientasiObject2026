import java.time.LocalDate;

public class Consultation {
    private LocalDate date;
    private Employee doctor;
    private Employee suster;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Employee getDoctor() {
        return doctor;
    }

    public void setDoctor(Employee doctor) {
        this.doctor = doctor;
    }

    public Employee getSuster() {
        return suster;
    }

    public void setSuster(Employee suster) {
        this.suster = suster;
    }

    public String getInfo(){
        String info = "";
        info += "Tanggal Konsultasi     : " + this.date + "\n";
        info += "Dokter                 : " + this.doctor.getInfo() + "\n";
        info += "Suster                 : " + this.suster.getInfo() + "\n";
        info += "\n";
        return info;    
    }
}
