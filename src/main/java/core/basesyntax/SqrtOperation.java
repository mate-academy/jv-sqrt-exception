package core.basesyntax;

/**
 * <p>Реализуйте метод sqrt(), вычисляющий квадратный корень числа. В отличие от Math.sqrt(),
 * это метод при передаче отрицательного параметра должен бросать исключение
 * java.lang.IllegalArgumentException с сообщением "Expected non-negative number, got ?",
 * где вместо вопросика будет подставлено фактически переданное в метод число.</p>
 */
public class SqrtOperation {
    public double sqrt(double number) {
        double sqrtNew = 0;
        if (number < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + number);
        }
        int temp = 1;
        while (number != 0) {
            number = number - temp;
            sqrtNew++;
            temp += 2;
        }
        return sqrtNew;
    }
}
