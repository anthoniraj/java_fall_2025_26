
/**
 * Input: Two Integers (10, 7)
 * Check if both numbers are odd 
 *  or 
 * one of the number is divisable by 7
 * Ouput: Condition met: 7
 * Example 7 14
 * Ouput: Condition met: 7
 * 
 * Exmple 10 8
 * Output Conditions not met: 10 8
 * 
 * Example 11 13
 * OUtput: Conditions not met: Both numbers are odd
 */
public class LogicalDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;

        boolean isAOdd = (a % 2 != 0) ? true : false;
        boolean isBOdd = (b % 2 != 0) ? true : false;
        boolean bothOdd = isAOdd && isBOdd;

        int divisibleBy7A = (a % 7 == 0) ? a : -1;
        int divisibleBy7B = (b % 7 == 0) ? b : -1;

        boolean conditionMet = bothOdd || divisibleBy7A != -1 || divisibleBy7B != -1;

        System.out.println(
            conditionMet
                ? (divisibleBy7A != -1
                    ? "Condition met: " + divisibleBy7A
                    : (divisibleBy7B != -1
                        ? "Condition met: " + divisibleBy7B
                        : "Condition met"))
                : (!isAOdd && !isBOdd
                    ? "Conditions not met: Both numbers are not odd"
                    : "Conditions not met: " + a + " " + b)
        );
    }
}

