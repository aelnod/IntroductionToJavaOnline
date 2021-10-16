package BasicsOfSoftwareCodeDevelopment;
/*
    1.Basics of software code development
    Циклы: задание 5
    Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
    модуль которых больше или равет заданному е. Общий член ряда имеет вид:
    a(n) = 1/2^n + 1/3^n
 */

public class SumNumberSeries16 {
    public static void SumNumberSeries(double e) {
        double sum = 0;
        int i = 1;
        while (true) {
            double a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(a) < e) break;
            sum += a;
            i++;
        }

        System.out.println(sum);
    }
}
