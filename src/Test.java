public class Test {

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isOdd(int number) {
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    double circleField(double number) {
        double circleField = Math.PI * number;
        return circleField;
    }

    int power(int number) {
        double pow = Math.pow(number,2);
        return (int)pow;
    }
}
