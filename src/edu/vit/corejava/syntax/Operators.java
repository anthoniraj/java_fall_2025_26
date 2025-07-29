package edu.vit.corejava.syntax;

public class Operators {
    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println();

        // Operator Precedence Example
        int result = 10 + 2 * 3;
        int result2 = (10 + 2) * 3;
        System.out.println("Operator Precedence:");
        System.out.println("10 + 2 * 3 = " + result);
        System.out.println("(10 + 2) * 3 = " + result2);
        System.out.println();

        // 2. Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println();

        // 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        System.out.println();

        // 4. Assignment Operators
        int c = 5;
        System.out.println("Assignment Operators:");
        c += 2;
        System.out.println("c += 2: " + c);
        c -= 1;
        System.out.println("c -= 1: " + c);
        c *= 3;
        System.out.println("c *= 3: " + c);
        c /= 2;
        System.out.println("c /= 2: " + c);
        c %= 4;
        System.out.println("c %= 4: " + c);
        System.out.println();

        // 5. Unary Operators
        int d = 7;
        System.out.println("Unary Operators:");
        System.out.println("Unary plus: " + (+d));
        System.out.println("Unary minus: " + (-d));
        System.out.println("Post-increment: " + (d++)); // prints then increments
        System.out.println("After post-increment: " + d);
        System.out.println("Pre-increment: " + (++d)); // increments then prints
        System.out.println("Post-decrement: " + (d--));
        System.out.println("After post-decrement: " + d);
        System.out.println("Pre-decrement: " + (--d));
        System.out.println();

        // 6. Bitwise Operators
        int m = 5, n = 3;
        System.out.println("Bitwise Operators:");
        System.out.println("m & n: " + (m & n));
        System.out.println("m | n: " + (m | n));
        System.out.println("m ^ n: " + (m ^ n));
        System.out.println("~m: " + (~m));
        System.out.println();

        // 7. Shift Operators
        int e = 3;
        System.out.println("Shift Operators:");
        System.out.println("e << 2: " + (e << 2)); // Left shift
        int f = 20;
        System.out.println("f >> 2: " + (f >> 2)); // Right shift
        System.out.println();

        // 8. Ternary Operator
        int g = 10, h = 20;
        int max = (g > h) ? g : h;
        System.out.println("Ternary Operator:");
        System.out.println("Max of " + g + " and " + h + " is: " + max);

        int tempF = 102;
        String status = (tempF > 100) ? "High Fever" : "Normal";
        System.out.println("Temperature status: " + status);
    }
}
