/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author catherine
 */
public class VentanaFiction extends JInternalFrame implements ActionListener{
    private JButton jbtnAceptarFiction;
    private JLabel jlbCode;
    private JLabel jlbTitle;
    private JLabel jlbGender;
    private JLabel jlbTotal;
    private JLabel jlbSubtitled;
    private JLabel jlbPremier;
    private JTextField jtfCodeFiction;
    private JTextField jtfTitleFiction;
    private JTextField jtfGenderFiction;
    private JTextField jtfTotalFiction;
    private JTextField jtfSubtitledFiction;
     private JTextField jtfPremierFiction;
    
    VentanaFiction(){
      super("Género de Ficción");
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
        this.jtfCodeFiction = new JTextField(10);
        this.add(this.jlbCode);
        this.add(this.jtfCodeFiction);
        
        this.jlbTitle = new JLabel("Nombre de Pelicula: ");
        this.jtfTitleFiction = new JTextField(10);
        this.add(this.jlbTitle);
        this.add(this.jtfTitleFiction);
        
        this.jlbGender = new JLabel("Género de Película: ");
        this.jtfGenderFiction = new JTextField(10);
        this.add(this.jlbGender);
        this.add(this.jtfGenderFiction);
        
        this.jlbTotal = new JLabel("Puntuación: ");
        this.jtfTotalFiction = new JTextField(10);
        this.add(this.jlbTotal);
        this.add(this.jtfTotalFiction);
        
        this.jlbSubtitled = new JLabel("Subtitulos: ");
        this.jtfSubtitledFiction = new JTextField(10);
        this.add(this.jlbSubtitled);
        this.add(this.jtfSubtitledFiction);
        
        this.jlbPremier = new JLabel("Premier: ");
        this.jtfPremierFiction = new JTextField(10);
        this.add(this.jlbPremier);
        this.add(this.jtfPremierFiction);

        //JBUTTON
        this.jbtnAceptarFiction = new JButton("Registrar película");
        this.jbtnAceptarFiction.addActionListener(this);
        this.add(this.jbtnAceptarFiction);
        
    }//fin init

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==this.jbtnAceptarFiction){
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
