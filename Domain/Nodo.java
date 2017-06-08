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
public class Nodo {
   public String name;
    public Nodo nextPtr, prevPtr;

    public Nodo(String name) {
        this.name = name;
        this.nextPtr = null;
        this.prevPtr = null;
    }
     
}
