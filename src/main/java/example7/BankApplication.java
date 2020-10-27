package example7;


public class BankApplication {
    private static final double FIXED_MARGIN = 2;
    private MarginCalculationService marginCalculationService;


    public void setMarginCalculationService(MarginCalculationService marginCalculationService) {
        this.marginCalculationService = marginCalculationService;
    }
    public double doComplicatedMarginCalculations(double input, double otherInput) {
        return marginCalculationService.calculateMargin(input, otherInput);
    }

    public double smartCalculateMonthly(double input, double otherInput) {
        return marginCalculationService.calculateMargin(input, otherInput) + 4.0*FIXED_MARGIN;
    }
}
