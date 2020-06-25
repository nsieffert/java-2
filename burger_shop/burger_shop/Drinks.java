package burger_shop;

public class Drinks {
        private String drinkTypeName;
        private double drinkTypePrice;

        public Drinks(String drinkTypeName, double drinkTypePrice) {
            this.drinkTypeName = drinkTypeName;
            this.drinkTypePrice = drinkTypePrice;
        }

        public String getDrinkTypeName() {
            return drinkTypeName;
        }

    public double getDrinkTypePrice() {
        return drinkTypePrice;
    }

        @Override
        public String toString() {
            return String.format(drinkTypeName);
        }
    }
