import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Q1_Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("      SIMULASI SISTEM ORDER & STOK       ");
        System.out.println("=========================================\n");

        Q1_Customer customer1 = new Q1_Customer(101, "Ahmad", "Jl. Suhat Raya No.10, Malang", 812345678);
        System.out.println("--- PROSES PENAMBAHAN CUSTOMER ---");
        customer1.addCustomer();
        System.out.println();

        Q1_Product laptop = new Q1_Product(201, 15000000.0f, "Laptop Asus ROG");
        Q1_Product mouse = new Q1_Product(202, 500000.0f, "Mouse Logitech G502");
        System.out.println("--- PROSES PENAMBAHAN PRODUK ---");
        laptop.addProduct();
        mouse.addProduct();
        System.out.println();

        Q1_Stock stockLaptop = new Q1_Stock(15, 1, laptop);
        Q1_Stock stockMouse = new Q1_Stock(50, 1, mouse);
        System.out.println("--- PROSES PENCATATAN STOK ---");
        stockLaptop.addStock();
        System.out.println();

        List<Q1_Product> orderedProducts = new ArrayList<>();
        orderedProducts.add(laptop);
        orderedProducts.add(mouse);

        float totalAmount = laptop.getProductPrice() + mouse.getProductPrice();

        Q1_Order order1 = new Q1_Order(5001, totalAmount, new Date(), customer1, orderedProducts);

        System.out.println("--- DETAIL TRANSAKSI (CREATE ORDER) ---");
        order1.createOrder();
        
        System.out.println("=========================================");
    }
}