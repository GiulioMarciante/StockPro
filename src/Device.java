public class Device {
    TypesDevice type;
    int Id;
    String Productor;
    String Model;
//    String Description;
    Double DisplayDimension;
    Double MemoryDimension;
    Double PurchasePrice;
    Double SalesPrice;


    public Device(TypesDevice type, int Id, String Productor, String Model, Double DisplayDimension, Double MemoryDimension, Double PurchasePrice, Double SalesPrice ) {
        this.type=type;
        this.Id=Id;
        this.Productor=Productor;
        this.Model=Model;
//        this.Description=Description;
        this.DisplayDimension=DisplayDimension;
        this.MemoryDimension=MemoryDimension;
        this.PurchasePrice=PurchasePrice;
        this.SalesPrice=SalesPrice;
    }
}
