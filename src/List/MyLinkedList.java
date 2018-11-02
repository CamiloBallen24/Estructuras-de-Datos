/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

/**
 *
 * @author cgilb
 * @param <T>
 */
public class MyLinkedList<T extends Comparable> extends AbstractList<T> {
    
    Node<T> root;
    
    public MyLinkedList()
    {
        root = null;
        size = 0;
    }

    private Node<T> getNode(int index)
    {
        if (index >= 0 && index < size)
        {
            Node<T> node = root;
            for (int i = 0; i < index; i++) {
                node = node.getNext();                
            }
            return node;            
        }
                    
        throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
    }

    @Override
    public T get(int index) {        
        return getNode(index).getElement();
    }
    
    @Override
    public void add(int index, T element) {
        Node<T> newNextNode;
        if (index == size())
            newNextNode = null;
        else
            newNextNode= getNode(index);
        
        Node<T> newNode = new Node<>(element, newNextNode, null);
        
        if(index > 0)
        {
            Node<T> newBeforeNode = getNode(index - 1);        
            newBeforeNode.setNext(newNode);
        } else if (index == 0)
        {
            root = newNode;
        }
        size++;
    }

    @Override
    public boolean add(T element) {
        add(size(),element);
        return true;
    }    

    @Override
    public void set(int index, T element) {
        Node<T> actualNode = getNode(index);        
        actualNode.setElement(element);        
    }

    @Override
    public T remove(int index) {
        Node<T> removeNode = getNode(index);
        if(index == -1){return null;}
        
        if(index == 0)
        {
            root = removeNode.getNext();
            removeNode.setNext(null);
        }
        else
        {
            Node<T> beforeRemoveNode = getNode(index - 1);
            beforeRemoveNode.setNext(removeNode.getNext());
        }
        size--;
        return removeNode.getElement();
    }
    
    //Elimina un elemento en caso de estar contenido
    public T remove(T element){
        return remove(index(element));
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }
    
    //Regresa el index de un elemento en caso de estar contenido
    public int index(T element){
        Node<T> aux = root;
        int i=0;
        while(aux != null){
            if( (element.compareTo(aux.getElement())) == 0)
                return i;
            aux = aux.getNext();
            i++;
        }
        return -1;
    }
    
    public boolean contains(T element){
        Node<T> aux = root;
        while(aux != null){
            if( (element.compareTo(aux.getElement())) == 0){
                return true;
            }
            aux = aux.getNext();
            
        }
        return false;
    }
    
   @Override
    public void print()
    {
        System.out.print("(");
        for (int i = 0; i < size; i++) {
            if(i==size-1){
                System.out.print(get(i).toString());            
            }
            
            else{
                System.out.print(get(i).toString() + ",  "); 
            }
        }
        System.out.print(")");
    }

    
}
