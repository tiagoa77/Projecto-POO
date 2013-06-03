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
             System.out.println("-- 3 -> Sair!                                                       (3) --");
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
                 Set<String> nomesUtilizadores = new TreeSet<String>();
                 for(Utilizador uti : todosUtilizadores){
                    nomesUtilizadores.add(uti.getNome());
                 }
                 if(nomesUtilizadores.contains(nome)){
                    int op = -1;
                    System.out.println("------------------------------Wellcome "+ nome +" ----------------------------");
                    System.out.println("-- 1 -> novo jogo?                                                      (1) --");
                    System.out.println("-- 2 -> continuar?                                                      (2) --");
                    op=sc.nextInt();
                    if(op==1){
                    Menu.MenuUtilizador(nome);
                    }
                    if(op==2){
                    //carregar dados
                    Menu.MenuUtilizador(nome);
                    }
                 }else{
                       System.out.println("Utilizador nao existe!");
                    }
                }
             if(opcao==3){opcao=0;}
            
            }
        }
    
    
   private static void MenuUtilizador(String nome){
       Scanner sc = new Scanner(System.in).useDelimiter("\n");
       int opcao=-1;
         
       while (opcao!=0){
           System.out.println("--------------------------]Welcome "+ nome +"[----------------------------");
           System.out.println("-- 1 -> Apostar                                                     (1) --");
           System.out.println("-- 2 -> Apostas em vigor                                            (2) --");
           System.out.println("-- 3 -> Historico de apostas                                        (3) --");
           System.out.println("-- 4 -> Classificaçao de utilizadores                               (4) --");
           System.out.println("-- 5 -> Classificação da corrida                                    (5) --");
           System.out.println("-- 6 -> Classificação do Campeonato                                 (6) --");
           System.out.println("-- 7 -> Simular corrida                                             (7) --");
           System.out.println("-- 8 -> Editar                                                      (8) --");
           System.out.println("-- 9 -> Sair                                                        (9) --");
           System.out.println("--------------------------------------------------------------------------");
        
           opcao = sc.nextInt();
           if(opcao==1){}
           if(opcao==2){}
           if(opcao==3){}
           if(opcao==4){}
           if(opcao==5){}
           if(opcao==6){}
           if(opcao==7){}
           if(opcao==8){}
           if(opcao==9){opcao=0;}
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
       List<Piloto> p = new ArrayList<Piloto>();
       for(String pil : linhas){
           aux = pil.split(";");
           nPil = new Piloto();
           nPil.setNome(aux[0]);
           nPil.setNac(aux[1]);
           nPil.setPalmar(Integer.parseInt(aux[2]));
           nPil.setQualidade(Integer.parseInt(aux[3]));
           nPil.setCapWet(Integer.parseInt(aux[4]));
           p.add(nPil);
        }
       return p;
    } 
    
    
    
   //public static List<Carro> carregaCarros(){}
   
   //public static List<Circuito> carregaCircuito(){}
    
   //ObjectStream
   public static void gravaObj(List<Piloto> p) {
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("RancingMan.dat"));
            out.writeObject(p);
            out.flush(); 
            out.close();
        }
        catch(IOException e) { System.out.println(e.getMessage()); }
    }

   public void carregaObj() {
        try {
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream("RancingMan.dat"));
            Menu res = (Menu) oin.readObject();
            oin.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
   public static void main() {  

      List<Piloto> p = Menu.carregaPilotos("pilotos.txt");
      Menu.gravaObj(p);
      Menu.Opcoes();
      
      
       
   }
}
