class Admin extends User {
    
    public Admin(UserProfile userProfile) {
        super(userProfile);
    }

    public void updateVehicleDetails(String vehicleId) {
        System.out.println("[ADMIN] Memperbarui detail kendaraan dengan ID: " + vehicleId);
    }

    public void addVehicle(String vehicleData) {
        System.out.println("[ADMIN] Menambahkan kendaraan baru: " + vehicleData);
    }

    public void retrieveComplain() {
        System.out.println("[ADMIN] Mengambil daftar keluhan pengguna dari sistem.");
    }

    public void verifyUser(Customer customer) {
        System.out.println("[ADMIN] Memverifikasi akun customer: " + customer.userProfile.getName());
        // Logika untuk mengubah status verifikasi customer bisa ditambahkan di sini
    }
}