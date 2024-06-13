import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prosty kalkulator, który obsługuje operacje: dodawania, odejmowania, mnożenia i dzielenia.");

        System.out.print("Podaj pierwszą liczbę operacji: ");
        double liczba1 = scanner.nextDouble();

        System.out.print("Podaj symbol operacji (+, -, *, /): ");
        char symbol = scanner.next().charAt(0);

        System.out.print("Podaj drugą liczbę operacji: ");
        double liczba2 = scanner.nextDouble();

        double wynik;
        boolean dziala = true;

        switch (symbol) {
            case '+':
                wynik = liczba1 + liczba2;
                break;
            case '-':
                wynik = liczba1 - liczba2;
                break;
            case '*':
                wynik = liczba1 * liczba2;
                break;
            case '/':
                if (liczba2 == 0) {
                    System.out.println("Nie można dzielić przez zero!");
                    dziala = false;
                    wynik = 0;
                } else {
                    wynik = liczba1 / liczba2;
                }
                break;
            default:
                System.out.println("Niewłaściwy symbol operacji!");
                dziala = false;
                wynik = 0;
        }

        if (dziala) {
            System.out.println("Wynik: " + wynik);
        }

        System.out.println("Naciśnij Enter, aby zakończyć działanie kalkulatora.");
        try {
            System.in.read();
        } catch (Exception enter) {
            enter.printStackTrace();
        }

        scanner.close();
    }
}

