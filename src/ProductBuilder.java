public class ProductBuilder {
    ProductTypes type;
    String brand;
    String model;
    Double displayDimension;
    Double memoryDimension;
    Double purchasePrice;
    Double salesPrice;
    String description;

    public ProductBuilder(ProductTypes type, String brand, String model, Double displayDimension, Double memoryDimension, Double purchasePrice, Double salesPrice) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.displayDimension = displayDimension;
        this.memoryDimension = memoryDimension;
        this.purchasePrice = purchasePrice;
        this.salesPrice = salesPrice;
    }

    public ProductBuilder description(String description) {
        this.description = description;
        return this;
    }

    public Product build() {
        return new Product(this);
    }
}
