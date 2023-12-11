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
        CartManage.intoCart(3);
        CartManage.intoCart(1);
        System.out.println(Cart.userCart);
        System.out.println(CartManage.totalCart());


    }
}