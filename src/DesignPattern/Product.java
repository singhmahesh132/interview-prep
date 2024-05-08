package src.DesignPattern;

public class Product {

    private String name;
    private long value;
    private int quantity;

    private Product() {
    }

    @Override
    public String toString() {
        return "DesignPattern.Product{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                '}';
    }

    public static class ProductBuilder {
        private Product product;

        public ProductBuilder() {
            product = new Product();
        }

        public ProductBuilder name(String name) {
            product.name = name;
            return this;
        }

        public ProductBuilder value(long value) {
            product.value = value;
            return this;
        }

        public ProductBuilder quantity(int quantity) {
            product.quantity = quantity;
            return this;
        }

        public Product build() {
            return product;
        }
    }
}
