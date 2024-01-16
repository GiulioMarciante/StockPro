public class Product {
    private static int nextId = 1;

    private int id;
    private ProductTypes type;
    private String brand;
    private String model;
    private Double displayDimension;
    private Double memoryDimension;
    private Double purchasePrice;
    private Double salesPrice;
    private String description;

    public Product(ProductTypes type, String brand, String model, Double displayDimension, Double memoryDimension, Double purchasePrice, Double salesPrice, String description ) {
        this.id = nextId++;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.displayDimension = displayDimension;
        this.memoryDimension = memoryDimension;
        this.purchasePrice = purchasePrice;
        this.salesPrice = salesPrice;
        this.description = description;
    }


//    public Product(int id, ProductTypes type, String brand, String model, double displayDimension, double memoryDimension, double purchasePrice, double salesPrice) {
//    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", type=" + type +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", displayDimension=" + displayDimension +
                ", memoryDimension=" + memoryDimension +
                ", salesPrice=" + salesPrice +
                '}';
    }

    public ProductTypes getType() {
        return type;
    }

    public void setType(ProductTypes type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getDisplayDimension() {
        return displayDimension;
    }

    public void setDisplayDimension(Double displayDimension) {
        this.displayDimension = displayDimension;
    }

    public Double getMemoryDimension() {
        return memoryDimension;
    }

    public void setMemoryDimension(Double memoryDimension) {
        this.memoryDimension = memoryDimension;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }
}