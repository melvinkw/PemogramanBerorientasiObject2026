public class Q1_Stock {
    private int quantity;
    private int shopNo;
    private Q1_Product product;

    public Q1_Stock(int quantity, int shopNo, Q1_Product product) {
        this.quantity = quantity;
        this.shopNo = shopNo;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getShopNo() {
        return shopNo;
    }

    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }

    public Q1_Product getProduct() {
        return product;
    }

    public void setProduct(Q1_Product product) {
        this.product = product;
    }

    public void addStock() {
        System.out.println("Quantity: " + quantity);
        System.out.println("Shop Number: " + shopNo);
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Product Price: " + product.getProductPrice());
        System.out.println("Product Type: " + product.getProductType());
        System.out.println("Stock added successfully.");
    }

    public void modifyStock(int quantity, int shopNo, Q1_Product product) {
        this.quantity = quantity;
        this.shopNo = shopNo;
        this.product = product;
        System.out.println("Stock information updated successfully.");
    }

    public void selectStock(int quantity, int shopNo, Q1_Product product) {
        System.out.println("Selected Quantity: " + quantity);
        System.out.println("Selected Shop Number: " + shopNo);
        System.out.println("Selected Product ID: " + product.getProductId());
        System.out.println("Selected Product Price: " + product.getProductPrice());
        System.out.println("Selected Product Type: " + product.getProductType());
        System.out.println("Stock selected successfully.");
    }
    
}
