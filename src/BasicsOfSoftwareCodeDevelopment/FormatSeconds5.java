package BasicsOfSoftwareCodeDevelopment;

/*
    1.Basics of software code development
    Линейные программы: задание 5
    Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
    Вывести данное значение длительности в часах, минутах и секундах в следующей фоме: ННч ММмин SSс.
 */
public class FormatSeconds5 {
    public static void FormatSeconds(long seconds) {
        System.out.format("%02dч %02dмин %02dс", (seconds / 3600), ((seconds / 60) % 60), (seconds % 60));
    }
}
