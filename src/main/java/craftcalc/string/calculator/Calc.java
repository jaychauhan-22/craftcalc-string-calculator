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
            default: return -1;
        }
    }
    int core_add(int num1,int num2){
        return num1 + num2;
    }
    int add(String numbers){
        // Variable declaration
        int sum = 0,nextnumber = 0, scanneddigit = 0;

        // Iterate over the input
        for(int i=0;i<numbers.length();i++) {
            // Scan the next character to check if it is an integer digit or not
            scanneddigit = fetchNextIntDigit(numbers.charAt(i));
            // -1: Not an int digit
            if(scanneddigit != -1){
                nextnumber = nextnumber * 10 + scanneddigit;
                continue;
            }
            // Add the number to result
            sum  = core_add(sum, nextnumber);
            nextnumber = 0;
        }
        sum += nextnumber;
        return sum;
    }

}
