package BasicsOfSoftwareCodeDevelopment;

/*
    1.Basics of software code development
    Циклы: задание 2
    Вычислить значение функции на отрезке [a, b] с шагом h
 */
public class FunctionValue13 {
    public static void FunctionValue(int a, int b, int h) {
        int x = a;
        while (x <= b) {
            if (x > 2) {
                System.out.println(x);
            } else {
                System.out.println(-x);
            }
            x += h;
        }
    }
}
