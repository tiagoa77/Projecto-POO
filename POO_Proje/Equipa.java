import java.io.Serializable;
import java.lang.*;
/**
 * Write a description of class Equipa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Equipa implements Serializable
{
   private Piloto piloto1;
   private Piloto piloto2;
   private String nome;
   
   public Equipa(){
       this.piloto1=new Piloto();
       this.piloto2=new Piloto();
       this.nome="";
   }
   
   public Equipa(Piloto pil1, Piloto pil2, String nome_eq){
       this.piloto1=pil1.clone();
       this.piloto2=pil2.clone();
       this.nome=nome_eq;
   }
   
   public Equipa(Equipa equipa){
       this.piloto1=equipa.getPil1();
       this.piloto2=equipa.getPil2();
       this.nome=equipa.getNome();
   }
   
   public Piloto getPil1(){return this.piloto1;}
   public Piloto getPil2(){return this.piloto2;}
   public String getNome(){return this.nome;}
   
   public String toString(){
       StringBuilder s = new StringBuilder();
       s.append("Nome de Equipa: " + this.nome + "\n");
       s.append("Pilotos: \n");
       s.append(this.piloto1.toString());
       s.append(this.piloto2.toString());
       return s.toString();
       }
}
