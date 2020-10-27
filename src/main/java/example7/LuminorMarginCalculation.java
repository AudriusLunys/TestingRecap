package example7;

public class LuminorMarginCalculation implements MarginCalculationService {
    @Override
    public double calculateMargin(double input, double otherInput) {
        return input * otherInput * 0.25;
    }
}
