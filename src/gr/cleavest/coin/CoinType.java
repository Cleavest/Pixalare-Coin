package gr.cleavest.coin;

public enum CoinType {

    TEN_HUNDRED(""),
    THOUSAND("Thousand"),
    MILLION("Million"),
    BILLION("Billion"),
    TRILLION("Trillion"),
    QUADRILLION("Quadrillion"),
    QUINTILLION("Quintillion"),
    SEXTILLION("Sextillion"),
    SEPTILLION("Septillion"),
    octillion("Octillion"),
    NONILLION("Nonillion");

    private String name;

    CoinType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
