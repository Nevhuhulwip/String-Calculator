import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public static int add(String input) {
        StringBuilder delimiter = new StringBuilder();
        if (input.startsWith("//")) {
            delimiter.append("\n");
            Matcher mat = Pattern.compile("(?<=//).*(?=\n)").matcher(input);
            while (mat.find()) {
                delimiter.append("[").append(mat.group()).append("]");
            }
            input = input.substring(input.indexOf("\n"));
        } else {
            delimiter.append(",\n");
        }
        return add(input, "[" + delimiter + "]");
    }


    static int add(String numbers, String delimiter) {

        String[] arr = numbers.split("[" + delimiter + "]");
        StringBuilder negativeNumbers = new StringBuilder();
        int sum = 0;
        try {
            for (String numberAtIndex : arr) {

                if (!numberAtIndex.trim().isEmpty() && (Character.isDigit(numberAtIndex.charAt(0)) || numberAtIndex.charAt(0) == '-')) {

                    if (!Character.isDigit(numbers.charAt(numbers.length() - 1)))
                        throw new IllegalArgumentException("ERROR: invalid input");

                    if (Integer.parseInt(numberAtIndex.trim()) < 0) {

                        negativeNumbers.append(numberAtIndex.trim()).append(", ");
                    } else if (Integer.parseInt(numberAtIndex.trim()) < 1000) {
                        sum += Integer.parseInt(numberAtIndex.trim());
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("ERROR: invalid input");
        }
        if (negativeNumbers.length() > 0)
            throw new IllegalArgumentException("\n'ERROR: negatives not allowed" + negativeNumbers.toString().substring(0, negativeNumbers.length() - 2));
        return sum;
    }

}
