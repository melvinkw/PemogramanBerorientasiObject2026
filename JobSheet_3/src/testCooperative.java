public class testCooperative {
    public static void main(String[] args) {
        member member1 = new member("111333444", "Melvin", 5000000);

        System.out.println("Member Name: " + member1.getName());
        System.out.println("Loan Limit: " + member1.getLimitLoan());

        System.out.println("\nBorrowing money 10.000.000...");
        member1.borrow(10000000);
        System.out.println("Current loan amount: " + member1.getLoanAmount());

        System.out.println("\nBorrowing money 4.000.000...");
        member1.borrow(4000000);
        System.out.println("Current loan amount: " + member1.getLoanAmount());

        System.out.println("\nPaying 1.000.000 Installment");
        member1.installment(1000000);
        System.out.println("Current loan amount: " + member1.getLoanAmount());

        System.out.println("\nPaying 3.000.000 Installment");
        member1.installment(3000000);
        System.out.println("Current loan amount: " + member1.getLoanAmount());
        

        System.out.println("\n--- TEST VALIDASI TUGAS 2 ---");
        System.out.println("Borrowing money 1.000.000...");
        member1.borrow(1000000); 
        
        System.out.println("Mencoba membayar angsuran 50.000 (kurang dari 10%)...");
        member1.installment(50000);
    }
}
