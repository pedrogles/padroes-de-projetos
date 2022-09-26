package main;

public class Product {
    private double price;
    private DayHour dayHour;

    // Constructor
    public Product(double price) {
        this.price = price;
        this.dayHour = new DayHour();
    }
    // Methods
    public double CalculatePrice() {
        double finalPrice = this.price;
        if ((this.getDayHour().getHour() >= 20) &&
        ((this.getDayHour().getMin() + this.getDayHour().getSec()) > 0)) {
            finalPrice = finalPrice - (finalPrice / 10);
        } else if (this.getDayHour().getDayOfWeek() == "SEGUNDA"
                || this.getDayHour().getDayOfWeek() == "DOMINGO") {
            finalPrice = finalPrice - (finalPrice / 10);
        }
        return finalPrice;
    }
    // Getters and Setters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DayHour getDayHour() {
        return dayHour;
    }

    public void setDayHour(DayHour dayHour) {
        this.dayHour = dayHour;
    }
}
