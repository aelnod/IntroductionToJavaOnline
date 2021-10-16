package BasicsOfSoftwareCodeDevelopment;

/*
    1.Basics of software code development
    Линейные программы: задание 2
    Вычислить значение выражения по формуле (все проеменные принимают действительные значения)
    (b+sqrt(b^2+4*a*c))/2*a  - a^3*c + b^-2
 */
public class CalculateValues2 {
    public static void Foo(double a, double b, double c) {
        System.out.println((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2));
    }
}