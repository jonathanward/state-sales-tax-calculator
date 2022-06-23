import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculatorTest {
    @Test
    public void calculate_tax_expects_big_decimal() {
        TaxRate taxRate = new TaxRate();
        taxRate.setCurrentState("TX");
        BigDecimal testValue = TaxCalculator.calculateTax(BigDecimal.valueOf(4.99), taxRate);

        BigDecimal expectedValue = BigDecimal.valueOf(0.31).setScale(2, RoundingMode.HALF_UP);

        Assert.assertEquals(expectedValue, testValue);
    }

    @Test
    public void calculate_total_expects_big_decimal() {
        BigDecimal testValue = TaxCalculator.calculateTotal(BigDecimal.valueOf(4.99), BigDecimal.valueOf(0.31));

        BigDecimal expectedValue = BigDecimal.valueOf(5.30).setScale(2, RoundingMode.HALF_UP);

        Assert.assertEquals(expectedValue, testValue);
    }

}
