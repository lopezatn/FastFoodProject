public class MealOrder {
    private Burger burger;
    private Item sidedish;
    private Item drink;

    public MealOrder(Burger burger, Item sidedish, Item drink) {
        this.burger = burger;
        this.sidedish = sidedish;
        this.drink = drink;
    }

    public double getPrice() {
        double total = 0;
        if (burger != null) {
            total += burger.getTotalPrice();
        }
        if (sidedish != null) {
            total += sidedish.getPrice();
        }
        if (drink != null) {
            total += drink.getPrice();
        }
        return total;
    }

    public String getDetailedOrder() {
        StringBuilder details = new StringBuilder("Meal Order Details:\n");
        if (burger != null) {
            details.append(burger.getDetailedPrice()).append("\n");
        }
        if (sidedish != null) {
            details.append(sidedish.getDetailedPrice()).append("\n");
        }
        if (drink != null) {
            details.append(drink.getDetailedPrice()).append("\n");
        }
        details.append("Total Meal Price: ").append(getPrice()).append("\n");
        return details.toString();
    }

}
