package edu.vit.corejava.syntax;

public class SwitchDiscount {
    public static void main(String[] args) {
        String coupon = "NEW50";
        String discount = switch (coupon) {
            case "NEW50" -> "Flat 50%";
            case "FEST20" -> "20% Festival Offer";
            default -> "No discount";
        };
        System.out.println(discount); // Output: Flat 50%
    }
}
