/**

 * @author: Camilo Andres Gil Ballen

 */
package AvlTrees;

public class AvlNode<T extends Comparable>{
    private T element;
    private AvlNode left;
    private AvlNode right;
    private int height;

    public AvlNode(T element){
        this(element, null, null);
    }
    
    public AvlNode(T element, AvlNode left, AvlNode right) {
        this.element = element;
        this.left = left;
        this.right = right;
        this.height=0;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public AvlNode getLeft() {
        return left;
    }

    public void setLeft(AvlNode left) {
        this.left = left;
    }

    public AvlNode getRight() {
        return right;
    }

    public void setRight(AvlNode right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public int height(AvlNode<T> node){
        if(node==null){ return -1;}
        else{ return node.height;}
    }
    
    
}
