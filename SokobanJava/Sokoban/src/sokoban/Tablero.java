/* Esta clase le da el tamaño a la ventana y agrega las texturas sobre el tablero */


package sokoban;

import java.awt.GridLayout;
import java.awt.Image;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tablero extends JFrame{
    
    public Tablero(String path) throws IOException{
        super("Sokoban en Java by Alejandro Farias");
//        LeerArchivo a = new LeerArchivo("c://xampp/mapa.txt");
        LeerArchivo a = new LeerArchivo(path);
        int ancho = a.contarCaracteres();
        int alto = a.contarLineas()-1;
        System.out.println("Alto" + alto);
        System.out.println("Ancho" + ancho);
        
        JLabel bMatriz[][] = new JLabel[alto][ancho];
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(alto, ancho));
        this.add(panel);
        this.setBounds(140, 15, 800, 800);

        
        int i = 0;
        for (int f = 0; f < alto; f++){
            for (int c = 0; c < ancho; c++){
                if(a.arrayTexto.get(i).equals("35")){ // # en ascii
                    bMatriz[f][c] = new JLabel();
                    bMatriz[f][c].setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("img/ladrillosborde.PNG")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
                    bMatriz[f][c].setBounds(20, 10, 360, 360);
                    panel.add(bMatriz[f][c]);
                    panel.setVisible(true);
                    //imprime ladrillos
                    
                }
                if (a.arrayTexto.get(i).equals("48")){
                    bMatriz[f][c] = new JLabel();
                    bMatriz[f][c].setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("img/rueda.PNG")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
                    bMatriz[f][c].setBounds(20, 10, 360, 360);
                    panel.add(bMatriz[f][c]);
                    panel.setVisible(true);
                    // imprime caja rueda
                   
                }
                if (a.arrayTexto.get(i).equals("89")){ // Y en ascii
                    bMatriz[f][c] = new JLabel();
                    bMatriz[f][c].setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("img/ladrillosborde.PNG")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
                    bMatriz[f][c].setBounds(20, 10, 360, 360);
                    panel.add(bMatriz[f][c]);
                    panel.setVisible(true);
                    // imprime personaje
                    
                }
                if (a.arrayTexto.get(i).equals("64")){ //@ en ascii
                    bMatriz[f][c] = new JLabel();
                    //bMatriz[f][c].setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("img/portal.PNG")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
                    bMatriz[f][c].setBounds(20, 10, 360, 360);
                    panel.add(bMatriz[f][c]);
                    panel.setVisible(true);
                    //imprime objetivo a llevar
                    
                }
                
                System.out.println(i);
              i++;  
            }
            
        }
        /*
        for (int f = 0; f < alto; f++) {
            for (int c = 0; c < ancho; c++) {
                if (f == 0 || c == ancho-1 || f == alto-1 || c == 0){
                    bMatriz[f][c] = new JLabel();
                    bMatriz[f][c].setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("img/ladrillosborde.PNG")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
                    bMatriz[f][c].setBounds(20, 10, 360, 360);

                    this.setBounds(140, 15, 800, 800);
                    panel.setBounds(140, 15, 270, 300);
                    panel.add(bMatriz[f][c]);
                    panel.setVisible(true);
                }
                else{
                    bMatriz[f][c] = new JLabel();
                    //bMatriz[f][c].setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("img/ladrillosborde.PNG")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
                    bMatriz[f][c].setBounds(20, 10, 360, 360);

                    this.setBounds(140, 15, 270, 300);
                    panel.setBounds(140, 15, 270, 300);
                    panel.add(bMatriz[f][c]);
                    panel.setVisible(true);
                }
                
            }
        }
        */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //pruebalabel.setLocation(0,0);
    }
    
    public void hacerMatriz(){
        // Esta funcion es para hacer matriz
        
    }
    
    
} 
