import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int n = 50; // всего учащихся в школе.
        int p = 1; // количество пирожков.
        int i = 25; // количество учеников, чей вес меньше 30 кг.
        double packaging_milk = 900; // объём упаковки молока.
        double volume_cup = 200; // объём стакана молока.
        if (i == n) {
            int pie = i * p + n;
            double pack_milk = i * volume_cup / packaging_milk;
            System.out.println("Пакетов молока: " + Math.ceil(pack_milk) + "\n" + "Пирожков: " + pie);
        }
        else if (i == n * 0.6) {
            int pie = i * p + n;
            double pack_milk = i * volume_cup / packaging_milk;
            System.out.println("Пакетов молока: " + Math.ceil(pack_milk) + "\nПирожков: " + pie);
        }
        else if (i == n * 0.01) {
            int pie = i * p + n;
            double pack_milk = i * volume_cup / packaging_milk;
            System.out.println("Пакетов молока: " + Math.ceil(pack_milk) + "\nПирожков:" + " " + pie);
        }
        else {
            System.out.println("Все ученики получат только по 1 пирожку");
        }




    }

}

