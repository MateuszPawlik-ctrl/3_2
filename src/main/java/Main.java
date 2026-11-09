import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź tekst: ");
        String tekst = scanner.nextLine();

        StringBuilder wynik = new StringBuilder();

        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);

            if (Character.isLowerCase(znak)) {
                wynik.append(Character.toUpperCase(znak));
            } else if (Character.isUpperCase(znak)) {
                wynik.append(Character.toLowerCase(znak));
            } else {
                wynik.append(znak);
            }
        }

        System.out.println("Wynik po zamianie liter: " + wynik.toString());

        scanner.close();
    }
}
    