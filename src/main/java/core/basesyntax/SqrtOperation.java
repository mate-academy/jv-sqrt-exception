package core.basesyntax;

public class SqrtOperation {
    public double sqrt(double number) throws java.lang.IllegalArgumentException {
        if (number >= 0) {
            number = Math.sqrt(number);
        } else {
            throw new IllegalArgumentException("Expected non-negative number, got " + number);
        }
    }
}

