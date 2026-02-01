public class PTIT_CNTT3_IT203_Session06_Ex03 {
    static class Product {
        private String productId;
        private String productName;
        private double price;

        public Product(String productId, String productName, double price) {
            this.productId = productId;
            this.productName = productName;
            setPrice(price); // use setter to validate
        }

        public String getProductId() {
            return productId;
        }

        public String getProductName() {
            return productName;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            if (price > 0) {
                this.price = price;
            } else {
                System.out.println("Invalid price! Price must be greater than 0.");
            }
        }

        public void displayInfo() {
            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("----------------------");
        }

    }
    public static void main(String[] args) {
        Product p1 = new Product("P001", "Laptop", 1500);
        p1.displayInfo();

        p1.setPrice(-500);

        p1.displayInfo();

        p1.setPrice(1200);
        p1.displayInfo();
    }
}
