package core.basesyntax;

public class SqrtOperation {
    public double sqrt(double number) throws java.lang.IllegalArgumentException {
        if (number >= 0) {
            int a = 0;
            while (Math.pow(a, 2) != number) {
                a++;
            }
            return a;
        } else {
            throw new IllegalArgumentException("Expected non-negative number, got " + number);
        }
    }
}

