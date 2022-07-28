package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

// storeName:price:discountCode
public final class Aula243Quote {
    private final String store;
    private final double price;
    private final Aula243Discount.Code discountCode;

    private Aula243Quote(String store, double price, Aula243Discount.Code discountCode) {
        this.store = store;
        this.price = price;
        this.discountCode = discountCode;
    }

    /**
     * Creates new Quote object from the value following the pattern storeName:price:discountCode
     *
     * @param value containing storeName:price:discountCode
     * @return new Quote with values from @param value
     */
    public static Aula243Quote newQuote(String value) {
        String[] values = value.split(":");
        return new Aula243Quote(values[0], Double.parseDouble(values[1]), Aula243Discount.Code.valueOf(values[2]));
    }

    @Override
    public String toString() {
        return "Aula243Quote{" +
                "store='" + store + '\'' +
                ", price=" + price +
                ", discountCode=" + discountCode +
                '}';
    }

    public String getStore() {
        return store;
    }

    public double getPrice() {
        return price;
    }

    public Aula243Discount.Code getDiscountCode() {
        return discountCode;
    }
}
