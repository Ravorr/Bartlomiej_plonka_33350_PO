package po.entities;

import po.laboratorium1.Currency;

public class Category {
    private String name = "";

    private static class StringValidator {
        private static final StringValidator INSTANCE = new StringValidator();

        private StringValidator() {

        }

        public static StringValidator getInstance() {
            return INSTANCE;
        }

        public void validate(String value, String errorMessage) {
            if (value == null || value.length() == 0) {
                throw new IllegalArgumentException(errorMessage);
            }
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.length()==0) throw new IllegalArgumentException ("Argumentt nie może mieć watrość 0 lub null");
        else          this.name = name;

        }

    @Override
    public String toString() {
        return "Nazwa kategotii to: "+name;
    }

    private Category(String name) {

        this.name = name;
        setName(name);
    }

    public static Category from(String name){
        return new Category(name);
    }
    public static void main(String[] args) {
        Category kat = new Category("cos");

        // Poprawne ustawienie nazwy
    kat.setName("Bartek");
    System.out.println(kat.getName());
    System.out.println(kat);


        StringValidator validator = Category.StringValidator.getInstance();
        try {
            validator.validate(null, "Test: Null");
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }

        try {
            validator.validate("", "Test: Empty");
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
        Currency plnCurrency = Currency.PLN;
        System.out.println(plnCurrency.getWaluta()); // Wydrukuje: polski złoty
    }
}

