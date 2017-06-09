/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author catherine
 */
public class Node {
   public String name;
    public Node nextPtr, prevPtr;

    public Node(String name) {
        this.name = name;
        this.nextPtr = null;
        this.prevPtr = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getNextPtr() {
        return nextPtr;
    }

    public void setNextPtr(Node nextPtr) {
        this.nextPtr = nextPtr;
    }

    public Node getPrevPtr() {
        return prevPtr;
    }

    public void setPrevPtr(Node prevPtr) {
        this.prevPtr = prevPtr;
    }

    @Override
    public String toString() {
        return "Nodo{" + "name=" + name + ", nextPtr=" + nextPtr + ", prevPtr=" + prevPtr + '}';
    }
    
    
     
}
