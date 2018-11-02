package HashTable;

/**
 *
 * @author TATIS
 */
public class HashTableMain {

    public static void main(String[] args) {
        SeparateChainingHashTable<Integer> myHashTable = new SeparateChainingHashTable<>(5);
        myHashTable.insert(12);
        myHashTable.insert(120);
        myHashTable.insert(121);
        myHashTable.insert(11);
        myHashTable.insert(15);
        myHashTable.insert(52);
        myHashTable.insert(53);
        myHashTable.insert(3);
        myHashTable.insert(8);
        myHashTable.insert(2);
        myHashTable.insert(1);
        myHashTable.insert(21);
        myHashTable.insert(14);
        myHashTable.insert(30);
        myHashTable.print();
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("**************************************************************************************");
        System.out.println("Contiene el 53: " +  myHashTable.contains(53));
        System.out.println("Contiene el 30: " +  myHashTable.contains(30));
        System.out.println("**************************************************************************************");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        
        
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("**************************************************************************************");
        System.out.println("Eliminamos el 30: " +  myHashTable.remove(30));
        System.out.println("**************************************************************************************");
        System.out.println("");
        System.out.println("");
        myHashTable.print();
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
