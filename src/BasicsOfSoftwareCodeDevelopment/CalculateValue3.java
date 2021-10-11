package BasicsOfSoftwareCodeDevelopment;

/*
1.Basics of software code development
Задание 3
 */

public class CalculateValue3 {
    public static void main(String[] args) {
        System.out.println(Foo(2, 3));
    }

    /**
     * Вычисляет значение выражения по формуле (sin(x)+cos(y))/(cos(y)-sin(x))*tg(xy)
     * @param x переменная типа double (значение в радианах)
     * @param y переменная типа double (значение в радианах)
     * @return значение выражения по формуле (sin(x)+cos(y))/(cos(y)-sin(x))*tg(xy)
     */
    public static double Foo(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / ((Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
    }
}