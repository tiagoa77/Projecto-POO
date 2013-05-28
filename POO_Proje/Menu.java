import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.Set;
import java.util.TreeSet;
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
public class Menu implements Serializable
{
   private static void Opcoes(){
         Scanner sc = new Scanner(System.in).useDelimiter("\n");
         int opcao=-1;
         List<Utilizador> todosUtilizadores =new ArrayList<Utilizador>();
         while (opcao!=0){
             System.out.println("-----------------------------]Menu[---------------------------------------");
             System.out.println("-- 1 -> Registar!                                                   (1) --");
             System.out.println("-- 2 -> Login!                                                      (2) --");
             System.out.println("-- 3 -> Sair!                                                        (3) --");
             System.out.println("--------------------------------------------------------------------------");
        
             opcao = sc.nextInt();
             
             if(opcao==1){
                 String nome,morada;
                 Utilizador novo = new Utilizador();
                 System.out.println("Insira o seu nome!");
                 nome = sc.next();
                 System.out.println("Insira o sua morada!");
                 morada = sc.next();
                 novo.novoUtilizador(nome, morada);
                 todosUtilizadores.add(novo);
                }
             if(opcao==2){
                 String nome;
                 System.out.println("Insira o seu nome!");
                 nome = sc.next();
                 //for()
                 Menu.MenuUtilizador(nome);
                }
             if(opcao==3){opcao=0;}
            
         }
        }
   
   private static void MenuUtilizador(String nome){
       Scanner sc = new Scanner(System.in).useDelimiter("\n");
       int opcao=-1;
         
       while (opcao!=0){
           System.out.println("--------------------------]Welcome "+ nome +"[------------------------------");
           System.out.println("-- 1 -> Apostar                                                     (1) --");
           System.out.println("-- 2 -> Apostas em vigor                                            (2) --");
           System.out.println("-- 3 -> Historico de apostas                                        (3) --");
           System.out.println("-- 4 -> Classificaçao de utilizadores                               (4) --");
           System.out.println("-- 5 -> Classificação da corrida                                    (5) --");
           System.out.println("-- 6 -> Classificação do Campeonato                                 (6) --");
           System.out.println("-- 7 -> Simular corrida                                             (7) --");
           System.out.println("-- 8 -> Sair                                                        (8) --");
           System.out.println("--------------------------------------------------------------------------");
        
           opcao = sc.nextInt();
           if(opcao==1){}
           if(opcao==2){}
           if(opcao==3){}
           if(opcao==4){}
           if(opcao==5){}
           if(opcao==6){}
           if(opcao==7){}
           if(opcao==8){opcao=0;}
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
   
   public static List<Piloto> carregaPilotos(String fichName){
       String[] aux;
       Piloto nPil;
       List <String> linhas = Menu.leLinhasScanner(fichName);
       List<Piloto> pilotos= new ArrayList<Piloto>();
       for(String pil : linhas){
           aux = pil.split(";");
           nPil = new Piloto();
           nPil.setNome(aux[0]);
           nPil.setNac(aux[1]);
           nPil.setPalmar(Integer.parseInt(aux[2]));
           nPil.setQualidade(Integer.parseInt(aux[3]));
           nPil.setCapWet(Integer.parseInt(aux[4]));
           pilotos.add(nPil);
        }
       return pilotos;
    } 
    
    
    
   /*public static List<Carro> carregaCarros(){
    
    
    
    }
   
   public static List<Circuito> carregaCircuito(){
    }*/
    
    
   public static List<Piloto> main() {  
      List<Piloto> nda = Menu.carregaPilotos("pilotos.txt");
      Menu.Opcoes();
      return nda;
      
       
   }
}
