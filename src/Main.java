public class Main {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        CartManager cartManager = new CartManager();
        Cart cart = new Cart();


//        Choice.mainChoice();
//        System.out.println(warehouse.itemsList());
//        cartManager.intoCart(2);
//        System.out.println(Cart.userCart);
        warehouse.addItem("Notebook","gesgwe","ergh",12.6, 23.6, 123.56, 345.8);
        System.out.println(warehouse.itemsList());
        cartManager.intoCart(10);
        System.out.println(Cart.userCart);
    }
}
