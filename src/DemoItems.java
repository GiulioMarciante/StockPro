import java.util.ArrayList;
import java.util.List;

public class DemoItems {
    Product product1 = new ProductBuilder().type(ProductTypes.SMARTPHONE).brand("Samsung").model("Galaxy S23").displayDimension(6.6).memoryDimension(256.0).salesPrice(550.0).purchasePrice(1099.99).description("Bel telefono").build();
    Product product2 = new ProductBuilder().type(ProductTypes.SMARTPHONE).brand("Apple").model("Iphone 14").displayDimension(6.1).memoryDimension(128.0).salesPrice(500.0).purchasePrice(899.99).build();

//    Product product3 = new ProductBuilder().type(ProductTypes.SMARTPHONE).brand("Motorola").model("Galaxy S23").displayDimension(6.6).memoryDimension(256.0).salesPrice(550.0).purchasePrice(1099.99).description("Bel telefono").build();
//    Product product4 = new ProductBuilder().type(ProductTypes.TABLET).brand("Apple").model("Galaxy S23").displayDimension(6.6).memoryDimension(256.0).salesPrice(550.0).purchasePrice(1099.99).description("Bel telefono").build();
//    Product product5 = new ProductBuilder().type(ProductTypes.TABLET).brand("Lenovo").model("Galaxy S23").displayDimension(6.6).memoryDimension(256.0).salesPrice(550.0).purchasePrice(1099.99).description("Bel telefono").build();
//    Product product6 = new ProductBuilder().type(ProductTypes.TABLET).brand("HP").model("Galaxy S23").displayDimension(6.6).memoryDimension(256.0).salesPrice(550.0).purchasePrice(1099.99).description("Bel telefono").build();
//    Product product7 = new ProductBuilder().type(ProductTypes.NOTEBOOK).brand("Apple").model("Galaxy S23").displayDimension(6.6).memoryDimension(256.0).salesPrice(550.0).purchasePrice(1099.99).description("Bel telefono").build();
//    Product product8 = new ProductBuilder().type(ProductTypes.NOTEBOOK).brand("MSI").model("Galaxy S23").displayDimension(6.6).memoryDimension(256.0).salesPrice(550.0).purchasePrice(1099.99).description("Bel telefono").build();
//    Product product9 = new ProductBuilder().type(ProductTypes.NOTEBOOK).brand("Samsung").model("Galaxy S23").displayDimension(6.6).memoryDimension(256.0).salesPrice(550.0).purchasePrice(1099.99).description("Bel telefono").build();
//
//
//    Product product3 = new ProductBuilder (ProductTypes.SMARTPHONE, "Motorola", "Edge 30 Neo", 6.3, 256.0, 200.0, 299.90)
//            .build();
//    Product product4 = new ProductBuilder (ProductTypes.TABLET, "Samsung", "Galaxy Tab S7 FE", 12.4, 256.0, 230.0, 559.18)
//            .build();
//    Product product5 = new ProductBuilder (ProductTypes.TABLET, "Apple", "iPad Pro", 11.0, 512.0, 950.0, 1449.00)
//            .build();
//    Product product6 = new ProductBuilder (ProductTypes.TABLET, "Lenovo", "Tab M10", 10.1, 64.0, 50.0, 159.00)
//            .build();
//    Product product7 = new ProductBuilder (ProductTypes.NOTEBOOK, "HP", "250 G9", 15.6, 512.0, 400.0, 849.99)
//            .build();
//    Product product8 = new ProductBuilder (ProductTypes.NOTEBOOK, "Apple", "MacBook Air", 15.3, 256.0, 900.0, 1499.99)
//            .build();
//    Product product9 = new ProductBuilder (ProductTypes.NOTEBOOK, "MSI", "Katana 17 B12VGK", 17.3, 1000.0, 1200.0, 2199.99)
//            .build();

    private List<Product> productList = demoItems();

    public List<Product> demoItems(){
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
//        productList.add(product3);
//        productList.add(product4);
//        productList.add(product5);
//        productList.add(product6);
//        productList.add(product7);
//        productList.add(product8);
//        productList.add(product9);
        return productList;
    }

    public List<Product> getDeviceList() {
        return productList;
    }

}



