import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int x = 4455; // Количество секунд на часах.
        int y = 31536000; // Количество секунд в году.
        double z = y - x; // Считаем, какое колличество секунд осталось до Нового Года.
        double n = z / 86400; // Определяем какое количество дней осталось до Нового года (делим на сумму секундн за день 24*60*60)
        if (n % 1 == 0) {
            System.out.println(n + " дней " + 0 + " часов " + 0 + " минут " + 0 + " секунд");}
        else if (n % 1 != 0) {
            double  clock = n * 24 % 60;
            if (clock % 1 == 0) {
                System.out.println(Math.floor(n) + " дней " + clock + " часов " + 0 + " минут " + 0 + " секунд");}
            else if (clock % 1 != 0) {
                double minute = n * 24 * 60 % 60;
                if (minute % 1 == 0) {
                    System.out.println(Math.floor(n) + " дней " + Math.floor(clock) + " часов " + minute + " минут " + 0 + " секунд");}
                else if (minute % 1 != 0) {
                    double sec = z % 60;
                    System.out.println(Math.floor(n) + " дней " + Math.floor(clock) + " часов " + Math.floor(minute) + " " + "минут " + Math.floor(sec) + " секунд");}
            }
        }
    }
}
