import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String experience = scanner.next();
        String cuisinePreference = scanner.next();

        System.out.print("The form for " + firstName + " is completed. ");
        System.out.print("We will contact you if we need a chef who cooks " + cuisinePreference + " dishes ");
        System.out.print("and has " + experience + " years of experience.");
    }
}