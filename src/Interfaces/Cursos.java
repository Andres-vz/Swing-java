package Interfaces;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Cursos extends JFrame implements ActionListener{
    private JMenuBar mb;
    private JMenu mConfi, mPerfil, mFondo, mAcerca, mBuscar;
    private JMenuItem miblanco, minaranja, miazul, miequipo, misalir, miprogra, mipoo, miandroid, mialgebra, miper;
    private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10;
    private JScrollPane scrollpane;
    private JButton btn1,btn2,btn3, btn4;
    
    public Cursos() {
        setLayout(null);
        setTitle("Cursos");
        getContentPane().setBackground(new Color(255,255,255)); //255,255,255 Blanco RGB
        Image im= Toolkit.getDefaultToolkit().getImage("image/pngegg.png");
        setIconImage(im);
        
        mb= new JMenuBar();
        mb.setBackground(new Color(255,128,0)); //Naranja RGB
        setJMenuBar(mb);
        
        mConfi= new JMenu(); //Menus
        mConfi.setIcon(new ImageIcon("image/confi.png"));
        mb.add(mConfi);
        
        mBuscar= new JMenu(); 
        mBuscar.setIcon(new ImageIcon("image/buscar.png"));
        mb.add(mBuscar);
        
        mAcerca= new JMenu("Acerca de");
        mAcerca.setBackground(new Color(255,128,0));
        mAcerca.setFont(new Font("Arial",1,11));
        mAcerca.setForeground(new Color(0,0,0));
        mb.add(mAcerca);
        
        mPerfil= new JMenu(); 
        mPerfil.setIcon(new ImageIcon("image/perfil.png"));
        mConfi.add(mPerfil);
        
        mFondo= new JMenu("Fondo:"); 
        mFondo.setBackground(new Color(255,128,0));
        mFondo.setFont(new Font("Arial",1,12));
        mFondo.setForeground(new Color(0,0,0));
        mConfi.add(mFondo);
        
        miblanco= new JMenuItem(); //submenus Menu fondo
        miblanco.setIcon(new ImageIcon("image/blanco.png"));
        mFondo.add(miblanco);
        miblanco.addActionListener(this);
        
        minaranja= new JMenuItem(); //submenus Menu Fondo
        minaranja.setIcon(new ImageIcon("image/naranja.png"));
        mFondo.add(minaranja);
        minaranja.addActionListener(this);
        
        miazul= new JMenuItem(); //submenus Menu Fondo
        miazul.setIcon(new ImageIcon("image/azul.png"));
        mFondo.add(miazul);
        miazul.addActionListener(this);
        
        miequipo= new JMenuItem("Equipo DARKSIDE");
        miequipo.setFont(new Font("Arial",1,12));
        miequipo.setForeground(new Color(0,0,0));
        mAcerca.add(miequipo);
        miequipo.addActionListener(this);
        
        miper= new JMenuItem("Perfil");
        miper.setFont(new Font("Arial",1,12));
        miper.setForeground(new Color(0,0,0));
        mPerfil.add(miper);
        miper.addActionListener(this);
        
        misalir= new JMenuItem("Cerrar sesion");
        misalir.setFont(new Font("Arial",1,12));
        misalir.setForeground(new Color(0,0,0));
        mPerfil.add(misalir);
        misalir.addActionListener(this);
        
        miprogra= new JMenuItem("Programación I");
        miprogra.setFont(new Font("Arial",1,12));
        miprogra.setForeground(new Color(0,0,0));
        mBuscar.add(miprogra);
        miprogra.addActionListener(this);
        
        mipoo= new JMenuItem("Programación Orientada a Objetos");
        mipoo.setFont(new Font("Arial",1,12));
        mipoo.setForeground(new Color(0,0,0));
        mBuscar.add(mipoo);
        mipoo.addActionListener(this);
        
        miandroid= new JMenuItem("Android Studio");
        miandroid.setFont(new Font("Arial",1,12));
        miandroid.setForeground(new Color(0,0,0));
        mBuscar.add(miandroid);
        miandroid.addActionListener(this);
        
        mialgebra= new JMenuItem("Álgebra I");
        mialgebra.setFont(new Font("Arial",1,12));
        mialgebra.setForeground(new Color(0,0,0));
        mBuscar.add(mialgebra);
        mialgebra.addActionListener(this);
        
        label1= new JLabel();
        label1.setIcon(new ImageIcon("image/curso.png"));
        label1.setBounds(100,5, 40, 40); //Coordenadas, dimensiones 
        add(label1);
        
        label2= new JLabel("MIS CURSOS");
        label2.setBounds(150, 9, 300, 30); //Coordenadas, dimensiones
        label2.setFont(new Font("Lucida Bright", 1, 15)); //Tipografía, negrita, pixel
        label2.setForeground(new Color(0,0,0)); //Color negro
        add(label2);
        
        label3= new JLabel("A continuación se muestran los diferentes cursos para tu desarrollo profesional");
        label3.setBounds(30, 45, 360 , 30); //Coordenadas, dimensiones
        label3.setFont(new Font("Arial", 0, 9)); //Tipografía, negrita, pixel
        label3.setForeground(new Color(0,0,0)); //Color negro
        add(label3);
        
        btn1= new JButton();
        btn1.setIcon(new ImageIcon("image/java.png"));
        btn1.setBounds(40, 100, 115, 115);
        btn1.addActionListener(this);
        add(btn1);
        
        label4= new JLabel("Programación I");
        label4.setBounds(55, 220, 300, 30); //Coordenadas, dimensiones
        label4.setFont(new Font("Arial", 1, 12)); //Tipografía, negrita, pixel
        label4.setForeground(new Color(0,0,0)); //Color negro
        add(label4);
        
        btn2= new JButton();
        btn2.setIcon(new ImageIcon("image/java.png"));
        btn2.setBounds(225, 100, 115, 115);
        btn2.addActionListener(this);
        add(btn2);
        
        label5= new JLabel("Programación Orientada a Objetos");
        label5.setBounds(175, 220, 300, 30); //Coordenadas, dimensiones
        label5.setFont(new Font("Arial", 1, 12)); //Tipografía, negrita, pixel
        label5.setForeground(new Color(0,0,0)); //Color negro
        add(label5);
        
        btn3= new JButton();
        btn3.setIcon(new ImageIcon("image/android.png"));
        btn3.setBounds(35, 310, 115, 115);
        btn3.addActionListener(this);
        add(btn3);
        
        label6= new JLabel("Android Studio");
        label6.setBounds(55, 430, 300, 30); //Coordenadas, dimensiones
        label6.setFont(new Font("Arial", 1, 12)); //Tipografía, negrita, pixel
        label6.setForeground(new Color(0,0,0)); //Color negro
        add(label6);
        
        btn4= new JButton();
        btn4.setIcon(new ImageIcon("image/algebra.png"));
        btn4.setBounds(225, 310, 115, 115);
        btn4.addActionListener(this);
        add(btn4);
        
        label7= new JLabel("Álgebra I");
        label7.setBounds(255, 430, 300, 30); //Coordenadas, dimensiones
        label7.setFont(new Font("Arial", 1, 12)); //Tipografía, negrita, pixel
        label7.setForeground(new Color(0,0,0)); //Color negro
        add(label7);
        
        scrollpane= new JScrollPane();
        scrollpane.setBounds(377, 0, 18, 537);
        add(scrollpane);
        
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == miblanco){
            getContentPane().setBackground(new Color(255,255,255)); //Blanco RGB
            
        }
        if(e.getSource() == minaranja){
            getContentPane().setBackground(new Color(255,128,0));
        }
        if(e.getSource() == miazul){
            getContentPane().setBackground(new Color(59,131,189));
        }
        if(e.getSource() == miequipo){
            JOptionPane.showMessageDialog(null,"UNIVERSIDAD TRES CULTURAS\n\n" +
                                               "           PLANTEL CHALCO\n\n" +
                                               "           Grupo:  6HLIINSCMA\n\n" +
                                               "Programación Orientada a Objetos II\n\n" +
                                               "   Actividad: Proyecto Swing\n\n   " +
                                               "              DOCENTE: \n\n" +
                                               "Martínez Garnelo José Diego\n\n" +
                                               "               Integrantes:\n\n" +
                                               "Balandrán Vázquez Jesús Andrés\n" +
                                               "Carpio Castillo Jazmín Micaela\n" +
                                               "Cruz Reyes Cesar Sael\n" +
                                               "Palma Escalona Israel\n" +
                                               "Soriano Morales Kevin Josué\n" +
                                               "Velázquez Méndez Zaida ");
        }
        if(e.getSource() == misalir){
        Usuario ventanaU= new Usuario();
        ventanaU.setBounds(0, 0, 400, 550);
        ventanaU.setVisible(true);
        ventanaU.setResizable(false);
        ventanaU.setLocationRelativeTo(null);
        this.setVisible(false);
            
        }
        if(e.getSource() == miprogra) {
            JOptionPane.showMessageDialog(null, "Aquí va el curso de Programación I");
        }
        if(e.getSource() == mipoo){
            JOptionPane.showMessageDialog(null, "Aquí va el curso de Programación Orientada a Objetos");
        }
        if(e.getSource() == miandroid){
            JOptionPane.showMessageDialog(null, "Aquí va el curso de Android Studio");
        }
        if(e.getSource() == mialgebra) {
            JOptionPane.showMessageDialog(null, "Aquí va el curso de Álgebra I");
        }
        if(e.getSource() == miper){
        Perfil ventanaP= new Perfil();
        ventanaP.setBounds(0, 0, 400, 600);
        ventanaP.setVisible(true);
        ventanaP.setResizable(false);
        ventanaP.setLocationRelativeTo(null);
        this.setVisible(false);
            
        }
        if(e.getSource() == btn1) {
            JOptionPane.showMessageDialog(null, "Aquí va el curso de Programación I");
        }
        if(e.getSource() == btn2) {
            JOptionPane.showMessageDialog(null, "Aquí va el curso de Programación Orientada a Objetos");
        }
        if(e.getSource() == btn3) {
            JOptionPane.showMessageDialog(null, "Aquí va el curso de Android Studio");
        }
        if(e.getSource() == btn4) {
            JOptionPane.showMessageDialog(null, "Aquí va el curso de Álgebra I");
        }
        
    }
    
    
    public static void main(String[] args){
        
        Cursos ventanaC= new Cursos();
        ventanaC.setBounds(0, 0, 400, 600);
        ventanaC.setVisible(true);
        ventanaC.setResizable(false);
        ventanaC.setLocationRelativeTo(null);
    }
    
    
}
