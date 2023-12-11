public class Device {
    private TypesDevice type;
    private int id;
    private String brand;
    private String model;

    //String Description;

    private Double displayDimension;
    private Double memoryDimension;
    private Double purchasePrice;
    private Double salesPrice;


    public Device(TypesDevice type, int id, String brand, String model, Double displayDimension, Double memoryDimension, Double purchasePrice, Double salesPrice) {
        this.type = type;
        this.id = id;
        this.brand = brand;
        this.model = model;
//        this.Description=Description;
        this.displayDimension = displayDimension;
        this.memoryDimension = memoryDimension;
        this.purchasePrice = purchasePrice;
        this.salesPrice = salesPrice;
    }

    @Override
    public String toString() {
        return "Device{" +
                "type=" + type +
                ", id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", displayDimension=" + displayDimension +
                ", memoryDimension=" + memoryDimension +
                ", salesPrice=" + salesPrice +
                '}';
    }

    public TypesDevice getType() {
        return type;
    }

    public void setType(TypesDevice type) {
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

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }
}