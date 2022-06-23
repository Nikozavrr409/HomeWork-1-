import java.util.Scanner;

public class Task05 {
    static Scanner sc = new Scanner(System.in); // Программа попросит пользователя ввести радиус в консоль и выведет результаты расчетов.
    public static void main(String[] args) {
        System.out.println("Введите радиус: ");
        double radius = sc.nextDouble(); // Использую double, потому что пользователь может ввести радиус дробным числом
        double area = Math.PI * (radius * radius); //Площадь круга вычисляется по формуле = PI*radius*radius
        System.out.println("Площадь круга равна: " + area);
        double circumference = Math.PI * 2*radius;
        System.out.println("Длины окружности ровна: " + circumference); //Длины окружности вычисляется по формуле = 2*PI*radius
    }
}
