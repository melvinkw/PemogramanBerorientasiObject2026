public class Q1_Product {
    private int productId;
    private float productPrice;
    private String productType;

    public  Q1_Product (int productId, float productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void addProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Product Type: " + productType);
        System.out.println("Product added successfully.");
    }

    public void modifyProduct(int productId, float productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
        System.out.println("Product information updated successfully.");
    }

    public void selectProduct(int productId) {
        System.out.println("Selected Product ID: " + productId);
        System.out.println("Selected Product Price: " + productPrice);
        System.out.println("Selected Product Type: " + productType);
        System.out.println("Product selected successfully.");
    }
}
