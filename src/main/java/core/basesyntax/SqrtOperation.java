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
            throw new IllegalArgumentException("Expected non-negative number, got " + number);
        }
        double low = 0;
        double high = number;
        double mid = 0;
        for (int i = 0; i < 100; i++) {
            mid = (low + high) / 2;
            if (mid * mid == number) {
                return mid;
            }
            if (mid * mid < number) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return mid;
    }
}
