/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyetojava;
import Data.Import;
import Domain.Movie;
import Domain.CircularList;
import GUI.PrincipalWindow;


public class JavaProyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.insertIntoHead("Lineth");
        list.insertIntoHead("Catherine");
        list.insertIntoHead("Fabian");
        list.printList();
        PrincipalWindow v=new PrincipalWindow();
    
    }//main
    
}//class
