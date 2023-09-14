package Interfaces;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import javax.swing.event.*; 
import java.awt.event.*;
import java.awt.*;

public class Registro extends JFrame implements ActionListener, ChangeListener {
    private JTextField txt1, txt2,txt3,txt4,txt5,txt6;
    private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13;
    private JButton btn1, btn2;
    private JCheckBox check1, check2;
    private JComboBox combo1;
    //private JCalendar calendar;
    private JDateChooser datechooser;
    public static String textC= "";
    public static String textCC= "";
    public static String textc= "";
    public static String textcc= "";
    public static String textm= "";
    public static String textcm= "";
    
    
    
    public Registro(){
        setLayout(null);
        setTitle("Registro");
        getContentPane().setBackground(new Color(255,255,255)); //255,255,255 Blanco RGB
        Image im= Toolkit.getDefaultToolkit().getImage("image/pngegg.png");
        setIconImage(im);
        
        label1= new JLabel();
        label1.setIcon(new ImageIcon("image/darkside_logo_r.png"));
        label1.setBounds(5, 5, 40, 40); //Coordenadas, dimensiones 
        add(label1);
        
        label2= new JLabel();
        label2.setIcon(new ImageIcon("image/fondo_azul_naranja.jpg"));
        label2.setBounds(0, 0, 625, 50); //Coordenadas, dimensiones 
        add(label2);
        
        label3= new JLabel("DARKSIDE");
        label3.setBounds(50, 5, 300, 30); //Coordenadas, dimensiones
        label3.setFont(new Font("Lucida Bright", 1, 10)); //Tipografía, negrita, pixel
        label3.setForeground(new Color(0,0,0)); //Color negro
        add(label3);
        
        label4= new JLabel("Correo"); //Correo Label
        label4.setBounds(45, 45, 200, 30); //25 despues del label 
        label4.setFont(new Font("Arial", 0, 12));
        label4.setForeground(new Color(0,0,0));
        add(label4);
        
        label5= new JLabel("Confirmar Correo"); //Confirmar correo label
        label5.setBounds(45, 90, 200, 30); //20 después del txt
        label5.setFont(new Font("Arial", 0, 12));
        label5.setForeground(new Color(0,0,0));
        add(label5);
        
        label6= new JLabel("Contraseña"); //Contraseña label
        label6.setBounds(45, 135, 200, 30); 
        label6.setFont(new Font("Arial", 0, 12));
        label6.setForeground(new Color(0,0,0));
        add(label6);
        
        label6= new JLabel("Confirmar Contraseña"); //Confirmar Contraseña label
        label6.setBounds(45, 180, 200, 30);  
        label6.setFont(new Font("Arial", 0, 12));
        label6.setForeground(new Color(0,0,0));
        add(label6);
        
        label7= new JLabel("Matrícula"); //Matricula label
        label7.setBounds(45, 225, 200, 30); 
        label7.setFont(new Font("Arial", 0, 12));
        label7.setForeground(new Color(0,0,0));
        add(label7);
        
        label8= new JLabel("Confirmar Matrícula"); //Confirmar matricula
        label8.setBounds(45, 270, 225, 30); 
        label8.setFont(new Font("Arial", 0, 12));
        label8.setForeground(new Color(0,0,0));
        add(label8);
        
        label9= new JLabel("Carrera"); //Confirmar matricula
        label9.setBounds(45, 315, 225, 30); 
        label9.setFont(new Font("Arial", 0, 12));
        label9.setForeground(new Color(0,0,0));
        add(label9);
        
        label10= new JLabel("Fecha de nacimiento"); //Confirmar matricula
        label10.setBounds(45, 360, 225, 30); 
        label10.setFont(new Font("Arial", 0, 12));
        label10.setForeground(new Color(0,0,0));
        add(label10);
        
        label11= new JLabel("Sexo"); //Confirmar matricula
        label11.setBounds(45, 405, 225, 30); 
        label11.setFont(new Font("Arial", 0, 12));
        label11.setForeground(new Color(0,0,0));
        add(label11);
        
        label12= new JLabel();
        label12.setIcon(new ImageIcon("image/fondo_azul.jpg"));
        label12.setBounds(0, 495, 625, 80); //Coordenadas, dimensiones 
        add(label12);
        
        txt1= new JTextField("@edu.utc.mx"); //Correo txt
        txt1.setBounds(45, 70, 270, 25);
        txt1.setBackground(new Color(224,224,224));
        txt1.setFont(new Font("Arial", 0, 11));
        txt1.setForeground(new Color(0,0,0));
        add(txt1);
        
        txt2= new JTextField("@edu.utc.mx"); //Confirmar correo txt
        txt2.setBounds(45, 115, 270, 25);
        txt2.setBackground(new Color(224,224,224));
        txt2.setFont(new Font("Arial", 0, 11));
        txt2.setForeground(new Color(0,0,0));
        add(txt2);
        
        txt3= new JTextField(); //Contraseña txt
        txt3.setBounds(45, 160, 270, 25);
        txt3.setBackground(new Color(224,224,224));
        txt3.setFont(new Font("Arial", 0, 11));
        txt3.setForeground(new Color(0,0,0));
        add(txt3);
        
        txt4= new JTextField(); //Confirmar contraseña txt
        txt4.setBounds(45, 205, 270, 25);
        txt4.setBackground(new Color(224,224,224));
        txt4.setFont(new Font("Arial", 0, 11));
        txt4.setForeground(new Color(0,0,0));
        add(txt4);
        
        txt5= new JTextField(); //Matricula txt
        txt5.setBounds(45, 250, 270, 25);
        txt5.setBackground(new Color(224,224,224));
        txt5.setFont(new Font("Arial", 0, 11));
        txt5.setForeground(new Color(0,0,0));
        add(txt5);
        
        txt6= new JTextField(); //Confirmar matricula 
        txt6.setBounds(45, 295, 270, 25);
        txt6.setBackground(new Color(224,224,224));
        txt6.setFont(new Font("Arial", 0, 11));
        txt6.setForeground(new Color(0,0,0));
        add(txt6);
        
        combo1= new JComboBox();
        combo1.setBounds(45, 340, 258, 25);
        combo1.setBackground(new java.awt.Color(224,224,224));
        combo1.setFont(new java.awt.Font("Arial", 1, 12));
        combo1.setForeground(new java.awt.Color(0,0,0));
        add(combo1);
        combo1.addItem("");
        combo1.addItem("Ingenieria en Sistemas Computacionales");
        //JCalendar
        //calendar= new JCalendar();
        //calendar.setBounds(45, 385, 258, 130);
        //calendar.setWeekOfYearVisible(false);
        //add(calendar);   
        
        datechooser= new JDateChooser();
        datechooser.setBounds(45, 385, 165, 25);
        add(datechooser);
        
        check1= new JCheckBox("Femenino");
        check1.setBounds(45, 425, 80, 25);
        check1.addChangeListener(this);
        add(check1);
        
        check2= new JCheckBox("Masculino");
        check2.setBounds(140, 425, 85, 25);
        check2.addChangeListener(this);
        add(check2); 
        
        btn1= new JButton("Cancelar"); //Cancelar
        btn1.setBounds(110, 515, 90, 27);
        btn1.setBackground(new Color(224,224,224)); //255,0,0 Rojo RGB//224,224,224 --> gris
        btn1.setFont(new Font("Arial", 1, 12));
        btn1.setForeground(new Color(0,0,0));
        btn1.addActionListener(this);
        btn1.setEnabled(true);
        add(btn1);
        
        btn2= new JButton("Registrar"); //Registrar
        btn2.setBounds(230, 515, 90, 27);
        btn2.setBackground(new Color(224,224,224)); //Verde RGB 50,205,50
        btn2.setFont(new Font("Arial", 1, 12));
        btn2.setForeground(new Color(0,0,0));
        btn2.addActionListener(this);
        btn2.setEnabled(false);
        add(btn2);
        
    }
    
    public void stateChanged(ChangeEvent e){
        if(check1.isSelected() == true){
            btn2.setEnabled(true);
            btn1.setEnabled(false);
        }
        else if(check2.isSelected() == true){
            btn2.setEnabled(true);
            btn1.setEnabled(false);
        }
        else{
            btn2.setEnabled(false);
            btn1.setEnabled(true);   
        }
       
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btn1) { //Cancelar regresa a pantalla inicio
        Usuario ventanaU= new Usuario();
        ventanaU.setBounds(0, 0, 400, 550);
        ventanaU.setVisible(true);
        ventanaU.setResizable(false);
        ventanaU.setLocationRelativeTo(null);
        this.setVisible(false);
        }
        if(e.getSource()== btn2) { //registrar y mandar mensaje
            textC= txt1.getText().trim();
            textCC= txt2.getText().trim();
            textc= txt3.getText().trim();
            textcc= txt4.getText().trim();
            textm= txt5.getText().trim();
            textcm= txt6.getText().trim();
            String Ccarrera = combo1.getSelectedItem().toString(); 
            if(textC.equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar todos los datos"); 
            }
            else if(textCC.equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar todos los datos"); 
            }
            else if(textc.equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar todos los datos"); 
            }
            else if(textcc.equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar todos los datos"); 
            }
            else if(textm.equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar todos los datos"); 
            }
            else if(textcm.equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar todos los datos"); 
            }
            else if(Ccarrera.equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar todos los datos");
            }
            else {
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            Cursos ventanaC= new Cursos();
            ventanaC.setBounds(0, 0, 400, 600);
            ventanaC.setVisible(true);
            ventanaC.setResizable(false);
            ventanaC.setLocationRelativeTo(null);
            this.setVisible(false);
            }
        } 
    }
    
    
    public static void main(String[] args){
        
        Registro ventanaR= new Registro();
        ventanaR.setBounds(0, 0, 400, 600);
        ventanaR.setVisible(true);
        ventanaR.setResizable(false);
        ventanaR.setLocationRelativeTo(null);
    }
    
}
    
