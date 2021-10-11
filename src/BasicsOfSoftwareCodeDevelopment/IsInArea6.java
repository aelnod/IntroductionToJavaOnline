package BasicsOfSoftwareCodeDevelopment;

/*
    1.Basics of software code development
    Линейные программы: задание 6
 */
public class IsInArea6 {
    /**
     * Определяет принадлежность к заданной области
     */
    public static void IsInArea(int x, int y) {
        System.out.println((x > -3 && x < 3 && y > -1 && y < 5) || (x > -5 && x < 5 && y > -4 && y < 1));
    }
}
