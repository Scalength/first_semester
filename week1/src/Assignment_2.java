import java.util.Scanner;
import java.util.ArrayList;
import java.util

class Tindahan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> binili = new ArrayList<>();

        System.out.println("Ano pangalan mo iho? ");
        String pangalan = scanner.nextLine();

        while (true) {
            System.out.println("Enter your bibilin: ");
            String paninda = scanner.nextLine();
            binili.add(paninda);
            if (paninda.equalsIgnoreCase("exit")) {
                break;
            }
        }
        System.out.println("Ang binili ni " + pangalan + " ay " + binili);
        scanner.close();
    }
}