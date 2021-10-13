package BasicsOfSoftwareCodeDevelopment;
/*
    1.Basics of software code development
    Ветвления: задание 3
 */

public class IsPointsOnLine9 {
    /**
     * Метод определяет лежат ли три точки на одной прямой.
     */
    public static void IsPointsOnLine(int x1, int y1, int x2, int y2, int x3, int y3){
        if(x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1){
            System.out.println("Точки расположены на одной прямой");
        }
        else {
            System.out.println("Точки расположены НЕ на одной прямой");
        }
    }
}
