package BasicsOfSoftwareCodeDevelopment;

/*
    1.Basics of software code development
    Линейные программы: задание 6
    Для данной области составить линейную программу, которая печатает true, если
    точка с координатами (x, y) принадлежит закрашенной области, и false - в противном случае.
 */
public class IsInArea6 {
    public static void IsInArea(int x, int y) {
        System.out.println((x > -3 && x < 3 && y > -1 && y < 5) || (x > -5 && x < 5 && y > -4 && y < 1));
    }
}
