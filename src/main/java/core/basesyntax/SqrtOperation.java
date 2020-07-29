package core.basesyntax;

public class SqrtOperation {
    public double sqrt(double number) {

        if (number < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got?");
        }

        return Math.sqrt(number);
    }
}
