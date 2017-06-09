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
public class ChildishWindow extends JInternalFrame implements ActionListener{
    private JButton jbtnAceptarChild;
     private JLabel jlbCode;
    private JLabel jlbTitle;
    private JLabel jlbGender;
    private JLabel jlbTotal;
    private JLabel jlbSubtitled;
     private JLabel jlbPremier;
    private JTextField jtfCodeChildish;
    private JTextField jtfTitleChildish;
    private JTextField jtfGenderChildish;
    private JTextField jtfTotalChildish;
    private JTextField jtfSubtitledChildish;
     private JTextField jtfPremierChildish;
    
    ChildishWindow(){
      super("Género para niños");
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
        this.jtfCodeChildish = new JTextField(10);
        this.add(this.jlbCode);
        this.add(this.jtfCodeChildish);
        
        this.jlbTitle = new JLabel("Nombre de Pelicula: ");
        this.jtfTitleChildish = new JTextField(10);
        this.add(this.jlbTitle);
        this.add(this.jtfTitleChildish);
        
        this.jlbGender = new JLabel("Género de Película: ");
        this.jtfGenderChildish = new JTextField(10);
        this.add(this.jlbGender);
        this.add(this.jtfGenderChildish);
        
        this.jlbTotal = new JLabel("Puntuación: ");
        this.jtfTotalChildish = new JTextField(10);
        this.add(this.jlbTotal);
        this.add(this.jtfTotalChildish);
        
        this.jlbSubtitled = new JLabel("Subtitulos: ");
        this.jtfSubtitledChildish = new JTextField(10);
        this.add(this.jlbSubtitled);
        this.add(this.jtfSubtitledChildish);
        
        this.jlbPremier = new JLabel("Premier: ");
        this.jtfPremierChildish = new JTextField(10);
        this.add(this.jlbPremier);
        this.add(this.jtfPremierChildish);

        //JBUTTON
        this.jbtnAceptarChild = new JButton("Registrar película");
        this.jbtnAceptarChild.addActionListener(this);
        this.add(this.jbtnAceptarChild);
        
    }//fin init

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==this.jbtnAceptarChild){
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