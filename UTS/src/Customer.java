class Customer extends User {
    private boolean verificationStatus = false;

    public Customer(UserProfile userProfile) {
        super(userProfile);
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(String docType) {
        // Validasi format dokumen
        if (docType.equalsIgnoreCase("jpg") || docType.equalsIgnoreCase("png") || docType.equalsIgnoreCase("pdf")) {
            this.verificationStatus = true;
            System.out.println("[VERIFIKASI] Dokumen (" + docType + ") berhasil diunggah. Status: Terverifikasi.");
        } else {
            System.out.println("[VERIFIKASI] Gagal! Format dokumen harus jpg, png, atau pdf.");
        }
    }
}