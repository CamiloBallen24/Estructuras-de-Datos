package Maps;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Asus-Pc
 */
public class MainMaps {
    public static void main(String[] args) {
        
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        Map<Integer, String> myMap = new TreeMap<Integer, String>();
        myMap.put(1007358401, "Camilo Andres Gil Ballen");
        System.out.println(myMap.get(1007358401));
        
        System.out.println("");
        System.out.println("-------------------------------------------------");
    }
}
