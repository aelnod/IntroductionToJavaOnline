package BasicsOfSoftwareCodeDevelopment;
/*
    1.Basics of software code development
    Ветвления: задание 4
 */

public class IsBrickPass10 {
    /**
     * Сообщает, может ли кирпич (размером x, y,  z) пройти
     * сквозь отверстие A на B
     */
    public static void IsBrickPass(int A, int B, int x, int y, int z) {
        int count = 0;
        count += (x <= A && y <= B) ? 1 : (y <= A && x <= B) ? 1 : 0;
        count += (x <= A && z <= B) ? 1 : (z <= A && x <= B) ? 1 : 0;
        count += (y <= A && z <= B) ? 1 : (z <= A && y <= B) ? 1 : 0;
        if (count > 0) {
            System.out.format("Кирпич размером %sх%sх%s пройдет через отверстие %s на %s", x, y, z, A, B);
        } else {
            System.out.format("Кирпич размером %sх%sх%s НЕ пройдет через отверстие %s на %s", x, y, z, A, B);
        }
    }
}
