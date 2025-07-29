package edu.vit.corejava.syntax;

public class SwitchWeatherDemo {
    public static void main(String[] args) {
        int code = 2;
        String weather = switch (code) {
            case 1 -> "Sunny";
            case 2 -> "Cloudy";
            case 3 -> "Rainy";
            default -> "Unknown";
        };
        System.out.println(weather); // Output: Cloudy
    }
}
