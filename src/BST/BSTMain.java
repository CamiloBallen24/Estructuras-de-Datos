/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BST;

/**

 * @author: Camilo Andres Gil Ballen

 */
public class BSTMain {
    
    public static void main(String args[])
    {
        MyBinarySearchTree<Integer> myBST = new MyBinarySearchTree<>();
        
        myBST.insert(10);
        myBST.insert(1);
        myBST.insert(-3);
        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(122);
        myBST.insert(125);
        myBST.insert(1252);
        myBST.insert(12521);
        myBST.insert(5);
        
        System.out.println(myBST.height());
        System.out.println(myBST.height02());
        
        System.out.println("The smallest data is " + myBST.findMin());
        System.out.println("The bigest data is " + myBST.findMax());
        
        myBST.remove(-3);
        System.out.println("The smallest data is " + myBST.findMin());
        
        System.out.println("The tree contains 5? " + myBST.contains(5));
        System.out.println("The tree contains 4? " + myBST.contains(4));
        
    }
    
}
