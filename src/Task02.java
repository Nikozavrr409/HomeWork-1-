public class Task02 {
    public static void main(String[] args) {
        int n = 678;
        int a = n / 100;
        int b = n % 10;
        int c = n / 10;
        int d = c % 10;
        int e = a + b + d;
        System.out.println(e);
    }
}
