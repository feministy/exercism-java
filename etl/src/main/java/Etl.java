import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
   public Map<String, Integer> transform(Map<Integer, List<String>> old) {
       Map<String, Integer> modified = new HashMap<>();
       for (Integer points : old.keySet()) {
           List<String> letters = old.get(points);
           letters.forEach(letter -> modified.put(letter.toLowerCase(), points));
       }
       return modified;
   }
}
