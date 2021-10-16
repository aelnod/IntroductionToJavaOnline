package BasicsOfSoftwareCodeDevelopment;

import java.util.Scanner;
/*
    1.Basics of software code development
    Циклы: задание 1
    Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class SumInter12 {
    public static void SumInter() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Введите любое целое положительное число: ");
            sum += in.nextInt();
            System.out.format("Сумма всех введенных чисел = %d\n", sum);
        }

    }
}
