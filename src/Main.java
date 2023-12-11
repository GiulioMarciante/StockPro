public class Main {
    Warehouse warehouse = new Warehouse();

    public static void main(String[] args) {


//        Warehouse.itemsList().forEach(System.out::println);
//        warehouse.searchDeviceBrand("").forEach(System.out::println);
//        Warehouse.searchDeviceType(TypesDevice.TABLET).forEach(System.out::println);
//        Warehouse.searchDeviceModel("Iphone 14").forEach(System.out::println);
//        Warehouse.calculateAverage("notebook").forEach(System.out::println);
//        Warehouse.serchForPurchasePrice(500).forEach(System.out::println);
//        Warehouse.serchForSalesPrice(500).forEach(System.out::println);
//        Warehouse.serchForRange(500,1000).forEach(System.out::println);

        ManageCart.intoCart(1);
        ManageCart.intoCart(3);
        ManageCart.intoCart(4);
        System.out.println(Cart.userCart);
        System.out.println(Warehouse.deviceList);

        System.out.println(ManageCart.totalCart());

//        ManageCart.outOfCart(1);
//        System.out.println(Cart.userCart);


    }
}