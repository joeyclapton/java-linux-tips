import java.util.HashSet;
import java.util.Set;

public class CollectionsHashSet {
    public static void main(String[] args) {
        
        Set<Integer> notes = new HashSet<>();

        notes.add(23);
        notes.add(30);
        notes.add(4);

        var listTotal = notes.size();
        System.out.println("List length -> " + listTotal);

        for(Integer note : notes) {
            System.out.println(note);
        }

    }
}
