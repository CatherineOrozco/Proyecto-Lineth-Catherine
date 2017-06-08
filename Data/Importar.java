/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.csvreader.CsvReader;
import Domain.Pelicula;
import GUI.VentanaPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author catherine
 */
public class Importar {
    
        
    
    public static void main(String[] args) throws IOException {
            List<Pelicula> pelicula = new ArrayList<Pelicula>();
            VentanaPrincipal ventana= new VentanaPrincipal();
            CsvReader peliculas_import = new CsvReader(ventana.getRute());
            peliculas_import.readHeaders();
            
            while (peliculas_import.readRecord()) {
                try {
                    String code = peliculas_import.get(0);
                    String title = peliculas_import.get(1);
                    String gender = peliculas_import.get(2);
                    String total = peliculas_import.get(3);
                    String subtitled = peliculas_import.get(4);
                    String premier = peliculas_import.get(5);
                    
                    pelicula.add(new Pelicula(code,title,gender,total,subtitled,premier));
                } catch (IOException ex) {
                    Logger.getLogger(Importar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            peliculas_import.close();
            for(Pelicula peli : pelicula){
                System.out.println(peli.getCode() + " - " + peli.getTitle() + " - " + peli.getGender()+" - "+ peli.getTotal() + " - " + peli.getSubtitled() + " - " + peli.getPremier() );
            }
    }    
}
     
 

