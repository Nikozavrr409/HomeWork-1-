import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите ваш рост в см.: ");
        final int growth = s.nextInt();
        System.out.println("Введите ваш вес в кг.: ");
        final int weight = s.nextInt();
        int difference = growth - weight - 110;
        if (difference > 0) {
            System.out.println("Вам надо поправиться на " + difference + " кг");
        } else {
            System.out.println("Вам надо похудеть на " + Math.abs(difference) + " кг");
        }
    }
}
