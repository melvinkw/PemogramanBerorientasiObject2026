
public class MainSystem {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI SISTEM MANAJEMEN USER ===\n");

        UserProfile profileCustomer = new UserProfile(101, "passAndi", "Andi", 25, "andi@email.com", "ktp.jpg");
        UserProfile profileAdmin = new UserProfile(999, "adminSuper", "Budi", 40, "budi@admin.com", "sk.pdf");

        Customer customer = new Customer(profileCustomer);
        Admin admin = new Admin(profileAdmin);

        System.out.println("--- Alur Customer ---");
        customer.logIn(101, "passAndi"); 
        customer.userProfile.showDocuments(); 
        customer.applyVerification("jpg");
        System.out.println("Status Verifikasi Customer: " + customer.getVerificationStatus());
        customer.logOut(); 

        System.out.println("--- Alur Admin ---");
        admin.logIn(999, "adminSuper"); 
        admin.addVehicle("Mobil - B 1234 XYZ"); 
        admin.updateVehicleDetails("V-001");
        admin.retrieveComplain();
        admin.verifyUser(customer); 
        admin.logOut();
    }
}