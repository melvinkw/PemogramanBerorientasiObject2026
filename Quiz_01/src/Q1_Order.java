import java.util.Date;
import java.util.List;

public class Q1_Order {
    private int orderId;
    private float amount;
    private Date orderDate;
    private Q1_Customer customer; 
    private List<Q1_Product> products;

    public Q1_Order(int orderId, float amount, Date orderDate, Q1_Customer customer, List<Q1_Product> products) {
        this.orderId = orderId;
        this.amount = amount;
        this.orderDate = orderDate;
        this.customer = customer;
        this.products = products;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Q1_Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Q1_Customer customer) {
        this.customer = customer;
    }

    public List<Q1_Product> getProducts() {
        return products;
    }

    public void setProducts(List<Q1_Product> products) {
        this.products = products;
    }

    public void createOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: " + amount);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Address: " + customer.getAddress());
        System.out.println("Customer Phone Number: " + customer.getPhoneNumber());
        System.out.println("Products in the Order:");
        for (Q1_Product product : products) {
            System.out.println("- Product ID: " + product.getProductId() +
                    ", Price: " + product.getProductPrice() +
                    ", Type: " + product.getProductType());
        }
        System.out.println("Order created successfully.");
    }

    public void editOrder(int orderId, float amount, Date orderDate, Q1_Customer customer, List<Q1_Product> products) {
        this.orderId = orderId;
        this.amount = amount;
        this.orderDate = orderDate;
        this.customer = customer;
        this.products = products;
        System.out.println("Order information updated successfully.");
    }


}
