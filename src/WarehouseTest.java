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

        Assertions.assertThrows(NullPointerException.class, () -> warehouse.searchForPurchasePrice(priceToSearch));
    }

    @Test
    void checkIfSearchForPurchasePriceReturnIsNotNull() {
        Double input = new Random().nextDouble();

        Assertions.assertNotEquals(warehouse.searchForPurchasePrice(input), null);
    }

    @Test
    void checkIfSearchForPurchasePriceInputIsNegative() {
        double input = -1.0;

        List<Product> result = warehouse.searchForPurchasePrice(input);

        Assertions.assertEquals(result, Collections.emptyList());
    }

    @Test
    void checkIfSearchForRangeGoesErrorWithOneInputNull() {
        Double input1 = null;
        Double input2 = 344.00;

        Assertions.assertThrows(NullPointerException.class, () -> warehouse.searchForRange(input1, input2));

    }

    @Test
    void checkIfSearchForRangeGoesErrorWithSecondInputNull() {
        Double input1 = 422.00;
        Double input2 = null;

        Assertions.assertThrows(NullPointerException.class, () -> warehouse.searchForRange(input1, input2));
    }

    @Test
    void checkIfSearchForRangeGoesErrorWithTwoInputNull() {
        Double input1 = null;
        Double input2 = null;

        Assertions.assertThrows(NullPointerException.class, () -> warehouse.searchForRange(input1, input2));
    }

    @Test
    void checkIfSearchForSalesPriceInputIsNull() {

        Double input = null;
        Assertions.assertThrows(NullPointerException.class, () -> warehouse.searchForSalesPrice(input));
    }

    @Test
    void checkIfSearchForSalesPriceReturnNullList() {
        Double input = 230.99;
        List<Product> result = warehouse.searchForSalesPrice(input);
        Assertions.assertNotEquals(null, result);

    }

    @Test
    void checkIfSearchForSalesPriceInputIsNegativeNumber() {
        Double input = -234.99;
        List<Product> result = warehouse.searchForSalesPrice(input);
        Assertions.assertTrue(result.isEmpty(), "Se l'input è negativo dovrebbe tornare una lista vuota");
    }

}