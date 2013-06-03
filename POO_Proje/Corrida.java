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
   private Map<Carro,Float> classificacao;
   
   public Corrida(){
    //this.participantes = new ArrayList<Carro>();
    this.pista = new Circuito();
    this.classificacao = new HashMap<Carro,Float>();
    
    }
    
   public Corrida( List<Carro> participantes,Circuito pista,Map<Carro,Float> classificacao){
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
    public Map<Carro,Float> getClassi() {return this.classificacao;}
   
    
    
    
    
    public boolean equals(Object o){
        if(o==null) return false;
        if(o!=this) return false;
        if(o.getClass()!=this.getClass()) return false;
        Corrida co = (Corrida) o;
        if (this.pista.equals(co.getPista()) && this.classificacao.equals(co.getClassi())) return true;
        return true;
    }
    
    public void iniciarCorrida(Circuito pista,List<Carro> participantes){
     int numVoltas = pista.getNumVol();
     int i = 1;
    
     while (i<numVoltas){
         for(Carro car : participantes){
            //float tempo = car.tempoVolta();
           // atualizaTempos(car,tempo);
            }
            
            System.out.print("");
         
         i++;}
    }
    
    public void atualizaTempos(Carro car, float tempo){
        float time;
        if(classificacao.containsKey(car)){
            time = this.classificacao.get(car);
            time += tempo;
            this.classificacao.put(car,time);
        }else this.classificacao.put(car,tempo);
    }
    
    public Carro melhorTempo(){
        
        List<Float> tempos = this.classificacao.values();
        float timeMax = tempos[0]; 
        for(int i = 1 ; i <tempos.size() ; i++){
            if (timeMax < tempos[i]){
                timeMax=tempos[i];
            }
        
        }
        
        
    }
}
