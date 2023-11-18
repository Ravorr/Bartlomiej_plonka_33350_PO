package po.laboratorium1;

public enum Currency {
    PLN("polski złoty"),
    USD("dolar amerykański");

    private final String waluta;

    Currency(String name) {
        this.waluta = name;
        System.out.println(name);
    }

    public String getWaluta() {
        return waluta;
    }
}
