package BasicsOfSoftwareCodeDevelopment;
/**
 * 1.Basics of software code development
 * Задание 2
 */

public class CalculateValues2 {
    public static void main(String[] args) {
        System.out.println(Foo(2, 3, 4));
    }

    /**
     * Вычисляет значение выражения по формуле (b+sqrt(b^2+4*a*c))/2*a  - a^3*c + b^-2
     * @param a переменная типа double
     * @param b переменная типа double
     * @param c переменная типа double
     * @return значение выражения по формуле (b+sqrt(b^2+4*a*c))/2*a  - a^3*c + b^-2
     */
    public static double Foo(double a, double b, double c) {
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}