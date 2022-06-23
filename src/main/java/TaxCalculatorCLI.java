public class TaxCalculatorCLI {

    private static final String MAIN_MENU_OPTION_SET_STATE = "Set State";
    private static final String MAIN_MENU_OPTION_CALCULATE_TAX = "Calculate Tax";
    private static final String MAIN_MENU_OPTION_EXIT = "Exit";
    private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_SET_STATE, MAIN_MENU_OPTION_CALCULATE_TAX, MAIN_MENU_OPTION_EXIT };

    private final Menu menu;

    public TaxCalculatorCLI(Menu menu) {
        this.menu = menu;
    }

    public void run() {
        while (true) {
            String choice = menu.selectOption(MAIN_MENU_OPTIONS);
            if (choice.equals(MAIN_MENU_OPTION_SET_STATE)) {
                menu.chooseState();
            } else if (choice.equals(MAIN_MENU_OPTION_CALCULATE_TAX)) {
                if (!menu.isStateSet()) {
                    menu.chooseState();
                }
                if (menu.isStateSet()) {
                    menu.runTaxCalculation();
                }
            } else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu(System.in);
        TaxCalculatorCLI program = new TaxCalculatorCLI(menu);
        program.run();
    }
}
