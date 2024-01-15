import java.util.concurrent.atomic.AtomicInteger;

public class BuilderDevice {
    DeviceTypes type;
    String brand;
    String model;
    Double displayDimension;
    Double memoryDimension;
    Double purchasePrice;
    Double salesPrice;
    String description;

    public BuilderDevice(DeviceTypes type, String brand, String model, Double displayDimension, Double memoryDimension, Double purchasePrice, Double salesPrice) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.displayDimension = displayDimension;
        this.memoryDimension = memoryDimension;
        this.purchasePrice = purchasePrice;
        this.salesPrice = salesPrice;
    }

    public BuilderDevice description(String description) {
        this.description = description;
        return this;
    }

    public Device build() {
        return new Device(this);
    }
}
