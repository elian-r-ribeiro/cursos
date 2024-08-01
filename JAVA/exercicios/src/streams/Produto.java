package streams;

public class Produto {

    private final String name;
    private final double price;
    private final double discount;
    private final double freight;

    public Produto(String name, double price, double discount, double freight) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.freight = freight;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public double getDiscount() {
        return discount;
    }
    public double getFreight() {
        return freight;
    }
}
