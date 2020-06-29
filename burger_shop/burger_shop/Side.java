package burger_shop;


public class Side {
    private String side;
    public static final Side FRIES = new Side("Fries");
    public static final Side CHIPS = new Side("Chips");
    public static final Side YOGURT = new Side("Yogurt");
    public static final Side APPLE = new Side("Apple");

    public Side(String side) {
        this.side = side;
    }

    public String getSide() {
        return side;
    }

    public static Side getFRIES() {
        return FRIES;
    }

    public static Side getCHIPS() {
        return CHIPS;
    }

    public static Side getYOGURT() {
        return YOGURT;
    }

    public static Side getAPPLE() {
        return APPLE;
    }

    @Override
    public String toString() {
        return String.format(side);
    }

}
