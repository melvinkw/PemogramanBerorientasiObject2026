class UserProfile {
    private int userId;
    private String password;
    private String name;
    private int age;
    private String email;
    private String doc;

    public UserProfile(int userId, String password, String name, int age, String email, String doc) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email = email;
        this.doc = doc;
    }

    public int getUserId() { return userId; }
    public String getPassword() { return password; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }

    public void editProfile(String newName, String newEmail, int newAge) {
        this.name = newName;
        this.email = newEmail;
        this.age = newAge;
        System.out.println("[SISTEM] Profil berhasil diperbarui menjadi: " + this.name);
    }

    public void showDocuments() {
        System.out.println("[SISTEM] Menampilkan dokumen: " + this.doc);
    }
}