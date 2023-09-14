package Interfaces;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Perfil extends JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu mConfi, mPerfil, mFondo, mAcerca, mBuscar;
    private JMenuItem miblanco, minaranja, miazul, miequipo, misalir, miprogra, mipoo, miandroid, mialgebra, miper;
    private JMenuItem micursos;
    private JLabel label1, label2;
    
    public Perfil(){
        setLayout(null);
        setTitle("Perfil");
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
        
        micursos= new JMenuItem("Mis Cursos");
        micursos.setFont(new Font("Arial",1,12));
        micursos.setForeground(new Color(0,0,0));
        mConfi.add(micursos);
        micursos.addActionListener(this);
        
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
        label1.setIcon(new ImageIcon("image/spiderman.png"));
        label1.setBounds(5,5, 180, 180); //Coordenadas, dimensiones 
        add(label1);
        
        label2= new JLabel("Balandrán Vázquez Jesús Aandrés");
        label2.setBounds(190, 90, 200, 30); //Coordenadas, dimensiones
        label2.setFont(new Font("Lucida Bright", 1, 10)); //Tipografía, negrita, pixel
        label2.setForeground(new Color(0,0,0)); //Color negro
        add(label2);
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
        if(e.getSource() == misalir) {
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
        
        }
        if(e.getSource() == micursos){
        Cursos ventanaC= new Cursos();
        ventanaC.setBounds(0, 0, 400, 600);
        ventanaC.setVisible(true);
        ventanaC.setResizable(false);
        ventanaC.setLocationRelativeTo(null);
        this.setVisible(false);
        }
        
        
    }
    
     public static void main(String[] args){
        
        Perfil ventanaP= new Perfil();
        ventanaP.setBounds(0, 0, 400, 600);
        ventanaP.setVisible(true);
        ventanaP.setResizable(false);
        ventanaP.setLocationRelativeTo(null);
    }
    
}
