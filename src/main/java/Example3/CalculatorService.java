package Example3;

public class CalculatorService {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;

    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;

    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int findMax(int masyvas[]) {
        int maxValue = masyvas[0];
        for (int i = 0; i < masyvas.length; i++) {
            if (maxValue < masyvas[i]) {
                maxValue = masyvas[i];
            }

        }
        return maxValue;

    }

    public boolean isOdd(int number) {
        return number%2 !=0;
    }
}