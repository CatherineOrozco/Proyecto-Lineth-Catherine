/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Font;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

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


/**
 *
 * @author catherine
 */
public class PrincipalWindow extends JFrame implements ActionListener{
    //atributos
    private JDesktopPane desktopPane;
    private JMenu jMenu;
    private JMenuBar jMenuBar;
    private JMenuItem jMIComedy, jMIRomance, jMIFiction, jMIChildish, jMIAction, jMIDrama;
    private JFileChooser chooser;
    private JButton jbtnOPenFile;

    private String rute;
    private ImageIcon Image;
    private  String information;
    private BufferedImage image;
    
    
    public PrincipalWindow() {    
        super("Registro de Película según Género");//llama a JFrame
        
    
       

        init();
        
    }//fin constructor por defecto
    
      public String getRute() {
        return rute;
    }
    
     private void init() {

          
             

        this.jMenuBar = new JMenuBar();
        this.add(this.jMenuBar);
        
        this.jMenu= new JMenu("Menu");
        jMenuBar.add(this.jMenu);
        
        this.jMIAction = new JMenuItem("Action Movie");
        this.jMIAction.addActionListener(this);
        this.jMenu.add(jMIAction);
        
        this.jMIChildish = new JMenuItem("Childish Movie");
        this.jMIChildish.addActionListener(this);
        this.jMenu.add(jMIChildish);
        
        this.jMIComedy = new JMenuItem("Comedy Movie");
        this.jMIComedy.addActionListener(this);
        this.jMenu.add(jMIComedy);
        
        this.jMIFiction = new JMenuItem("Fiction Movie");
        this.jMIFiction.addActionListener(this);
        this.jMenu.add(jMIFiction);
        
        this.jMIRomance = new JMenuItem("Romance Movie");
        this.jMIRomance.addActionListener(this);
        this.jMenu.add(jMIRomance);
        
        this.jMIDrama = new JMenuItem("Drama movie");
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

        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }//fin init
     
     public String openFile() throws IOException {

        String information = "";
        chooser = new JFileChooser();

        
        chooser = new JFileChooser();
                if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            FileReader fileReader = null;
            try {
                rute = chooser.getSelectedFile().getAbsolutePath();

                FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("*.CSV", "*.csv");

//                FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("CSV", "csv");

                File file = new File(rute);

                fileReader = new FileReader(file);

                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    information += line + "\n";
                }//while
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PrincipalWindow.class.getName()).log(Level.SEVERE, null, ex);
            }//try-catch//try-catch//try-catch//try-catch
        } else {

        }

        return information;
    }//openFIle


   

    public String openRute() throws IOException {


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
                ActionWindow rGP=new ActionWindow();
                this.add(rGP);
                rGP.setVisible(true);
//                
            }else if(e.getSource()==this.jMIChildish){
                ChildishWindow rGA=new ChildishWindow();
                this.add(rGA);
                rGA.setVisible(true);
            }else if(e.getSource()==this.jMIComedy){
                ComedyWindow rGC=new ComedyWindow();
                this.add(rGC);
                rGC.setVisible(true);
            }else if(e.getSource()==this.jMIFiction){
                FictionWindow rGF=new FictionWindow();
                this.add(rGF);
                rGF.setVisible(true);
            }else if(e.getSource()==this.jMIRomance){
                RomanceWindow rGR=new RomanceWindow();
                this.add(rGR);
                rGR.setVisible(true);
            }else {
                DramaWindow rGT=new DramaWindow();
                this.add(rGT);
                rGT.setVisible(true);
            }
        if(e.getSource() == this.jbtnOPenFile) {

            try {
                openFile();
                
            } catch (IOException ex) {
                Logger.getLogger(PrincipalWindow.class.getName()).log(Level.SEVERE, null, ex);
            }

            
           
        }//btnOpenFile

        
    }//action
    
}

