import java.util.ArrayList;

public class Customer {
    private String name;
    private String phoneNumber;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.ownedVehicles = new ArrayList<>();
    }

    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }

    public String getPhoneNumber() { 
        return phoneNumber; 
    }
    public void setPhoneNumber(String phoneNumber) { 
        this.phoneNumber = phoneNumber; 
    }

    public void addVehicle(Vehicle vehicle) {
        this.ownedVehicles.add(vehicle);
        vehicle.setOwner(this);
    }

    public ArrayList<Vehicle> getOwnedVehicles() { 
        return ownedVehicles; 
    }

    public void displayCustomerInfo() {
        System.out.println("Data Pelanggan  : " + name);
        System.out.println("No. Telepon     : " + phoneNumber);
        System.out.println("Daftar Kendaraan:");
        
        // Cek apakah list kendaraan kosong
        if (ownedVehicles.isEmpty()) {
            System.out.println("- Belum ada kendaraan yang terdaftar.");
        } else {
            for (Vehicle vehicle : ownedVehicles) {
                System.out.println("- " + vehicle.getVehicleInfo());
            }
        }
        System.out.println("-----------------------------------------");
    }
}