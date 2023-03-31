class Car {
    private String model;
    private final String brand;
    private final int year;
    private final double price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void sell(int numCars) {
        if (numCars <= quantity) {
            quantity -= numCars;
        } else {
            System.out.println("Not enough cars in stock.");
        }
    }

    public String toString() {
        return "Model: " + model + "\n" +
                "Brand: " + brand + "\n" +
                "Year: " + year + "\n" +
                "Price: " + price + "\n" +
                "Color: " + color + "\n" +
                "Quantity: " + quantity;
    }
}

public class task2 {
    public static void main(String[] args) {
        Car car = new Car("ModelS", "Tesla", 2022, 49999.99, "Red", 10);
        System.out.println(car);

        car.sell(3);
        System.out.println("Quantity after selling: " + car.getQuantity());

        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.setModel("ModelY");
        car.setColor("Blue");
        car.setQuantity(20);

        System.out.println(car);
    }
}

