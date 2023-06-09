public class Product {
    private double price;

    public double getPrice() {
         return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(int quantity) {
        return price * quantity;
    }

    public static class Product1 {
        public static void main(String[] args) {
            Product p = new Product( );
            p.setPrice(10.99);

            System.out.println("Price for a single quantity: $" + p.getPrice());
            System.out.println("Price for 5 quantities: $" + p.getPrice(5));
        }
    }
}
