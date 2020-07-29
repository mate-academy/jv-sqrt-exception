package core.basesyntax;

public class SqrtOperation {
    public double sqrt(double number) {
        return 0.0;
        if (number < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got" + number);
        }
        return Math.pow(number, 0.5);
    }
}