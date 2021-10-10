package BasicsOfSoftwareCodeDevelopment;

/**
 * 1.Basics of software code development
 * Задание 1
 */

public class FunctionValue1 {

    public static void main(String[] args) {
        System.out.println(Foo(2, 3, 4));
    }

    /**
     * Вычисляет значение функции (((a - 3) * b) / 2) + c
     * @param a переменная типа double
     * @param b переменная типа double
     * @param c переменная типа double
     * @return Значение функции (((a - 3) * b) / 2) + c
     */
    public static double Foo(double a, double b, double c) {
        return (((a - 3) * b) / 2) + c;
    }
}
