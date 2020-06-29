package burger_shop;

public class Order {
    private HealthBurger healthBurger;
    private DeluxeBurger deluxeBurger;
    private BasicBurger basicBurger;
    private Meal meal;
    private double price;

    public Order(BasicBurger basicBurger, double price) {
        this.basicBurger = basicBurger;
    }
    public Order(HealthBurger healthBurger, double price) {
        this.healthBurger = healthBurger;
    }
    public Order(DeluxeBurger deluxeBurger, double price) {
        this.deluxeBurger = deluxeBurger;
    }
    public Order(Meal meal, double price) {
        this.meal = meal;
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
    public Meal getMeal() {
        return meal;
    }
}