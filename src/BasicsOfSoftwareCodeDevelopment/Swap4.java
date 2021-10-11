package BasicsOfSoftwareCodeDevelopment;

/**
 * 1.Basics of software code development
 * Задание 4
 */

public class Swap4 {
    public static void main(String[] args) {
        System.out.println(Swap(222.033));
    }

    /**
     * Меняет местами дробную и целую части числа
     * @param x число формата nnn.ddd
     * @return число формата ddd.nnn
     */
    public static double Swap(double x){
        return (x * 1000) % 1000 + (int) x / 1000.0;
    }
}
