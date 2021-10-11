package BasicsOfSoftwareCodeDevelopment;

/*
    1.Basics of software code development
    Линейные программы: задание 3
 */
public class CalculateValue3 {
    /**
     * Вычисляет значение выражения по формуле (sin(x)+cos(y))/(cos(y)-sin(x))*tg(xy)
     */
    public static void Foo(double x, double y) {
        System.out.println((Math.sin(x) + Math.cos(y)) / ((Math.cos(x) - Math.sin(y))) * Math.tan(x * y));
    }
}