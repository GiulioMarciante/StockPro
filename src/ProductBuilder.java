public class ProductBuilder {
    ProductTypes type;
    String brand;
    String model;
    Double displayDimension;
    Double memoryDimension;
    Double purchasePrice;
    Double salesPrice;
    String description;

    public ProductBuilder type(ProductTypes type) {
        this.type = type;
        return this;
    }
    public ProductBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }
    public ProductBuilder model(String model) {
        this.model = model;
        return this;
    }
    public ProductBuilder displayDimension(Double displayDimension) {
        this.displayDimension = displayDimension;
        return this;
    }
    public ProductBuilder memoryDimension(Double memoryDimension) {
        this.memoryDimension = memoryDimension;
        return this;
    }
    public ProductBuilder purchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }
    public ProductBuilder salesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
        return this;
    }


    public ProductBuilder description(String description) {
        this.description = description;
        return this;
    }

    public Product build() {
        return new Product (type, brand, model, displayDimension, memoryDimension, purchasePrice, salesPrice, description);
    }
}
