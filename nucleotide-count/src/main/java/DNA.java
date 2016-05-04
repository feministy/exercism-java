import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DNA {
    private Map<Character, Integer> counts;
    private static final List<Character> validDna = Arrays.asList('A', 'C', 'G', 'T');

    public DNA(String dna) {
        counts = new HashMap<>();
        for (char nucleotide : validDna) {
            counts.put(nucleotide, 0);
        }

        for (int i = 0; i < dna.length(); i++) {
            Character nucleotide = dna.charAt(i);
            if (!validDna.contains(nucleotide)) {
                throw new IllegalArgumentException("Invalid DNA!");
            }
            Integer count = counts.get(nucleotide);
            counts.replace(nucleotide, count, ++count);
        }
    }

    public int count(char nucleotide) {
        if (!validDna.contains(nucleotide)) {
            throw new IllegalArgumentException("Invalid DNA!");
        }
        return counts.get(nucleotide);
    }

    public Map nucleotideCounts() {
        return counts;
    }
}
