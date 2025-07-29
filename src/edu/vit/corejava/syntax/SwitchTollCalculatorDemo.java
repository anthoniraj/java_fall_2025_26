package edu.vit.corejava.syntax;

public class SwitchTollCalculatorDemo {
    public static void main(String[] args) {
        String vehicleType = "Car";
        double tollFee = switch (vehicleType) {
            case "Bike" -> 0.0;
            case "Car", "Van" -> {
                double base = 90.0;
                double gst = base * 0.18;
                yield base + gst;
            }
            case "Truck" -> {
                double base = 350.0;
                double extraFare = 50.0;
                yield base + extraFare;
            }
            default -> 0.0;
        };
        System.out.println("Toll Fee: ₹" + tollFee);
    }
}
