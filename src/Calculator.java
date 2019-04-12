public class Calculator {
    public static double caculater(double firstNumber, double secondNumber, String isSomething) {
        try {
            if (isSomething.equals("Div")) {
                return isDiv(firstNumber, secondNumber);
            } else if (isSomething.equals("Sum"))
                return isSum(firstNumber, secondNumber);
            else if (isSomething.equals("Mul"))
                return isMultiply(firstNumber, secondNumber);
            else if (isSomething.equals("Sub")) {
                return isSubtraction(firstNumber, secondNumber);
            } else return -11111;
        } catch (Exception ex) {
            throw ex;
        }
    }

    public static double isSum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double isDiv(double firstNumber, double secondNumber) {
        return (firstNumber / secondNumber);
    }

    public static double isMultiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double isSubtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }


}
