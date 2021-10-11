package BasicsOfSoftwareCodeDevelopment;

/*
    1.Basics of software code development
    Линейные программы: задание 5
 */
public class FormatSeconds5 {
    /**
     * Выводит длительность прошедшего времени в формате HHч ММмин SSс
     * @param seconds длительность прошедшего времени в секундах
     */
    public static void FormatSeconds(long seconds) {
        System.out.format("%02dч %02dмин %02dс", (seconds / 3600), ((seconds / 60) % 60), (seconds % 60));
    }
}
