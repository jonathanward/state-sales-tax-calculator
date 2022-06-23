import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class TaxRate {

    private String currentState = null;
    private BigDecimal currentTaxRate;
    private final Map<String, BigDecimal> stateTaxRates = new HashMap<>();

    public TaxRate() {
        populateStateTaxRates();
    }

    @Override
    public String toString() {
        return getCurrentState() + " tax rate is " + getCurrentTaxRateAsPercent();
    }

    public boolean setCurrentState(String stateAbbreviation) {
        if (stateTaxRates.containsKey(stateAbbreviation)) {
            this.currentState = stateAbbreviation;
            this.currentTaxRate = stateTaxRates.get(currentState);
            return true;
        }
        return false;
    }

    public String getCurrentState() {
        return currentState;
    }

    public BigDecimal getCurrentTaxRate() {
        return currentTaxRate;
    }

    public String getCurrentTaxRateAsPercent() {
        BigDecimal taxRateAsPercentNum = currentTaxRate.multiply(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);
        return taxRateAsPercentNum + "%";
    }

    private void populateStateTaxRates() {
        stateTaxRates.put("AL", BigDecimal.valueOf(.04));
        stateTaxRates.put("AK", BigDecimal.valueOf(.00));
        stateTaxRates.put("AZ", BigDecimal.valueOf(.056));
        stateTaxRates.put("AR", BigDecimal.valueOf(.065));
        stateTaxRates.put("CA", BigDecimal.valueOf(.0725));
        stateTaxRates.put("CO", BigDecimal.valueOf(.0290));
        stateTaxRates.put("CT", BigDecimal.valueOf(.0635));
        stateTaxRates.put("DE", BigDecimal.valueOf(.00));
        stateTaxRates.put("DC", BigDecimal.valueOf(.06));
        stateTaxRates.put("FL", BigDecimal.valueOf(.06));
        stateTaxRates.put("GA", BigDecimal.valueOf(.04));
        stateTaxRates.put("HI", BigDecimal.valueOf(.04));
        stateTaxRates.put("ID", BigDecimal.valueOf(.06));
        stateTaxRates.put("IL", BigDecimal.valueOf(.0625));
        stateTaxRates.put("IN", BigDecimal.valueOf(.07));
        stateTaxRates.put("IA", BigDecimal.valueOf(.06));
        stateTaxRates.put("KS", BigDecimal.valueOf(.065));
        stateTaxRates.put("KY", BigDecimal.valueOf(.06));
        stateTaxRates.put("LA", BigDecimal.valueOf(.0445));
        stateTaxRates.put("ME", BigDecimal.valueOf(.055));
        stateTaxRates.put("MD", BigDecimal.valueOf(.06));
        stateTaxRates.put("MA", BigDecimal.valueOf(.0625));
        stateTaxRates.put("MI", BigDecimal.valueOf(.06));
        stateTaxRates.put("MN", BigDecimal.valueOf(.06875));
        stateTaxRates.put("MS", BigDecimal.valueOf(.07));
        stateTaxRates.put("MO", BigDecimal.valueOf(.04225));
        stateTaxRates.put("MT", BigDecimal.valueOf(.00));
        stateTaxRates.put("NE", BigDecimal.valueOf(.055));
        stateTaxRates.put("NV", BigDecimal.valueOf(.0685));
        stateTaxRates.put("NH", BigDecimal.valueOf(.00));
        stateTaxRates.put("NJ", BigDecimal.valueOf(.06625));
        stateTaxRates.put("NM", BigDecimal.valueOf(.05125));
        stateTaxRates.put("NY", BigDecimal.valueOf(.04));
        stateTaxRates.put("NC", BigDecimal.valueOf(.0475));
        stateTaxRates.put("ND", BigDecimal.valueOf(.05));
        stateTaxRates.put("OH", BigDecimal.valueOf(.0575));
        stateTaxRates.put("OK", BigDecimal.valueOf(.045));
        stateTaxRates.put("OR", BigDecimal.valueOf(.00));
        stateTaxRates.put("PA", BigDecimal.valueOf(.06));
        stateTaxRates.put("RI", BigDecimal.valueOf(.07));
        stateTaxRates.put("SC", BigDecimal.valueOf(.06));
        stateTaxRates.put("SD", BigDecimal.valueOf(.045));
        stateTaxRates.put("TN", BigDecimal.valueOf(.07));
        stateTaxRates.put("TX", BigDecimal.valueOf(.0625));
        stateTaxRates.put("UT", BigDecimal.valueOf(.061));
        stateTaxRates.put("VT", BigDecimal.valueOf(.06));
        stateTaxRates.put("VA", BigDecimal.valueOf(.053));
        stateTaxRates.put("WA", BigDecimal.valueOf(.065));
        stateTaxRates.put("WV", BigDecimal.valueOf(.06));
        stateTaxRates.put("WI", BigDecimal.valueOf(.05));
        stateTaxRates.put("WY", BigDecimal.valueOf(.04));
    }

}