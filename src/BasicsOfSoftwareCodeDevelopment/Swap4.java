package BasicsOfSoftwareCodeDevelopment;

/*
    1.Basics of software code development
    Линейные программы: задание 4
    Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
    Поменять местами дробную и целую части и вывести полученное значение числа.
 */
public class Swap4 {
    /**
     * Меняет местами дробную и целую части числа
     *
     * @param x число формата nnn.ddd
     */
    public static void Swap(double x) {
        System.out.println((x * 1000) % 1000 + (int) x / 1000.0);
    }
}
