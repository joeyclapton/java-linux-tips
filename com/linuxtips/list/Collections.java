import java.util.Map;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {
        Map<String, Integer> todo = new HashMap<>();
        
        todo.put("shopping", 4);
        todo.put("running", 3);

        for(Map.Entry<String, Integer> entry : todo.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
        } 
    }
}
