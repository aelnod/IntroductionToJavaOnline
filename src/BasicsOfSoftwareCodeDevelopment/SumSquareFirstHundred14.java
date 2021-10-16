package BasicsOfSoftwareCodeDevelopment;
/*
    1.Basics of software code development
    Циклы: задание 3
    Найти сумму квадратов первых ста чисел.
 */

public class SumSquareFirstHundred14 {
    public static void SumSquareFirstHundred(){
        int sum = 0;
        for(int i = 1; i<=100; i++){
            sum+=Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}
