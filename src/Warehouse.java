import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;



public class Warehouse {
    private static DemoItems demoItems = new DemoItems();
    static List<Product> productList = demoItems.getDeviceList();


    public List<Product> itemsList() {
        return new ArrayList<>(productList);
    }

    public List<Product> searchDeviceType(ProductTypes type) {
        boolean foundDevice = false;
        List<Product> searchProductTypeList = new ArrayList<>();

        for (Product product : productList) {
            switch (type) {
                case TABLET:
                case NOTEBOOK:
                case SMARTPHONE:
                    if (product.getType().equals(type)) {
                        searchProductTypeList.add(product);
                    }
                    break;
                default:
                    break;
            }
        }
        return searchProductTypeList;
    }

    public List<Product> searchDeviceBrand(String brand) {
        List<Product> searchBrandResult = new ArrayList<>();
        String brandLowerCase = brand.toLowerCase();
        for (Product product : productList) {
            if (product.getBrand().toLowerCase().equals(brandLowerCase)) {
                searchBrandResult.add(product);
            }
        }
        return searchBrandResult;
    }

    public List<Product> searchDeviceModel(String model) {
        List<Product> searchModelResult = new ArrayList<>();
        String modelLowerCase = model.toLowerCase();
        for (Product product : productList) {
            if (product.getModel().toLowerCase().equals(modelLowerCase)) {
                searchModelResult.add(product);
            }
        }
        return searchModelResult;

    }

    public List<Product> calculateAverage(String type) {

        List<Product> typePrices = new ArrayList<>();
        double total = 0.0;


        for (Product product : productList) {
            if (product.getType().name().equals(type.toUpperCase())) {

                typePrices.add(product);
                total += product.getPurchasePrice();

            }
        }
        if (!typePrices.isEmpty()) {

            BigDecimal average = BigDecimal.valueOf(total / typePrices.size()).setScale(2, RoundingMode.HALF_EVEN);
            System.out.println("La media dei prezzi d'acquisto per " + type.toUpperCase() + " è: " + average);
            System.out.println("Hai ricercato i seguenti dispositivi: ");

        } else {
            System.out.println("Non ci sono dispositivi del tipo " + type.toUpperCase());
        }
        return typePrices;
    }

    public List<Product> searchForPurchasePrice(double input) {

        ArrayList<Product> result = new ArrayList<>();

        for (Product product : productList) {
            if (product.getPurchasePrice() <= input) {
                result.add(product);
            }
        }
        return result;
    }

    public List<Product> searchForSalesPrice(double input) {

        ArrayList<Product> result = new ArrayList<>();

        for (Product product : productList) {
            if (product.getSalesPrice() <= input) {
                result.add(product);
            }
        }
        return result;
    }

    public List<Product> searchForRange(double minInput, double maxInput) {

        List<Product> result = new ArrayList<>();

        for (Product product : productList) {
            if (minInput > maxInput) {
                if (product.getSalesPrice() >= maxInput && product.getSalesPrice() <= minInput) {
                    result.add(product);
                }
            } else {
                if (product.getSalesPrice() >= minInput && product.getSalesPrice() <= maxInput) {
                    result.add(product);
                }
            }
        }
        return result;
    }

    public void addItem(String type, String brand, String model, Double displayDimension, Double memoryDimension, Double purchasePrice, Double salesPrice, String description) {
        if ("Notebook".equalsIgnoreCase(type) || "Smartphone".equalsIgnoreCase(type) || "Tablet".equalsIgnoreCase(type)) {
            ProductTypes productTypes = ProductTypes.fromString(type);

            if (!description.equals("")) {
                Product product = new ProductBuilder(productTypes, brand, model, displayDimension, memoryDimension, purchasePrice, salesPrice).description(description).build();

                productList.add(product);
            } else {
                Product product = new ProductBuilder(productTypes, brand, model, displayDimension, memoryDimension, purchasePrice, salesPrice)
                        .description("Descrizione non inserita")
                        .build();

                productList.add(product);
            }
        }
    }
}






