import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.Set;
import java.util.List;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu
{
   private static void opcoes(){
         Scanner sc = new Scanner(System.in).useDelimiter("\n");
         int opcao=1;
         
         while (opcao!=0){
             System.out.println("-----------------------------]Querys[-------------------------------------");
             System.out.println("-- 1 -> Registar!                                                   (1) --");
             System.out.println("-- 2 -> Login!                                                      (2) --");
             System.out.println("-- 3 -> Sair!                                                        (3) --");
             System.out.println("--------------------------------------------------------------------------");
        
             opcao = sc.nextInt();
             
             if(opcao==1){}
             if(opcao==2){}
             if(opcao==3){}
            
         }
        }
   
   public static ArrayList<String> leLinhasScanner(String fichName) {

       ArrayList<String> linhas = new ArrayList<String>();
       Scanner fichScan = null; 
       try {
            fichScan = new Scanner(new FileReader(fichName));
            fichScan.useDelimiter(System.getProperty("line.separator"));
            while (fichScan.hasNext()) linhas.add(fichScan.next());
            fichScan.close();
       } 
       catch(IOException e) {out.println(e.getMessage()); return null; }
       catch(Exception e) {out.println(e.getMessage()); return null; }
       
       return linhas;
    }
   
   public static List<Piloto> carregaPilotos(){
    }
    
   public static List<Piloto> carregaCarros(){
    }
   
   public static List<Piloto> carregaCircuito(){
    }
    
    
   public static void main() {  
      
       
   }
}
