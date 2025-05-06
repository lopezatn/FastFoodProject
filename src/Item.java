public class Item {
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM"; // Default size is set to MEDIUM

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name;
        this.price = price;
    }

    public void setSize(String size) {
        if (size == null) {
            throw new IllegalArgumentException("Size cannot be null");
        } else if (!size.equalsIgnoreCase("SMALL") && !size.equalsIgnoreCase("MEDIUM")
                && !size.equalsIgnoreCase("LARGE")) {
            throw new IllegalArgumentException("Invalid size: " + size);
        } // Check if size is valid
        this.size = size.toUpperCase(); // Convert the size to uppercase
    }

    public double getPrice() {
        double total = price;
        if ("SIDEDISH".equalsIgnoreCase(type) || "DRINK".equalsIgnoreCase(type)) {
            total += 1.0; // Add 1.0 for sidedish or drink
            switch (this.size) { // Check the size and adjust the price accordingly
                case "SMALL":
                    total -= 0.5;
                    break;
                case "LARGE":
                    total += 0.5;
                    break;
                default:
                    total += 0.0; // No change for MEDIUM
                    break;
            }
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public String getDetailedPrice() {
        if ("SIDEDISH".equalsIgnoreCase(type) || "DRINK".equalsIgnoreCase(type)) {
            return "Price for " + name + " " + size + ": " + getPrice();
        } else {
            return "Price for " + name + ": " + getPrice();
        }
    }

}
