import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        final int uni = 10;
        final int dec = 100;
        final int cen = 1000;
        final int n1 = number % uni;
        final int n2 = (number % dec) / uni;
        final int n3 = (number % cen) / dec;

        if (n1 != 0) {
            System.out.print(n1);
            System.out.print(n2);
            System.out.print(n3);
        } else {
            System.out.print(n2);
            System.out.print(n3);

        }
    }
}