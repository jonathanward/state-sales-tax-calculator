import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculator {

    public static BigDecimal calculateTax(BigDecimal price, TaxRate taxRate) {
        return price.multiply(taxRate.getCurrentTaxRate()).setScale(2, RoundingMode.HALF_UP);
    }

    public static BigDecimal calculateTotal(BigDecimal price, BigDecimal tax) {
        return price.add(tax).setScale(2, RoundingMode.HALF_UP);
    }

}
