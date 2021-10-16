package BasicsOfSoftwareCodeDevelopment;
/*
    1.Basics of software code development
    Ветвления: задание 5
 */

public class FunctionValue11 {
    /**
     * Вычисляет значение функции из задания 5 темы Ветвление
     */
    public static double FunctionValue(int x) {
        if (x <= 3) {
            return Math.pow(x, 2) - 3 * x + 9;
        } else {
            return 1 / (Math.pow(x, 3) + 6);
        }
    }
}
