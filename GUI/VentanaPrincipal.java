/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
<<<<<<< HEAD
import java.awt.Graphics;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
=======
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
>>>>>>> 42499db2502dbfe21a70a8c188c71c78133e4a0d
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileNameExtensionFilter;

<<<<<<< HEAD
=======

>>>>>>> 42499db2502dbfe21a70a8c188c71c78133e4a0d
/**
 *
 * @author catherine
 */
public class VentanaPrincipal extends JFrame implements ActionListener{
    //atributos
    private JDesktopPane desktopPane;
    private JMenu jMenu;
    private JMenuBar jMenuBar;
    private JMenuItem jMIComedy, jMIRomance, jMIFiction, jMIChildish, jMIAction, jMIDrama;
    private JFileChooser chooser;
    private JButton jbtnOPenFile;
<<<<<<< HEAD
    private String rute;
    private ImageIcon Image;
    
    
    public VentanaPrincipal() {    
        super("Registro de Película según Género");//llama a JFrame
=======
    private  String rute;
    private  String information;
    private BufferedImage image;

    public String getRute() {
        return rute;
    }
    
    public VentanaPrincipal() {    
        super("Registro de Película según Género");//llama a JFrame
        try {
            this.image=ImageIO.read(getClass().getResourceAsStream("/assets/fondo.png"));
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
>>>>>>> 42499db2502dbfe21a70a8c188c71c78133e4a0d
        init();
        
    }//fin constructor por defecto
    
     private void init() {
<<<<<<< HEAD
          
             
=======
>>>>>>> 42499db2502dbfe21a70a8c188c71c78133e4a0d
        this.jMenuBar = new JMenuBar();
        this.add(this.jMenuBar);
        
        this.jMenu= new JMenu("Menu");
        jMenuBar.add(this.jMenu);
        
        this.jMIAction = new JMenuItem("Registrar película de Acción");
        this.jMIAction.addActionListener(this);
        this.jMenu.add(jMIAction);
        
        this.jMIChildish = new JMenuItem("Registrar película para niños");
        this.jMIChildish.addActionListener(this);
        this.jMenu.add(jMIChildish);
        
        this.jMIComedy = new JMenuItem("Registrar película de Comedia");
        this.jMIComedy.addActionListener(this);
        this.jMenu.add(jMIComedy);
        
        this.jMIFiction = new JMenuItem("Registrar película de Ficción");
        this.jMIFiction.addActionListener(this);
        this.jMenu.add(jMIFiction);
        
        this.jMIRomance = new JMenuItem("Registrar película Romántica");
        this.jMIRomance.addActionListener(this);
        this.jMenu.add(jMIRomance);
        
        this.jMIDrama = new JMenuItem("Registrar película de Drama");
        this.jMIDrama.addActionListener(this);
        this.jMenu.add(jMIDrama);

        this.jbtnOPenFile = new JButton("Open File");
        this.jbtnOPenFile.setBounds(390, 45, 137, 40);
        this.jbtnOPenFile.addActionListener(this);
        this.jbtnOPenFile.setBackground(Color.GRAY);
        this.jbtnOPenFile.setFont(new Font("Monospace", Font.PLAIN, 12));
         this.add(this.jbtnOPenFile);
        
//       new ImageIcon((Image) ImageIO.read(getClass().getResourceAsStream("/assets/fondo.png")));
        this.setJMenuBar(jMenuBar);
        
<<<<<<< HEAD
            
           
=======
>>>>>>> 42499db2502dbfe21a70a8c188c71c78133e4a0d
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }//fin init
     
     public String openFile() throws IOException {
<<<<<<< HEAD
        String information = "";
        chooser = new JFileChooser();
=======
        
        chooser = new JFileChooser();
        
>>>>>>> 42499db2502dbfe21a70a8c188c71c78133e4a0d
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            FileReader fileReader = null;
            try {
                rute = chooser.getSelectedFile().getAbsolutePath();
<<<<<<< HEAD
                FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("*.CSV", "*.csv");
=======
//                FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("CSV", "csv");
>>>>>>> 42499db2502dbfe21a70a8c188c71c78133e4a0d
                File file = new File(rute);

                fileReader = new FileReader(file);

                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    information += line + "\n";
                }//while
            } catch (FileNotFoundException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }//try-catch//try-catch
        } else {

        }

        return information;
    }//openFIle

<<<<<<< HEAD
    public String getRute() throws IOException {
=======
    public String openRute() throws IOException {
>>>>>>> 42499db2502dbfe21a70a8c188c71c78133e4a0d

        chooser = new JFileChooser();
        String rute = "";
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

            rute += chooser.getSelectedFile().getAbsolutePath();

        } else {

        }

        return rute;
    }//openFIle
    
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.jMIAction){
                VentanaAction rGP=new VentanaAction();
                this.add(rGP);
                rGP.setVisible(true);
//                
            }else if(e.getSource()==this.jMIChildish){
                VentanaChildish rGA=new VentanaChildish();
                this.add(rGA);
                rGA.setVisible(true);
            }else if(e.getSource()==this.jMIComedy){
                VentanaComedy rGC=new VentanaComedy();
                this.add(rGC);
                rGC.setVisible(true);
            }else if(e.getSource()==this.jMIFiction){
                VentanaFiction rGF=new VentanaFiction();
                this.add(rGF);
                rGF.setVisible(true);
            }else if(e.getSource()==this.jMIRomance){
                VentanaRomance rGR=new VentanaRomance();
                this.add(rGR);
                rGR.setVisible(true);
            }else {
                VentanaDrama rGT=new VentanaDrama();
                this.add(rGT);
                rGT.setVisible(true);
            }
        if(e.getSource() == this.jbtnOPenFile) {

            try {
                openFile();
                
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

            
           
        }//btnOpenFile

        
    }//action
    
}

