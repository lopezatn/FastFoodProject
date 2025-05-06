public class App {
    public static void main(String[] args) throws Exception {
        // Create a burger with toppings
        Burger burger = new Burger("BIG BURGER", 5);
        burger.setToppings("CHEESE", "BACON", "TOMATO");

        // Create a side dish and a drink
        Item fries = new Item("SIDEDISH", "Fries", 2.50);
        fries.setSize("SMALL");

        Item cola = new Item("DRINK", "Cola", 1.80);
        cola.setSize("LARGE");

        // Create a meal order
        MealOrder mealOrder = new MealOrder(burger, fries, cola);

        // Print the total price and detailed order
        System.out.println(mealOrder.getDetailedOrder());

    }

}
