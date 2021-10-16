package BasicsOfSoftwareCodeDevelopment;
/*
    1.Basics of software code development
    Ветвления: задание 3
    Даны три точки A(x1, y1), B(x2, y2) и C(x3, y3). Определить,
    будут ли они расположены на одной прямой.
 */

public class IsPointsOnLine9 {
    public static void IsPointsOnLine(int x1, int y1, int x2, int y2, int x3, int y3){
        if(x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1){
            System.out.println("Точки расположены на одной прямой");
        }
        else {
            System.out.println("Точки расположены НЕ на одной прямой");
        }
    }
}
