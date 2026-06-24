import java.util.HashMap;
import java.util.Map;

/**
 * table items = 
 * {
 * soda = 60,
 * rice(kg) = 99,
 * chicken breast = 50,
 * veggies = 99,
 * fries = 32,
 *
 *
 */

public class HardcodedDictionaryExample {

    public int AddTax(sum) {
        return sum * 1.12;
    }

    public void AddItem(item, price) {
        put(item, price)
    }

    public void RemoveItem(item) {
        remove(item);
    }

    }

    public static void main(String[] args) {
        // Mutable hardcoded dictionary
        Map<String, String> dictionary = new HashMap<>() {{
            put("dog", "A domesticated carnivorous mammal");
            put("elephant", "A large herbivorous mammal with a trunk");
            put("fish", "An aquatic animal that lives in water");
        }};

        // Accessing values
        System.out.println("dog: " + dictionary.get("dog"));
        System.out.println("fish: " + dictionary.get("fish"));
    }
}