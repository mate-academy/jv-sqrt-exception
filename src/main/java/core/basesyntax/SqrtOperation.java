package core.basesyntax;

/**
 * <p>Реализуйте метод sqrt(), вычисляющий квадратный корень числа. В отличие от Math.sqrt(),
 * это метод при передаче отрицательного параметра должен бросать исключение
 * java.lang.IllegalArgumentException с сообщением "Expected non-negative number, got ?",
 * где вместо вопросика будет подставлено фактически переданное в метод число.</p>
 */
public class SqrtOperation {
    public double sqrt(double number) {
        if (number < 0) {
            throw new java.lang.IllegalArgumentException(
                    "Expected non-negative number, got " + number);
        }
        double temp = 0;
        double squareRoot = number / 2;
        while (temp - squareRoot != 0) {
            temp = squareRoot;
            squareRoot = (temp + number / temp) / 2;
        }
        return squareRoot;
    }
}
