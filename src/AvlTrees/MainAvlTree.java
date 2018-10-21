/**

 * @author: Camilo Andres Gil Ballen

 */
package AvlTrees;
public class MainAvlTree {
    public static void main(String[] args) {
        AvlTree<Integer> myAvlTree = new AvlTree<>();
        
        myAvlTree.insert(50);
        System.out.println("Inserta 50");
        myAvlTree.print();
        System.out.println("----------------------------------------------------");
        
        myAvlTree.insert(30);
        System.out.println("Inserta 30");
        myAvlTree.print();
        System.out.println("----------------------------------------------------");
        
        myAvlTree.insert(20);
        System.out.println("Inserta 20");
        myAvlTree.print();
        System.out.println("----------------------------------------------------");
        
        myAvlTree.insert(70);
        System.out.println("Inserta 70");
        myAvlTree.print();
        System.out.println("----------------------------------------------------");
        
        myAvlTree.insert(60);
        System.out.println("Inserta 60");
        myAvlTree.print();
        System.out.println("----------------------------------------------------");
        
        myAvlTree.insert(80);
        System.out.println("Inserta 80");
        myAvlTree.print();
        System.out.println("----------------------------------------------------");
        
        myAvlTree.insert(75);
        System.out.println("Inserta 75");
        myAvlTree.print();
        System.out.println("----------------------------------------------------");
        
        myAvlTree.insert(65);
        System.out.println("Inserta 68");
        myAvlTree.print();
        System.out.println("----------------------------------------------------");
        
        myAvlTree.insert(68);
        myAvlTree.print();
        System.out.println("----------------------------------------------------");
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("********************ELIMINACION*********************");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("----------------------------------------------------");
        System.out.println("Eliminamos el 80");
        myAvlTree.remove(80);
        myAvlTree.print();
        System.out.println("----------------------------------------------------");
        
        
        System.out.println("Eliminamos el 65");
        myAvlTree.remove(65);
        myAvlTree.print();
        System.out.println("----------------------------------------------------");
        
        System.out.println("Eliminamos el 60");
        myAvlTree.remove(60);
        myAvlTree.print();
        System.out.println("----------------------------------------------------");
    }
}
