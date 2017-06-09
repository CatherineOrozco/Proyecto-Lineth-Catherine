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
public class RomanceWindow extends JInternalFrame implements ActionListener{
    private JButton jbtnAceptarRomance;
    private JLabel jlbCode;
    private JLabel jlbTitle;
    private JLabel jlbGender;
    private JLabel jlbTotal;
    private JLabel jlbSubtitled;
    private JLabel jlbPremier;
    private JTextField jtfCodeRomance;
    private JTextField jtfTitleRomance;
    private JTextField jtfGenderRomance;
    private JTextField jtfTotalRomance;
    private JTextField jtfSubtitledRomance;
     private JTextField jtfPremierRomance;
    
    RomanceWindow(){
      super("Género Romántico");
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
        this.jtfCodeRomance = new JTextField(10);
        this.add(this.jlbCode);
        this.add(this.jtfCodeRomance);
        
        this.jlbTitle = new JLabel("Nombre de Pelicula: ");
        this.jtfTitleRomance = new JTextField(10);
        this.add(this.jlbTitle);
        this.add(this.jtfTitleRomance);
        
        this.jlbGender = new JLabel("Género de Película: ");
        this.jtfGenderRomance = new JTextField(10);
        this.add(this.jlbGender);
        this.add(this.jtfGenderRomance);
        
        this.jlbTotal = new JLabel("Puntuación: ");
        this.jtfTotalRomance = new JTextField(10);
        this.add(this.jlbTotal);
        this.add(this.jtfTotalRomance);
        
        this.jlbSubtitled = new JLabel("Subtitulos: ");
        this.jtfSubtitledRomance = new JTextField(10);
        this.add(this.jlbSubtitled);
        this.add(this.jtfSubtitledRomance);
        
        this.jlbPremier = new JLabel("Premier: ");
        this.jtfPremierRomance = new JTextField(10);
        this.add(this.jlbPremier);
        this.add(this.jtfPremierRomance);

        //JBUTTON
        this.jbtnAceptarRomance = new JButton("Registrar película");
        this.jbtnAceptarRomance.addActionListener(this);
        this.add(this.jbtnAceptarRomance);
        
    }//fin init

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==this.jbtnAceptarRomance){
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
