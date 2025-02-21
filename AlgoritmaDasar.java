import java.util.*;

public class AlgoritmaDasar {
    public static void main(String[] args) {
        // Soal A
        Object[] arr = {12, 9, 30, "A", "M", 99, 82, "J", "N", "B"};
        List<String> letters = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        
        for (Object obj : arr) {
            if (obj instanceof String) {
                letters.add((String) obj);
            } else if (obj instanceof Integer) {
                numbers.add((Integer) obj);
            }
        }
        Collections.sort(letters);
        Collections.sort(numbers);

        List<Object> result = new ArrayList<>(letters);
        result.addAll(numbers);
        System.out.println(result);

        // Soal B
        System.out.println(pattern_count("palindrom", "ind"));
        System.out.println(pattern_count("abakadabra", "ab")); 
        System.out.println(pattern_count("hello", "")); 
        System.out.println(pattern_count("ababab", "aba")); 
        System.out.println(pattern_count("aaaaaa", "aa"));
        System.out.println(pattern_count("hell", "hello")); 

        // Soal C
        System.out.println(countLetters("Hello World"));
        System.out.println(countLetters("Bismillah"));
        System.out.println(countLetters("MasyaAllah"));
    }

   
    public static int pattern_count(String text, String pattern) {
        if (pattern.length() == 0 || text.length() < pattern.length()) return 0;
        int count = 0;
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            if (text.substring(i, i + pattern.length()).equals(pattern)) {
                count++;
            }
        }
        return count;
    }

   
    public static Map<String, Integer> countLetters(String input) {
        Map<String, Integer> letterCount = new TreeMap<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                String key = String.valueOf(c);
                letterCount.put(key, letterCount.getOrDefault(key, 0) + 1);
            }
        }
        return letterCount;
    }
}
