package BasicsOfSoftwareCodeDevelopment;
/*
    1.Basics of software code development
    Циклы: задание 8
    Даны два числа. Определить цифры, входящие в запись как первого
    так и второго числа.
 */

public class SameNumbers19 {
    public static void SameNumbers(int a, int b) {
        System.out.format("Одинаковые цифры, входящие в числа %d и %d:\n", a, b);
        while (a != 0) {
            int numberA = a % 10;
            int temp = b;
            while (temp != 0) {
                int numberB = b % 10;
                if (numberA == numberB) {
                    System.out.print(numberB + " ");
                    break;
                }
                temp /= 10;
            }
            a /= 10;
        }
    }
}
