import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class TaxRateTest {
    @Test
    public void set_current_state_updates_current_state_and_current_tax_rate() {
        TaxRate myTaxRate = new TaxRate();

        Map<String, BigDecimal> expectedValue = new HashMap<>();
        expectedValue.put("TX", BigDecimal.valueOf(.0625));

        Map<String, BigDecimal> testValue = new HashMap<>();
        myTaxRate.setCurrentState("TX");
        testValue.put(myTaxRate.getCurrentState(), myTaxRate.getCurrentTaxRate());

        Assert.assertEquals(expectedValue, testValue);
    }
}
