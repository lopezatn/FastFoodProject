public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super("BURGER", name, price);
    }

    public String getName() {
        return super.getName();
    }

    public void setToppings(String extra1, String extra2, String extra3) {
        this.extra1 = new Item("TOPPING", extra1, toppingCost(extra1));
        this.extra2 = new Item("TOPPING", extra2, toppingCost(extra2));
        this.extra3 = new Item("TOPPING", extra3, toppingCost(extra3));
    }

    private double toppingCost(String name) {
        if (name == null) {
            return 0;
        }
        switch (name.toUpperCase()) {
            case "CHEESE":
            case "BACON":
                return 0.50;
            case "LETTUCE":
            case "TOMATO":
            case "ONION":
            case "KETCHUP":
            case "MUSTARD":
            case "MAYO":
                return 0.25;
            default:
                return 0.0;
        }
    }

    @Override
    public double getPrice() {
        double total = super.getPrice();
        return total;
    }

    public double getTotalPrice() {
        double total = super.getPrice();
        if (extra1 != null) {
            total += extra1.getPrice();
        }
        if (extra2 != null) {
            total += extra2.getPrice();
        }
        if (extra3 != null) {
            total += extra3.getPrice();
        }
        return total;
    }

    @Override
    public String getDetailedPrice() {
        StringBuilder details = new StringBuilder("Price for " + getName() + ": " + getPrice() + "\n");
        if (extra1 != null) {
            details.append("Price for " + extra1.getName() + ": ").append(extra1.getPrice() + "\n");
        }
        if (extra2 != null) {
            details.append("Price for " + extra2.getName() + ": ").append(extra2.getPrice() + "\n");
        }
        if (extra3 != null) {
            details.append("Price for " + extra3.getName() + ": ").append(extra3.getPrice() + "\n");
        }
        details.append("Total price: ").append(getTotalPrice()).append("\n");
        return details.toString();

    }

}
