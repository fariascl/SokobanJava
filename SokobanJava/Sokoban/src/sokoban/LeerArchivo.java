package sokoban;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class LeerArchivo {
    
    String texto;
    BufferedReader arch;
    String f;
    ArrayList<String> arrayTexto = new ArrayList<>();
    public LeerArchivo(String archivo) throws FileNotFoundException, IOException{        
        f = archivo;
        int caract;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        //System.out.println("El buffer" + b.readA);
        arch = b; // copia del buffer
        texto = b.readLine();
        caract = b.read();
        int i = 0;
        while(caract != -1){
            caract = b.read();
            //System.out.println(caract);
            System.out.println("Lo que hay en el array es: " + caract);
            arrayTexto.add(Integer.toString(caract));
            i++;
        }
        System.out.println("La cantiudad de caracteres que hay en el array es: " + i);
        
       
        
        
    }
    
    public int contarLineas() throws FileNotFoundException, IOException{
        FileReader f = new FileReader(this.f);
        BufferedReader b = new BufferedReader(f);
        String x = b.readLine();
        int contador = 0;
        while(x != null){
            contador = contador + 1;
            x = b.readLine();
        }
        
        return contador;
    }
    
    public int contarCaracteres(){
        return texto.length();
    }
/*
    public static void main(String[] args) throws IOException{
        System.out.println("aasdas");
        LeerArchivo a = new LeerArchivo("c://xampp/mapa.txt");
        System.out.println("La cantidad de lienas del archivo es: " + a.contarLineas());
        System.out.println("La cantidad de letras es: " + a.contarCaracteres());
    }
*/
}
