package core.basesyntax;

/**
 * <p>Реализуйте метод sqrt(), вычисляющий квадратный корень числа. В отличие от Math.sqrt(),
 * это метод при передаче отрицательного параметра должен бросать исключение
 * java.lang.IllegalArgumentException с сообщением "Expected non-negative number, got ?",
 * где вместо вопросика будет подставлено фактически переданное в метод число.</p>
 */
public class SqrtOperation {
    public double sqrt(double number) {
        double result = number;
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        while (number < result * result) {
            if (result % 2 == 0) {
                result = result / 2;
            } else {
                result = result + 1;
            }
        }
        return result;
    }
}
