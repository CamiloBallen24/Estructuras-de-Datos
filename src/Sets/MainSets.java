package Sets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Asus-Pc
 */

//Esta clase me brinda una serie de metodos que me permiten realizar comparaciones
//Se vconoce como una funcion objeto
class CaseInsensitiveCompare implements Comparator<String>{
    public int compare(String lhs, String rhs){
        return lhs.compareToIgnoreCase(rhs);
    }
}

public class MainSets {
    public static void main(String[] args) {
        System.out.println("Ejemplo #1 -  TreeSet");
        Set<String> myTreeSet= new TreeSet<>(new CaseInsensitiveCompare());
        myTreeSet.add("Hello");
        myTreeSet.add("heLLo");
        System.out.println("Tamaño de mi TreeSet: " + myTreeSet.size());
        
//        
//        System.out.println("");
//        System.out.println("");
//        System.out.println("-----------------------------------------------------------------------");
//        System.out.println("");
//        System.out.println("");
//        
//        
        
    }
}
