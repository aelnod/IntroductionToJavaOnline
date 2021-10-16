package BasicsOfSoftwareCodeDevelopment;

/*
    1.Basics of software code development
    Циклы: задание 7
    Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    m и n вводятся с клавиатуры.
 */
public class PrintDivider18 {
    public static void PrintDivider(int m, int n) {
        System.out.format("Вывод делителей для чисел в промежутке %d и %d, кроме 1 и самого числа\n", m, n);
        for (int i = m; i <= n; i++) {
            System.out.format("Вывод делителей для числа %d: ", i);
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
