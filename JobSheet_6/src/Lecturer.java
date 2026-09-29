public class Lecturer extends Employee {
    public String nidn;

    public Lecturer(String nip, String name, double salary, String nidn){
        // this.nip = nip;
        // this.name = name;
        // this.salary = salary;
        // this.nidn = nidn;

        // super.nip = nip;
        // super.name = name;
        // super.salary = salary;
        // this.nidn = nidn;

        // super();
        // super.nip = nip;
        // super.name = name;
        // super.salary = salary;
        // this.nidn = nidn;

        // this.nidn = nidn;
        // super(nip, name, salary);

       
        super(nip, name, salary);
        this.nidn = nidn;
    }

    public String getInfo() {
        return "NIDN        : " + this.nidn +"\n";
    }

    public String getAllInfo(){
        String info= super.getInfo();
        info += this.getInfo();

        return info;
    }
}
