package BasicsOfSoftwareCodeDevelopment;
/*
    1.Basics of software code development
    Линейные программы
    Задание 2
 */

public class CalculateValues2 {

    /**
     * Вычисляет значение выражения по формуле (b+sqrt(b^2+4*a*c))/2*a  - a^3*c + b^-2
     */
    public static void Foo(double a, double b, double c) {
        System.out.println((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2));
    }
}