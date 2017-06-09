/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author lineth
 */
public class CircularList {
    
    
    public Node head, tail;
    private int size;

    public CircularList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }//const
    
    public void insertIntoTail(String name){
        Node newNode = new Node(name);
        
        //preguntas
        if(this.tail == null){//lista vacía
            this.head = newNode;
            this.tail = newNode;
        }else{
            newNode.prevPtr = this.tail;
            this.tail.nextPtr = newNode;
            this.tail = newNode;
        }
        this.size++;
    }//end method
    
    public void insertIntoHead(String name){
        Node newNode = new Node(name);
        
        //preguntas
        if(this.head == null){//lista vacía
            this.tail = newNode;
            this.head = newNode;
        }else{
            newNode.nextPtr = this.head;
            this.head.prevPtr = newNode;
            this.head = newNode;
        }
        this.size++;
    }//end method
    
    
    public boolean deleteToList(String name){
        Node temp = this.head;
        
        while(temp != null && !name.equals(temp.name)){
            temp = temp.nextPtr;
        }
        
        if(this.size == 0){
            return false;
        }else{
            if(temp == null){
                return false;
            }else{
                //pregunto si es el primero
                if(temp == this.head){
                    this.head = this.head.nextPtr;
                    this.head.prevPtr = null;
                    
                    --size;
                    return true;
                }else{
                    temp.prevPtr.nextPtr = temp.nextPtr;
                    if(temp == this.tail){
                        this.tail = this.tail.prevPtr;
                    }else{
                        temp.nextPtr.prevPtr = temp.prevPtr;
                    }
                    
                    --size;
                    return true;
                }
            }
        }
    }//end method
    
   
    public void printList(){
        Node temp = this.head;
        System.out.println("List size: " + this.size);
//        System.err.print("");
        while(temp != null){
            System.err.print(temp.name + "-> ");
            temp = temp.nextPtr;
        }
//        System.err.println("NULL");
    }//end method
}
    

