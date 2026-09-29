public class Employee {
    public String nip;
    public String name;
    protected  double salary;
    
    public Employee (String nip, String name, double salary) {
        System.out.println("Object from Employee class are made");
    }

    public String getInfo(){
        String info = "";
        info += "NIP        : " + this.nip + "\n";
        info += "Name       : " + this.name + "\n";
        info += "Salary     : " + this.salary + "\n";
        return info;
    }
}
