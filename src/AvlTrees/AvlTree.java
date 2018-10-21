/**

 * @author: Camilo Andres Gil Ballen

 */
package AvlTrees;
public class AvlTree<T extends Comparable> {

    private AvlNode<T> root;

    public AvlTree() {
        this.root = null;
    }

    //Vaciar
    public void makeEmpty() {
        root = null;
    }

    //¿Esta Vacio?
    public boolean isEmpty() {
        return root == null;
    }

    //¿Contiene un determinado Elemento?
    public boolean contains(T element) {
        return contains(element, this.root);
    }

    private boolean contains(T element, AvlNode<T> head) {
        if (head == null) {
            return false;
        }

        int compareResult = element.compareTo(head.getElement());

        if (compareResult < 0) {
            return contains(element, head.getLeft());
        } else if (compareResult > 0) {
            return contains(element, head.getRight());
        } else {
            return true;
        }
    }

    //Objeto mas pequeño del Arbol
    public T findMin() {
        return findMin(this.root).getElement();
    }

    private AvlNode<T> findMin(AvlNode<T> node) {
        if (node == null) {
            return null;
        } else if (node.getLeft() == null) {
            return node;
        } else {
            return findMin(node.getLeft());
        }
    }

    //Objeto mas grande del Arbol
    public T findMax() {
        return findMax(this.root).getElement();
    }

    private AvlNode<T> findMax(AvlNode<T> node) {
        if (node == null) {
            return null;
        } else if (node.getRight() == null) {
            return node;
        } else {
            return findMax(node.getRight());
        }
    }

    //Altura del Arbol
    public int height() {
        return height(this.root);
    }

    private int height(AvlNode<T> node) {
        if (node == null) {
            return -1;
        } else {
            return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
        }
    }

    //Agregar un Elemento
    public void insert(T element) {
        this.root = insert(element, this.root);
    }

    
    private AvlNode<T> insert(T element, AvlNode<T> node) {
        if (node == null) {
            return new AvlNode<>(element, null, null);
        }

        int compareResult = element.compareTo(node.getElement());
        if (compareResult < 0) {
            node.setLeft(insert(element, node.getLeft()));
        } else if (compareResult > 0) {
            node.setRight(insert(element, node.getRight()));
        } else {;
        }//Ya esta

        return balance(node);
    }

    
    //Eliminar
    public  void remove(T element){
        if((element == root.getElement()) && ((root.getLeft() == null)||(root.getRight() == null))){
            root = remove(element, root);
        }
        else{
            remove(element, root);
        }
    }
    
     
    private AvlNode<T> remove(T element, AvlNode<T> node)
    {   
        if(node == null)
            return node;
        
        int compareResult = element.compareTo(node.getElement());
        
        if(compareResult < 0)
            node.setLeft(remove(element, node.getLeft()));
        else if(compareResult > 0)
            node.setRight(remove(element,node.getRight()));
        else if(node.getLeft() != null && node.getRight() != null)
        {
            node.setElement((T) findMin(node.getRight()).getElement());
            node.setRight(remove(node.getElement(), node.getRight()));
        }
        else
            node = (node.getLeft() != null) ? node.getLeft() : node.getRight();
        
        return balance(node);
        
    }
    
    //Balanceo a la Hora de agregar
    private AvlNode<T> balance(AvlNode<T> node) {
       
        if (node == null) {
            return null;
        }
        if (height(node.getLeft()) - height(node.getRight()) > 1) {
            if (height(node.getLeft().getLeft()) >= height(node.getLeft().getRight())) {
                node = rotateWithLeftChild(node);
            } else {
                node = doubleWithLeftChild(node);
            }
        } else {
            if (height(node.getRight()) - height(node.getLeft()) > 1) {
                if (height(node.getRight().getRight()) >= height(node.getRight().getLeft())) {
                    node = rotateWithRightChild(node);
                } else {
                    node = doubleWithRigtChild(node);
                }
            }
        }
        node.setHeight(Math.max(height(node.getLeft()), height(node.getRight())) + 1);
        return node;
    }

    //Rotacion a la derecha Simple
    private AvlNode<T> rotateWithLeftChild(AvlNode<T> k2) {
        AvlNode<T> k1 = k2.getLeft();
        k2.setLeft(k1.getRight());
        k1.setRight(k2);
        k2.setHeight(Math.max(height(k2.getLeft()), height(k2.getRight())) + 1);
        k1.setHeight(Math.max(height(k1.getLeft()), height(k1.getRight())) + 1);
        return k1;
    }

    //Rotacion a la Izquierda Simple
    private AvlNode<T> rotateWithRightChild(AvlNode<T> k1) {
        AvlNode<T> k2 = k1.getRight();
        k1.setRight(k2.getLeft());
        k2.setLeft(k1);
        k2.setHeight(Math.max(height(k2.getLeft()), height(k2.getRight())) + 1);
        k1.setHeight(Math.max(height(k1.getLeft()), height(k1.getRight())) + 1);
        return k2;
    }

    //Rotacion a la Derecha Doble
    private AvlNode<T> doubleWithLeftChild(AvlNode<T> k3) {
        k3.setLeft(rotateWithRightChild(k3.getLeft()));
        return rotateWithLeftChild(k3);
    }

    //Rotacion a la Izquierda Doble
    private AvlNode<T> doubleWithRigtChild(AvlNode<T> k1) {
        k1.setRight(rotateWithLeftChild(k1.getRight()));
        return rotateWithRightChild(k1);
    }

    //Imprimir el Arbol
    public void print() {
        print(this.root, "");
    }

    private void print(AvlNode<T> node, String space) {
        if (node != null) {
            System.out.println(space + node.getElement() + ")");
            print(node.getLeft(), space+"   ");
            print(node.getRight(), space+"   ");
        }
        else{
            System.out.println(space + "*NULL");
        }
    }

}
