import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
    Scanner y = new Scanner(System.in);
        System.out.println("Введите ширину ");
        int w = y.nextInt();
        System.out.println("Введите высоту ");
        int h = y.nextInt();
        int s = w * h; // площадь
        System.out.println("Площадь прямоугольника равна: " + s);
        int p = (w + h)*2; // периметр
        System.out.println("Периметр прямоугольника равен: " + p);
    }
}
