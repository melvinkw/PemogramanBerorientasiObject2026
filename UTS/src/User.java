class User {
    protected UserProfile userProfile;

    public User(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public void logIn(int userId, String password) {
        if (this.userProfile.getUserId() == userId && this.userProfile.getPassword().equals(password)) {
            System.out.println("[LOGIN] Berhasil! Selamat datang, " + userProfile.getName());
        } else {
            System.out.println("[LOGIN] Gagal! ID atau password salah.");
        }
    }

    public void recoverPassword() {
        System.out.println("[SISTEM] Link pemulihan password telah dikirim ke " + userProfile.getEmail());
    }

    public void logOut() {
        System.out.println("[LOGOUT] " + userProfile.getName() + " telah keluar dari sistem.\n");
    }
}