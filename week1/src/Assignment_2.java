import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Tindahan {
    Map<String, Integer> cash_register = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> binili = new ArrayList<>();
        Tindahan tindahan = new Tindahan();

        String item = "";
        int price = 0;

        tindahan.AddItem(item, price);

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

    public void AddItem(String item, int price) {
        cash_register.put(item, price);
        System.out.println(cash_register.get(item));
    }
}