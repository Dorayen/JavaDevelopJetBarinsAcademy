import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = 0;
        final int ult = 10;

        while (num > 0) {
            int operator = num % ult;
            sum = sum + operator;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
