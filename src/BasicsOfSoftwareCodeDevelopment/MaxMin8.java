package BasicsOfSoftwareCodeDevelopment;
/*
    1.Basics of software code development
    Ветвления: задание 2
    Найти max{min(a, b), min(c, d)}.
 */

public class MaxMin8 {
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
