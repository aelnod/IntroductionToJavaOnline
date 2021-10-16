package BasicsOfSoftwareCodeDevelopment;
/*
    1.Basics of software code development
    Циклы: задание 3
    Найти сумму квадратов первых ста чисел.
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
