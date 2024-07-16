import java.util.*;

public class keypad {

    // Array to store the keypad mappings
    private static final String[] KEYPAD = {
        ".;",    // 0
        "abc",   // 1
        "def",   // 2
        "ghi",   // 3
        "jkl",   // 4
        "mno",   // 5
        "pqrs",  // 6
        "tu",    // 7
        "vwx",   // 8
        "yz"     // 9
    };

    // Method to get combinations
    public static List<String> getCombinations(String digits) {
        if (digits.isEmpty()) {
            return Collections.singletonList("");
        }

        char digit = digits.charAt(0);
        String letters = KEYPAD[digit - '0'];
        List<String> combinationsForRest = getCombinations(digits.substring(1));

        List<String> result = new ArrayList<>();
        for (char letter : letters.toCharArray()) {
            for (String combination : combinationsForRest) {
                result.add(letter + combination);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter digits: ");
        String digits = scanner.nextLine();
        scanner.close();

        List<String> combinations = getCombinations(digits);
        System.out.println("Combinations: " + combinations);
    }
}
