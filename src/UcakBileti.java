public class UcakBileti {
    private int distance;
    private double price;
    private boolean twoWay;
    final private double unitPrice = 0.10;

    public UcakBileti(int distance, boolean twoWay) {
        this.distance = distance;
        this.twoWay = twoWay;
    }

    public double calculatePrice(int age) {
        if (age < 12) {
            this.price = this.distance * unitPrice * 0.5;
        } else if (age < 24) {
            this.price = this.distance * unitPrice * 0.9;
        } else if (age > 65) {
            this.price = this.distance * unitPrice * 0.7;
        } else {
            this.price = this.distance * unitPrice;
        }
        if (this.twoWay) {
            return this.price * .80;
        }
        return this.price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "distance=" + distance +
                ", price=" + price +
                '}';
    }
}
