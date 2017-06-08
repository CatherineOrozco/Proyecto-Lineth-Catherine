/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Catherine
 */
public class MyGraphics2D extends JPanel{
    
    private Graphics2D graphics2D;
    private BufferedImage image;
    
    public MyGraphics2D(){
        try {
            this.setPreferredSize(new Dimension(800, 600));
            this.image=ImageIO.read(getClass().getResourceAsStream("/assets/fondo.png"));
        } catch (IOException ex) {
            Logger.getLogger(MyGraphics2D.class.getName()).log(Level.SEVERE, null, ex);
        }//try catch
    }//Constructor
     
    
}
