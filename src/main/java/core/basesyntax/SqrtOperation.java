package core.basesyntax;

/**
 * <p>Реализуйте метод sqrt(), вычисляющий квадратный корень числа. В отличие от Math.sqrt(),
 * это метод при передаче отрицательного параметра должен бросать исключение
 * java.lang.IllegalArgumentException с сообщением "Expected non-negative number, got ?",
 * где вместо вопросика будет подставлено фактически переданное в метод число.</p>
 */
public class SqrtOperation {

    public static double sqrt(double number) throws IllegalArgumentException {
        if (number > -1) {
            double i = 0;
            while (i * i != number) {
                i++;
            }
            return i;
        } else {
            throw new IllegalArgumentException("Expected non-negative number, got " + number);
        }
    }
}
