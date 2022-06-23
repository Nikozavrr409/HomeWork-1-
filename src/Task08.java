import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скорость распространения звука в воздушной среде (м/с): ");
        double v = scanner.nextDouble();
        System.out.println("Введите время между вспышкой и раскатом грома (сек): ");
        final double t = scanner.nextDouble(); //время между вспышкой и раскатом грома (секунды) , final (потому что, значение константа)
        double s = t * v;
        System.out.println("Расстояние до места удара молнии: " + s + " метров");
    }
}
