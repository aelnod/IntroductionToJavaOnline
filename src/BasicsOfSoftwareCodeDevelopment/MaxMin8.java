package BasicsOfSoftwareCodeDevelopment;
/*
    1.Basics of software code development
    Ветвления: задание 2
 */

public class MaxMin8 {
    /**
     * Возвращает max{min(a, b), min(c, d)}
     */
    public static int MaxMin(int a, int b, int c, int d) {
        if (a > b) {
            a = b;
        }
        if (c > d) {
            c = d;
        }
        return a > c ? a : c;
    }
}
