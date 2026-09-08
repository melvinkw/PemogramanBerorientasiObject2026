public class member {
    private String idCardNumber;
    private String name;
    private int limitLoan;
    private int loanAmount;

    public member(String idCardNumber, String name, int limitLoan) {
        this.idCardNumber = idCardNumber;
        this.name = name;
        this.limitLoan = limitLoan;
        this.loanAmount = 0;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public String getName() {
        return name;
    }

    public int getLimitLoan() {
        return limitLoan;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void borrow(int amount) {
        if ((this.loanAmount + amount) > this.limitLoan) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            this.loanAmount += amount;
            System.out.println("Jumlah pinjaman saat ini: " + this.loanAmount);
        }
    }

    public void installment(int amount) {
        double minimumInstallment = this.loanAmount * 0.10;

        if (amount < minimumInstallment) {
            System.out.println("Maaf, jumlah angsuran kurang dari 10% dari jumlah pinjaman");
        } else {
            this.loanAmount -= amount;
            
            if (this.loanAmount < 0) {
                this.loanAmount = 0;
            }
        }
    }
}
