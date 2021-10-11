package BasicsOfSoftwareCodeDevelopment;

/*
    1.Basics of software code development
    Ветвления: задание 1
 */
public class IsTriangle7 {
    /**
     * Определяет существование треугольника по двум углам (в градусах)
     * и, если существует, прямоугольный ли он.
     */
    public static void IsTriangle(int a, int b) {
        if (a + b >= 180 || a <= 0 || b <= 0) {
            System.out.println("Треугольника с заданными углами НЕ существует");
        } else if (a == 90 || b == 90 || a + b == 90) {
            System.out.println("Треугольник с заданными углами прямоугольный");
        } else {
            System.out.println("Треугольник с заданными углами существует");
        }
    }
}
