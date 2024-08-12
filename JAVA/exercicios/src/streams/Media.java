package streams;

public class Media {

	private double total;
    private int quantity;

    public Media add(Double value) {
        total += value;
        quantity++;
        return this;
    }

    public double getAvarage() {
        return total / quantity;
    }

    static public Media combine(Media a1, Media a2) {
        Media result = new Media();
        result.quantity = a1.quantity + a2.quantity;
        result.total = a1.total + a2.total;

        return result;
    }
}
