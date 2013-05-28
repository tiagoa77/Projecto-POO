import java.util.*;
import java.io.Serializable;
/**
 * Write a description of class Corrida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Corrida implements Serializable
{
   private Circuito pista;
   private Map<Carro,Integer> classificacao;
   
   public Corrida(){
    //this.participantes = new ArrayList<Carro>();
    this.pista = new Circuito();
    this.classificacao = new HashMap<Carro,Integer>();
    
    }
    
   public Corrida( List<Carro> participantes,Circuito pista,Map<Carro,Integer> classificacao){
    //this.participantes=participantes;
    this.pista=pista;
    this.classificacao = classificacao;
    
    }
   
    public Corrida(Corrida corr){
    //this.participantes = corr.getParticipantes();
    this.pista = corr.getPista();
    this.classificacao = corr.getClassi();
    
    }
   
   // public List<Carro> getParticipantes(){return this.participantes;}
    public Circuito getPista(){return this.pista;}
    public Map<Carro,Integer> getClassi() {return this.classificacao;}
   
    
    public boolean equals(Object o){
        if(o==null) return false;
        if(o!=this) return false;
        if(o.getClass()!=this.getClass()) return false;
        Corrida co = (Corrida) o;
        if (this.pista.equals(co.getPista()) && this.classificacao.equals(co.getClassi())) return true;
        return true;
    }
    
    public void novaCorrida(){
        
    }
}
