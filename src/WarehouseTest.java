import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class WarehouseTest {
    Warehouse warehouse = new Warehouse();
    @Test
    void checkIfSearchForPurchasePriceIsValid() {
        Double priceToSearch = null;

        Assertions.assertThrows(NullPointerException.class,()->warehouse.searchForPurchasePrice(priceToSearch));
    }

    @Test
    void checkIfSearchForPurchasePriceReturnIsNotNull(){
        Double input = new Random().nextDouble();

        Assertions.assertNotEquals(warehouse.searchForPurchasePrice(input),null);
    }
    @Test
    void checkIfSearchForPurchasePriceInputIsNegative(){
        double input = -1.0;

        List<Device> result = warehouse.searchForPurchasePrice(input);

        Assertions.assertEquals(result, Collections.emptyList());
    }
    @Test
    void checkNotVoidSearchForPurchasePrice(){
        Double test = 500.00;
        List<Device> listTest = warehouse.searchForPurchasePrice(test);
        Boolean resultVoid = listTest.isEmpty();
//        Boolean resultFull = !listTest.isEmpty();
//        Boolean resultNotNull = listTest != null;

//        List<Device>resultPriceList = new ArrayList<>();
//        for(Device device : warehouse.itemsList()){
//            if (device.getPurchasePrice() == test){
//                resultPriceList.add(device);
//            }
//        }
//        Boolean resultFull2 = listTest == resultPriceList;
//        Boolean resultFull3 = listTest.containsAll(resultPriceList);

        Assertions.assertNotEquals(true,resultVoid);
    }
}
