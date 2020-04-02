package core.basesyntax;

public class SqrtOperation {
    public double sqrt(double number) throws java.lang.IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + number); 
        }
            number = Math.sqrt(number);
            return number;
    }
}

