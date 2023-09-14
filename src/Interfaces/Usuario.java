package Interfaces;
import javax.swing.*; //Componentes para diseño de interfaz
import java.awt.event.*; //Importar eventos awt
import java.awt.*; //Importar componentes de diseño


public class Usuario extends JFrame implements ActionListener { //Evento a botón
    private JTextField txt1,txt2; //Variables TextField
    private JLabel label1, label2, label3, label4, label5; //Variables Label
    private JButton btn1,btn2,btn3; //Variables Button
    public static String textU= "";
    public static String textC= "";
    
    
    
    public Usuario(){ //Constructor
        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,255,255)); //255,255,255 Blanco RGB
        Image im= Toolkit.getDefaultToolkit().getImage("image/pngegg.png");
        setIconImage(im);
        
        label1= new JLabel();
        label1.setIcon(new ImageIcon("image/darkside_logo.png"));
        label1.setBounds(112, 0, 150, 150); //Coordenadas, dimensiones 
        add(label1);
        
        label2= new JLabel("DARKSIDE");
        label2.setBounds(160, 150, 300, 30); //Coordenadas, dimensiones
        label2.setFont(new Font("Lucida Bright", 1, 10)); //Tipografía, negrita, pixel
        label2.setForeground(new Color(0,0,0)); //Color negro
        add(label2);
        
        label3= new JLabel("Correo/Matrícula");
        label3.setBounds(45, 170, 200, 30); 
        label3.setFont(new Font("Arial", 0, 12));
        label3.setForeground(new Color(0,0,0));
        add(label3);
        
        label4= new JLabel("Contraseña");
        label4.setBounds(45, 240, 200, 30);
        label4.setFont(new Font("Arial", 0, 12));
        label4.setForeground(new Color(0,0,0));
        add(label4);
        
        label5= new JLabel("¿Olvidaste tu contraseña?");
        label5.setBounds(112, 400, 300, 30);
        label5.setFont(new Font("Arial", 0, 12));
        label5.setForeground(new Color(0,0,0));
        add(label5);
        
        txt1= new JTextField("@edu.utc.mx");
        txt1.setBounds(45, 200, 270, 25);
        txt1.setBackground(new Color(224,224,224));
        txt1.setFont(new Font("Arial", 0, 11));
        txt1.setForeground(new Color(0,0,0));
        add(txt1);
        
        txt2= new JTextField();
        txt2.setBounds(45, 270, 270, 25);
        txt2.setBackground(new Color(224,224,224));
        txt2.setFont(new Font("Arial", 0, 11));
        txt2.setForeground(new Color(0,0,0));
        add(txt2);
        
        btn1= new JButton("Ingresar"); //Ingresar
        btn1.setBounds(135, 310, 100, 30);
        btn1.setBackground(new Color(255,128,0)); //Naranja RGB
        btn1.setFont(new Font("Arial", 1, 12));
        btn1.setForeground(new Color(0,0,0));
        btn1.addActionListener(this);
        add(btn1);
        
        btn2= new JButton("Registrar"); // btn2 registrar
        btn2.setBounds(135, 350, 100, 30);
        btn2.setBackground(new Color(0,0,255)); //Azul RGB //224,224,224 --> gris
        btn2.setFont(new Font("Arial", 1, 12));
        btn2.setForeground(new Color(0,0,0));
        btn2.addActionListener(this);
        add(btn2);
        
        btn3= new JButton("Recuperar contraseña");
        btn3.setBounds(112, 440, 155, 22);
        btn3.setBackground(new Color(255,255,255));
        btn3.setFont(new Font("Arial", 3, 11));
        btn3.setForeground(new Color(59,131,189));
        btn3.addActionListener(this);
        add(btn3); 
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btn1) { 
            textU= txt1.getText().trim();
            textC= txt2.getText().trim();
            if(textU.equals("")){ //verificar lo que tiene en el txt Usuario
                JOptionPane.showMessageDialog(null, "Debes ingresar tu Correo y/o Contraseña");
            }
            else if(textC.equals("")){ //verificar lo que tiene en el txt Contraseña
                JOptionPane.showMessageDialog(null, "Debes ingresar tu Correo y/o Contraseña");
            } 
            else{
        Cursos ventanaC= new Cursos();
        ventanaC.setBounds(0, 0, 400, 600);
        ventanaC.setVisible(true);
        ventanaC.setResizable(false);
        ventanaC.setLocationRelativeTo(null);
        this.setVisible(false);
                
            } 
        }
        if(e.getSource()== btn2){
        Registro ventanaR= new Registro();
        ventanaR.setBounds(0, 0, 400, 600);
        ventanaR.setVisible(true);
        ventanaR.setResizable(false);
        ventanaR.setLocationRelativeTo(null);
        this.setVisible(false);
        }
       
    }
    
    
    public static void main(String[] args){
        
        Usuario ventanaU= new Usuario();
        ventanaU.setBounds(0, 0, 400, 550);
        ventanaU.setVisible(true);
        ventanaU.setResizable(false);
        ventanaU.setLocationRelativeTo(null);
    }
    
}
