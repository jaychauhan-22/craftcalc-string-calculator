package craftcalc.string.calculator;

public class Calc {
    int fetchNextNumber(char digit) {
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
            default: return 0;
        }
    }
    int add(String numbers){
        int sum = 0;
        for(int i=0;i<numbers.length();i++){
            sum += fetchNextNumber(numbers.charAt(i));
        }
        return sum;

    }

}
