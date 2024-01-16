public class Main {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
//        CartManager cartManager = new CartManager();
//        Cart cart = new Cart();


//        MenuChoice.mainChoice();
        warehouse.itemsList().forEach(System.out::println);
//        cartManager.intoCart(2);
//        System.out.println(Cart.userCart);
//        warehouse.addItem("Notebook","gesgwe","ergh",12.6, 23.6, 123.56, 345.8);
//        System.out.println(warehouse.itemsList());
//        cartManager.intoCart(10);
//        System.out.println(Cart.userCart);
        warehouse.addItem("Notebook", "Dell", "XPS", 15.6, 16.0, 1200.0, 1500.0, "High-performance laptop");
        warehouse.addItem("Smartphone", "Samsung", "Galaxy S21", 6.2, 8.0, 800.0, 1000.0); // Descrizione non fornita

    }
}
