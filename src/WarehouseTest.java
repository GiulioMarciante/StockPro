import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}