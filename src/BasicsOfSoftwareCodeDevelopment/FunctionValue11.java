package BasicsOfSoftwareCodeDevelopment;
/*
    1.Basics of software code development
    Ветвления: задание 5
    Вычисляет значение функции:
    F(x) = x^2 - 3x + 9, если x<=3;
    F(x) = 1/(x^3 + 6), если x>3;
 */

public class FunctionValue11 {
    public static double FunctionValue(int x) {
        if (x <= 3) {
            return Math.pow(x, 2) - 3 * x + 9;
        } else {
            return 1 / (Math.pow(x, 3) + 6);
        }
    }
}
