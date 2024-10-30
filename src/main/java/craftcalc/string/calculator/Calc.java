package craftcalc.string.calculator;

public class Calc {
    int fetchNextIntDigit(char digit) {
        switch (digit) {
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            case '-': return -2;
            default: return -1;
        }
    }
    int core_add(int num1,int num2){
        return num1 + num2;
    }

    int add(String numbers) {
        int sum = 0, currnumber = 0;
        boolean isCurrNegative = false, negativeFound = false;
        String errMsg = "Negative numbers not allowed: ";

        for (int i = 0; i < numbers.length(); i++) {
            int digit = fetchNextIntDigit(numbers.charAt(i));

            // Check for negative sign
            if (digit == -2) {
                isCurrNegative = true;
                continue;
            }

            // Check for valid digit
            if (digit >= 0) {
                currnumber = currnumber * 10 + digit;
                continue;
            }

            // Throw exception in case of negative number
            if (isCurrNegative) {
                errMsg +=  -currnumber + ", ";
                negativeFound = true;
            }

            // Add the accumulated number to sum if it's not empty
            sum = core_add(sum, currnumber);
            currnumber = 0;
            isCurrNegative = false;
        }

    if (negativeFound) {
        throw new NegativeNumberException(errMsg + -currnumber);
    }

    // Add any remaining number in the buffer
    sum = core_add(sum, currnumber);
    return sum;

    }

}
