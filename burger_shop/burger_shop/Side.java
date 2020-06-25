package burger_shop;

public class Side {
    private String sideTypeName;
    private double sideTypePrice;

    public Side(String sideTypeName, double sideTypePrice) {
        this.sideTypeName = sideTypeName;
        this.sideTypePrice = sideTypePrice;
    }
    public String getSideTypeName() {
        return sideTypeName;
    }
    public double getSideTypePrice() {
        return sideTypePrice;
    }

    @Override
    public String toString() {
        return String.format(sideTypeName);
    }
}
