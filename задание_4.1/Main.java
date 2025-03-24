import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        String[] words = {
            "яблоко", "банан", "груша", "апельсин", "яблоко",
            "банан", "киви", "персик", "груша", "груша",
            "ананас", "апельсин", "яблоко", "киви", "персик",
            "банан", "ананас", "груша", "апельсин", "апельсин"
        };

        
        HashMap<String, Integer> wordCount = new HashMap<>();

        
        for (String word : words) {
            
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                
                wordCount.put(word, 1);
            }
        }

        
        System.out.println("Уникальные слова и их количество:");
        for (String key : wordCount.keySet()) {
            System.out.println(key + ": " + wordCount.get(key));
        }
    }
}
