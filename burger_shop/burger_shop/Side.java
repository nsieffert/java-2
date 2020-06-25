package burger_shop;

public class Side {
    private String sideType;

    public Side(String sideType) {
        this.sideType = sideType;
    }

    public String getSideType() {
        return sideType;
    }

    @Override
    public String toString() {
        return String.format(sideType);
    }
}
