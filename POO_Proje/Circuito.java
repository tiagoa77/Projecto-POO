    import java.util.*;
import java.lang.*;
import java.io.Serializable;
//import java.lang.Math;
/**
 * Write a description of class Circuito here.
 * 
 * @author (Grupo X) 
 * @version (a version number or a date)
 */
public class Circuito implements Serializable
{
    // instance variables - replace the example below with your own
    private int dist;
    private int numeroVoltas;
    private String nome;
    private Map<String, Float> tempo_med;
    private float desv_tempo_med;
    private float troca_pil;
    private float tempo_rec;
    private Carro carro_rec;
    private Piloto piloto_rec;
    
    
    /**
     * Constructor for objects of class Circuito
     */
    public Circuito()
    {
        // initialise instance variables
        this.dist= 0;
        this.numeroVoltas = 0;
        this.nome="";
        this.tempo_med=new HashMap<String,Float>();
        this.desv_tempo_med=0.00f;
        this.troca_pil=0.00f;
        this.tempo_rec=0.00f;
        this.carro_rec=null;
        this.piloto_rec=new Piloto();
        
    }
    
    public Circuito(int distancia,int num, String nome_c, Map<String, Float> tempmed, float desvio, 
    float troca, float temprec, Carro car, Piloto pil)
    {
        String tipo;
        this.dist= distancia;
        this.numeroVoltas = num;
        this.nome=nome_c;
        for( float temp: tempmed.values()){
          //  this.tempo_med.put(tipo,tempmed.get(tipo));
        }
        this.tempo_med=tempmed;
        this.desv_tempo_med=desvio;
        this.troca_pil=troca;
        this.tempo_rec=temprec;
        this.carro_rec=car.clone();
        this.piloto_rec=pil.clone();
    }
    
    public Circuito(Circuito circ)
    {
        String tipo;
        this.dist= circ.getDist();
        this.numeroVoltas = circ.getNumVol();
        this.nome=circ.getNome();

        
        
        this.desv_tempo_med=circ.getDesvTempMed();
        this.troca_pil=circ.getTrocaPil();
        
        this.tempo_rec=circ.getTempRec();
        this.carro_rec= circ.getCarroRec().clone();
        this.piloto_rec= circ.getPilotoRec().clone();        
    }
    
        /**
     * GET
       **/
    /** Devolve Distancia               **/
    public int getDist(){ return this.dist; }
    /** Devolve Numero de Voltas        **/
    public int getNumVol(){return this.numeroVoltas;}
    /** Devolve Nome                    **/
    public String getNome(){ return this.nome; }
    
    /** Devolve Tempo MŽdio             **/
    public float getTempoMed(String key){
        /** 
        Map<String,Float> novo = new Map<String,Float>();
        for (int i=0; this.tempo_med.size();i++){
            novo.put(this.tempo_med
        }   
        */
        return this.tempo_med.get(key);
    }
    
    /** Devolve Desvio de Tempo MŽdio   **/
    public float getDesvTempMed(){return this.desv_tempo_med;}
    /** Devolve Troca de Piloto         **/
    public float getTrocaPil(){ return this.troca_pil;}
    /** Devolve Tempo Recorde           **/
    public float getTempRec(){ return this.tempo_rec;}
    /** Devolve Carro do Recorde        **/
    public Carro getCarroRec(){ return this.carro_rec.clone();}
    /** Devolve Piloto do Recorde       **/
    public Piloto getPilotoRec(){ return this.piloto_rec.clone();}
    
        /**
     * SET
       **/
    
    public void setDist(int newDist){ dist=newDist; }
    public void setNome(String newNome){ nome=newNome; }
    public void setNumVol(int newNumVol){this.numeroVoltas = newNumVol;}
    /**
    public void setTempoMed(List<Float> new_tempo_med){ tempo_med=new_tempo_med; }
    */
    
    public void setDesvTempMed(float new_desvio){ desv_tempo_med=new_desvio; }
    public void setTrocaPil(float new_troca_pil){ troca_pil=new_troca_pil; }
    public void setTempoRec(float new_tempo_rec){ tempo_rec=new_tempo_rec; }
    public void setCarroRec(Carro new_carro_rec){ carro_rec=new_carro_rec.clone(); }
    public void setPilotoRec(Piloto new_piloto_rec){ piloto_rec=new_piloto_rec.clone(); }
    
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("Nome Circuito: "+ this.nome + "\n");
        s.append("Distancia: "+ this.dist + "\n");
        s.append("Numero de Voltas: "+ this.numeroVoltas + "\n");
        s.append("Tempos MŽdios: ");
        for (int i=0; i<=this.tempo_med.size(); i++){
            s.append("");
        }
        return s.toString();
    }
    
    public boolean equals(Object obj){
        if (obj==this) return true;
        if (obj==null || obj.getClass() != obj.getClass()) return false;
        Circuito c = (Circuito) obj;
        return (
        this.dist == c.getDist() && 
        this.numeroVoltas == c.getNumVol() &&
        this.nome.equals(c.getNome()) &&
        //this.tempo_med.equals(c.getTempoMed()) &&
        this.desv_tempo_med == c.getDesvTempMed() &&
        this.troca_pil == c.getTrocaPil() &&
        this.tempo_rec == c.getTempRec() &&
        this.carro_rec.equals(c.getCarroRec()) &&
        this.piloto_rec.equals(c.getPilotoRec())
        );
    }
    
    
    public Circuito clone() {return new Circuito(this);}
}
