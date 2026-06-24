import java.util.HashMap;
import java.util.Map;

public class HardcodedDictionaryExample {

    public void AddItem() {

    }

    public void RemoveItem() {

    }
a
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