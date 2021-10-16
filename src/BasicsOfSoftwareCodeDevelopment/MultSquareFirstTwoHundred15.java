package BasicsOfSoftwareCodeDevelopment;
/*
    1.Basics of software code development
    Циклы: задание 4
    Составить программу нахождения произведения квадратов
    первых двухсот чисел
 */

public class MultSquareFirstTwoHundred15 {
    public static void MultSquareFirstTwoHundred() {
        long sum = 1;
        for (int i = 2; i <= 200; i++) {
            sum *= Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}
