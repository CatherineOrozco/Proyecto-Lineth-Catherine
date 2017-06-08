/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JTextField;

/**
 *
 * @author catherine
 */
public class VentanaAction extends JInternalFrame implements ActionListener{
    private JButton jbtnAceptar;
    private JLabel jlbCode;
    private JLabel jlbTitle;
    private JLabel jlbGender;
    private JLabel jlbTotal;
    private JLabel jlbSubtitled;
     private JLabel jlbPremier;
    private JTextField jtfCodeAction;
    private JTextField jtfTitleAction;
    private JTextField jtfGenderAction;
    private JTextField jtfTotalAction;
    private JTextField jtfSubtitledAction;
     private JTextField jtfPremierAction;
    
    VentanaAction(){
      super("Género Acción");
        this.setSize(400, 100);
        this.setResizable(false);
        this.setClosable(true);
        this.setLayout(new FlowLayout());
        this.dispose();
        //crearArchivo();
        init();
    }//fin contructor por defecto
    
    private void init(){
        //JLABEL y JTEXTFIELD
        this.jlbCode = new JLabel("Código de Película: ");
        this.jtfCodeAction = new JTextField(10);
        this.add(this.jlbCode);
        this.add(this.jtfCodeAction);
        
        this.jlbTitle = new JLabel("Nombre de Pelicula: ");
        this.jtfTitleAction = new JTextField(10);
        this.add(this.jlbTitle);
        this.add(this.jtfTitleAction);
        
        this.jlbGender = new JLabel("Género de Película: ");
        this.jtfGenderAction = new JTextField(10);
        this.add(this.jlbGender);
        this.add(this.jtfGenderAction);
        
        this.jlbTotal = new JLabel("Puntuación: ");
        this.jtfTotalAction = new JTextField(10);
        this.add(this.jlbTotal);
        this.add(this.jtfTotalAction);
        
        this.jlbSubtitled = new JLabel("Subtitulos: ");
        this.jtfSubtitledAction = new JTextField(10);
        this.add(this.jlbSubtitled);
        this.add(this.jtfSubtitledAction);
        
        this.jlbPremier = new JLabel("Premier: ");
        this.jtfPremierAction = new JTextField(10);
        this.add(this.jlbPremier);
        this.add(this.jtfPremierAction);

        //JBUTTON
        this.jbtnAceptar = new JButton("Registrar película");
        this.jbtnAceptar.addActionListener(this);
        this.add(this.jbtnAceptar);
        
    }//fin init

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==this.jbtnAceptar){
//             try {
//                 GeneroBusiness generoBusiness=new GeneroBusiness();
//                 String genero=this.jtfId.getText();
//                 //GeneroDomian genero=new GeneroDomian(this.jtfGenero.getText(),this.jtfId.getText());
//                 if(generoBusiness.verificar(genero)){
//                     JOptionPane.showMessageDialog(null,"La ID ya existe ","Error",ERROR_MESSAGE);
////                     this.dispose();
//                 }
//                 else
//                 {
//                     generoBusiness.guardarGenero(new Genero(this.jtfId.getText(), this.jtfGenero.getText()));
//                     JOptionPane.showMessageDialog(null,"Si registro con exito");
////                     this.jtfGenero.setText("");
////                     this.jtfId.setText("");
//                 }//else
//             } catch (IOException ex) {
//                 Logger.getLogger(VentanaRegistrarGenero.class.getName()).log(Level.SEVERE, null, ex);
//             } catch (ClassNotFoundException ex) {
//                 Logger.getLogger(VentanaRegistrarGenero.class.getName()).log(Level.SEVERE, null, ex);
//             }


        }
    }
}
