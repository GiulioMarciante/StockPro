public class Device {
    TypesDevice type;
    int id;
    String brand;
    String model;
//    String Description;
    Double displayDimension;
    Double memoryDimension;
    Double purchasePrice;
    Double salesPrice;


    public Device(TypesDevice type, int id, String brand, String model, Double displayDimension, Double memoryDimension, Double purchasePrice, Double salesPrice ) {
        this.type=type;
        this.id=id;
        this.brand=brand;
        this.model=model;
//        this.Description=Description;
        this.displayDimension=displayDimension;
        this.memoryDimension=memoryDimension;
        this.purchasePrice=purchasePrice;
        this.salesPrice=salesPrice;
    }
}
