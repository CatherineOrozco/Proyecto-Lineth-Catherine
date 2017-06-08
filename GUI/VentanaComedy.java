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
public class VentanaComedy extends JInternalFrame implements ActionListener{
    private JButton jbtnAceptarComedy;
    private JLabel jlbCode;
    private JLabel jlbTitle;
    private JLabel jlbGender;
    private JLabel jlbTotal;
    private JLabel jlbSubtitled;
    private JLabel jlbPremier;
    private JTextField jtfCodeComedy;
    private JTextField jtfTitleComedy;
    private JTextField jtfGenderComedy;
    private JTextField jtfTotalComedy;
    private JTextField jtfSubtitledComedy;
     private JTextField jtfPremierComedy;
    
    VentanaComedy(){
      super("Género de Comedia");
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
        this.jtfCodeComedy = new JTextField(10);
        this.add(this.jlbCode);
        this.add(this.jtfCodeComedy);
        
        this.jlbTitle = new JLabel("Nombre de Pelicula: ");
        this.jtfTitleComedy = new JTextField(10);
        this.add(this.jlbTitle);
        this.add(this.jtfTitleComedy);
        
        this.jlbGender = new JLabel("Género de Película: ");
        this.jtfGenderComedy = new JTextField(10);
        this.add(this.jlbGender);
        this.add(this.jtfGenderComedy);
        
        this.jlbTotal = new JLabel("Puntuación: ");
        this.jtfTotalComedy = new JTextField(10);
        this.add(this.jlbTotal);
        this.add(this.jtfTotalComedy);
        
        this.jlbSubtitled = new JLabel("Subtitulos: ");
        this.jtfSubtitledComedy = new JTextField(10);
        this.add(this.jlbSubtitled);
        this.add(this.jtfSubtitledComedy);
        
        this.jlbPremier = new JLabel("Premier: ");
        this.jtfPremierComedy = new JTextField(10);
        this.add(this.jlbPremier);
        this.add(this.jtfPremierComedy);

        //JBUTTON
        this.jbtnAceptarComedy = new JButton("Registrar película");
        this.jbtnAceptarComedy.addActionListener(this);
        this.add(this.jbtnAceptarComedy);
        
    }//fin init

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==this.jbtnAceptarComedy){
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
