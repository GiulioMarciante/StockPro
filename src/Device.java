public class Device {
    private DeviceTypes type;
    private static int nextId = 1;
    private int id;
    private String brand;
    private String model;
    private Double displayDimension;
    private Double memoryDimension;
    private Double purchasePrice;
    private Double salesPrice;
    private String description;

    public Device(BuilderDevice builder) {
        this.type = builder.type;
        this.id = nextId++;
        this.brand = builder.brand;
        this.model = builder.model;
        this.displayDimension = builder.displayDimension;
        this.memoryDimension = builder.memoryDimension;
        this.purchasePrice = builder.purchasePrice;
        this.salesPrice = builder.salesPrice;
        this.description = builder.description;
    }


    public Device(DeviceTypes type, int id, String brand, String model, double displayDimension, double memoryDimension, double purchasePrice, double salesPrice) {
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

    public DeviceTypes getType() {
        return type;
    }

    public void setType(DeviceTypes type) {
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