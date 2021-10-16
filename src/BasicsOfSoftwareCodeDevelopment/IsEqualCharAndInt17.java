package BasicsOfSoftwareCodeDevelopment;
/*
    1.Basics of software code development
    Циклы: задание 6
    Вывести на экран соответствие между символами и их численными обозначениями
    в памяти компьютера.
 */

public class IsEqualCharAndInt17 {
    public static void IsEqualCharAndInt(){
        System.out.println("Номер ASCII\tСимвол");
        for(int i =32; i<=255; i++){
            System.out.format("%d\t\t\t%c\n", i, (char)i);
        }
    }
}
