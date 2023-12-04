public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
//        Warehouse.itemsList();

        //Warehouse.searchDeviceBrand("HP");
        //Warehouse.searchDeviceType(TypesDevice.NOTEBOOK);
        //System.out.println(Warehouse.searchDeviceModel("Ipdhone 14"));
//        Warehouse.calculateAverage("smartphone");
//        Warehouse.serchForPurchasePrice(500).forEach(System.out::println);
//        Warehouse.serchForSalesPrice(500).forEach(System.out::println);
//        Warehouse.serchForRange(500,1000).forEach(System.out::println);

        Cart.intoCart(1);
        System.out.println(Cart.userCart);
        System.out.println(Warehouse.deviceList);

        Cart.outOfCart(1);
        System.out.println(Cart.userCart);
    }
}