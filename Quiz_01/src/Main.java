public class Main {
    public static void main(String[] args) {
        Employee mechanic1 = new Employee("EMP001", "Bapak Joko", "Mechanic");

        Service gantiOli = new Service("Ganti Oli Mesin", 150000.0);
        Service tuneUp = new Service("Tune Up Lengkap", 350000.0);

        Customer customer1 = new Customer("Andi", "081234567890");
        Customer customer2 = new Customer("Siti", "089876543210");

        Vehicle car1 = new Vehicle("N 1234 AB", "Toyota", "Avanza", "Car");
        Vehicle car2 = new Vehicle("B 9876 XYZ", "Honda", "Civic", "Car");
        
        Vehicle motor1 = new Vehicle("N 5678 CD", "Honda", "Vario", "Motorcycle");
        Vehicle motor2 = new Vehicle("AG 4321 EF", "Yamaha", "NMAX", "Motorcycle");

        customer1.addVehicle(car1);
        customer1.addVehicle(motor1);
        
        customer2.addVehicle(car2);
        customer2.addVehicle(motor2);

        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();

        System.out.println("SISTEM INFORMASI BENGKEL MAJU");
        System.out.println("Daftar Estimasi Biaya Servis Kendaraan\n");

        mechanic1.processService(customer1, car1, tuneUp);      
        mechanic1.processService(customer1, motor1, gantiOli);  
        mechanic1.processService(customer2, car2, tuneUp);    
        mechanic1.processService(customer2, motor2, gantiOli);  
    }
}