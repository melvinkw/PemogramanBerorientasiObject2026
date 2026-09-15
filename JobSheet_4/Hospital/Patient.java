import java.util.ArrayList;
import java.time.LocalDate;

public class Patient {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Consultation> ConsultationHistory;

    public Patient(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.ConsultationHistory = new ArrayList<Consultation>();
    }

    public void addConsultation(LocalDate date, Employee doctor, Employee suster){
        Consultation consultation = new Consultation();
        consultation.setDate(date);
        consultation.setDoctor(doctor);
        consultation.setSuster(suster);
        this.ConsultationHistory.add(consultation);
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo(){
        String info = "";
        info += "No Rekam Medis         : " + this.noRekamMedis + "\n";
        info += "Nama                   : " + this.nama + "\n";

        if(!this.ConsultationHistory.isEmpty()){
            info += "Riwayat Konsultasi        : \n";
            for(Consultation consultation : this.ConsultationHistory){
                info += consultation.getInfo();
            }
        }
        else {
            info += "Belum ada riwayat konsultasi\n";
        }
        info += "\n";
        return info;    
    }
}