import java.util.*;

public class WordCount {
    private Map<String, Integer> dictionary;

    public WordCount() {
        dictionary = new HashMap<>();
    }

    public Map phrase(String sentence) {
        List<String> words = Arrays.asList(sentence.split("\\s+"));
        for (String rawWord : words) {
            Set<String> currentList = dictionary.keySet();
            String word = rawWord.replaceAll("\\W+", "").toLowerCase();
            if (currentList.contains(word)) {
                Integer count = dictionary.get(word);
                dictionary.replace(word, count, ++count);
            } else if (word.length() > 0) {
                dictionary.put(word, 1);
            }
        }
        return dictionary;
    }
}
