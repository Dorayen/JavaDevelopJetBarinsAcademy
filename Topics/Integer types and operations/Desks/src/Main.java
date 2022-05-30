import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double g1 = scanner.nextDouble();
        Double g2 = scanner.nextDouble();
        Double g3 = scanner.nextDouble();
        g1 = Math.ceil(g1 / 2);
        g2 = Math.ceil(g2 / 2);
        g3 = Math.ceil(g3 / 2);

        Double total = g1 + g2 + g3;

        final int need = total.intValue();

        System.out.println(need);
    }
}