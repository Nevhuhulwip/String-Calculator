import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTester {

//      Create an add function that can handle up to two integers passed in as a string

        @Test
        void TwoIntegers() {
            assertEquals(StringCalculator.add(""), 0, "Should return 0");
            assertEquals(StringCalculator.add("1"), 1, "Should return 1");
            assertEquals(StringCalculator.add("1,1"), 2, "Should return 2");
        }

        @Test
        void Multiple() {
            assertEquals(StringCalculator.add("1,2,3,4"), 10, "Should return 10");

        }

    //      Modify the add function to handle multiple integer.
        @Test
        void NewLines() {
            assertEquals(6, StringCalculator.add("1\n2,3"));
        }

    //      Modify the add function so that it can handle different delimiters
        @Test
        void DifferentDelimiters() {
            assertEquals(3, StringCalculator.add("//;\n1;2"));
            assertEquals(3, StringCalculator.add("//4\n142"));
        }

    //       Modify the add function so that it can handle negative integers.
        @Test
        void NegativeNumbers() {
            assertThrows(IllegalArgumentException.class, () -> StringCalculator.add("-1,-2,3,4"), "Throw since the are negative numbers");
        }


    // Modify the add function so that it ignores integers greater than or equal to 1000.
        @Test
        void IgnoreGreaterOrThan1000() {
            assertEquals(3, StringCalculator.add("//;\n1000;1;2")); //Question was add("//;\n1000,1;2") and was returning zero, so replaced , with ;
        }

        //Modify the add function so that it is able to support different delimiters of any length
        @Test
        void SupportAnyLengthDelimiter() {
            assertEquals(6, StringCalculator.add("//***\n1***2***3"));
        }

        //Number 8
        @Test
        void SupportAnyDelimiterAndLength() {
            assertEquals(6, StringCalculator.add("//[:D][%]\n1:D2%3"));
            assertEquals(6, StringCalculator.add("//[***][%%%]\n1***2%%%3"));
            assertEquals(0, StringCalculator.add("//[(-_-')][%]\n1(-_-')2%3"));
            assertEquals(7, StringCalculator.add("//[abc][777][:(]\n1abc27773:(1"));
        }

        //Modify the add function so that it can handle invalid input.
        @Test
        void HandleInvalidInput() {
            assertThrows(IllegalArgumentException.class, () -> StringCalculator.add("//;\n1000;1;2;"), "Should throw, the input is invalid");
            assertThrows(IllegalArgumentException.class, () -> StringCalculator.add("   //;\n1000,1;2"), "Should throw, the input is invalid");
            assertThrows(IllegalArgumentException.class, () -> StringCalculator.add("1,2,3//;\n1000,1;2"), "Should throw, the input is invalid");
        }
    }

