package burger_shop;

public class Meal {
    private HealthBurger healthBurger;
    private DeluxeBurger deluxeBurger;
    private BasicBurger basicBurger;
    private double price;

    public Meal(BasicBurger basicBurger, double price) {
        this.basicBurger = basicBurger;
    }
    public Meal(HealthBurger healthBurger, double price) {
        this.healthBurger = healthBurger;
    }
    public Meal(DeluxeBurger deluxeBurger, double price) {
        this.deluxeBurger = deluxeBurger;
    }
    public double getPrice() {
        return price;
    }
    public HealthBurger getHealthBurger() {
        return healthBurger;
    }
    public DeluxeBurger getDeluxeBurger() {
        return deluxeBurger;
    }
    public BasicBurger getBasicBurger() {
        return basicBurger;
    }
}