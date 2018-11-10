package Sets;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Asus-Pc
 */

public class MainSets {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        
        System.out.println("Ejemplo #1 -  TreeSet");
        Set<String> myTreeSet= new TreeSet<>(new CaseInsensitiveCompare());
        myTreeSet.add("Hello");
        myTreeSet.add("heLLo");
        System.out.println("Tamaño de mi TreeSet: " + myTreeSet.size());
        
        
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        
        System.out.println("Ejemplo #2  - HashSet");
        Set<Integer> myHashSet = new HashSet<>();
        myHashSet.add(12);
        myHashSet.add(2);
        myHashSet.add(12);
        System.out.println("Tamaño de mi HashSet: " + myHashSet.size());
        
        System.out.println("");
        System.out.println("-------------------------------------------------");
        
        
    }
}
