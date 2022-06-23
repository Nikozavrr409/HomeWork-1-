import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        double magnitudeContribution;
        double summaContribution;
        double percent;
        int term;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите величину вклада: ");
        magnitudeContribution = in.nextDouble();
        System.out.println("Введите годовой процент: ");
        percent = in.nextDouble();
        System.out.println("Введите на какой срок (год): ");
        term = in.nextInt();
        summaContribution = ((((percent/100)  * term) * magnitudeContribution) + magnitudeContribution );
        System.out.println("Сумма вклада за данный срок, с учётом процента: " + summaContribution);

    }
}