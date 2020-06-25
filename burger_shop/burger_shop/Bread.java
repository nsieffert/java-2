package burger_shop;

public class Bread {
    private String breadType;

    public Bread(String breadType) {
        this.breadType = breadType;

    }

    public String getBreadType() {
        return breadType;
    }

    @Override
    public String toString() {
        return String.format(breadType);
    }
}
