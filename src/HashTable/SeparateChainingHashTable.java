package HashTable;

import List.MyLinkedList;



/**
 *
 * @author TATIS
 * @param <T>
 */
public class SeparateChainingHashTable<T extends Comparable> {
    private MyLinkedList<T> [] listas;
    private int currentSize;
    
    public SeparateChainingHashTable(){
        this(101);
    }
    
    public SeparateChainingHashTable(int size){
        listas = new MyLinkedList[nextPrime(size)];
        for(int i=0; i < listas.length; i++){
            listas[i] = new MyLinkedList<>();
        }
    }
    
    //Vacia el Hash Table
    public void makeEmpty(){
        for(int i=0; i<listas.length; i++)
            listas[i].clear();
        currentSize = 0;
    }
    
    
    //Hash Function
    private int myHash(T element){
        int hashVal = element.hashCode();
        
        hashVal %= listas.length;
        if(hashVal < 0)
            hashVal += listas.length;
        
        return hashVal;
    }
    
    public boolean contains(T element){
        MyLinkedList<T> whichList = listas[myHash(element)];
        return whichList.contains(element);
    }
    
    
    public void insert(T element){
        MyLinkedList<T> whichList = listas[myHash(element)];
        if(!whichList.contains(element)){
            whichList.add(element);
            currentSize++;
        }
    }
    
    public T remove(T element){
        MyLinkedList<T> whichList = listas[myHash(element)];
        if(whichList.contains(element)){
            currentSize--;
            return whichList.remove(element);
        }
        return null;
    }
    
    
    
    private static int nextPrime(int n){
        int aux = n;
        while(true){
            if(isPrime(aux)){
                return aux;
            }
            aux++;
        }   
    }
    
    private static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if( (n%i) == 0)
                return false;
        }
        return true;
    }
    
    public void print(){
        for(int i=0; i<listas.length; i++){
            System.out.println("Lista: " + (i+1));
            listas[i].print();
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------------------------");
        }
    }
}
