import java.util.*;
import java.lang.*;
import java.io.Serializable;
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
    private int numero_voltas;
    private String nome;
    private List<Float> tempo_med;
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
        this.numero_voltas = 0;
        this.nome="";
        this.tempo_med=new ArrayList<Float>();
        this.desv_tempo_med=0.00f;
        this.troca_pil=0.00f;
        
        this.tempo_rec=0.00f;
        this.carro_rec=null;
        this.piloto_rec=new Piloto();
        
    }
    
    public Circuito(int distancia,int num, String nome_c, List<Float> tempmed, float desvio, 
    float troca, float temprec, Carro car, Piloto pil)
    {
        this.dist= distancia;
        this.numero_voltas = num;
        this.nome=nome_c;
        this.tempo_med=tempmed;
        this.desv_tempo_med=desvio;
        this.troca_pil=troca;
        
        this.tempo_rec=temprec;
        this.carro_rec=car.clone();
        this.piloto_rec=pil.clone();
    }
    public Circuito(Circuito circ)
    {
        this.dist= circ.getDist();
        this.numero_voltas = circ.getNumVol();
        this.nome=circ.getNome();
        this.tempo_med=circ.getTempoMed();
        this.desv_tempo_med=circ.getDesvTempMed();
        this.troca_pil=circ.getTrocaPil();
        
        this.tempo_rec=circ.getTempRec();
        this.carro_rec= circ.getCarroRec().clone();
        this.piloto_rec= circ.getPilotoRec().clone();        
    }
    
        /**
     * GET
       **/
    /**Devolve Distancia**/
    public int getDist(){ return this.dist; }
    /**Devolve Nome**/
    public int getNumVol(){return this.numero_voltas;}
    
    public String getNome(){ return this.nome; }
    /**Devolve Tempo MŽdio**/
    public List<Float> getTempoMed(){ return this.tempo_med; }
    /**Devolve Desvio de Tempo MŽdio**/
    public float getDesvTempMed(){return this.desv_tempo_med;}
    /**Devolve Troca de Piloto**/
    public float getTrocaPil(){ return this.troca_pil;}
    /**Devolve Tempo Recorde**/
    public float getTempRec(){ return this.tempo_rec;}
    /**Devolve Carro do Recorde**/
    public Carro getCarroRec(){ return this.carro_rec.clone();}
    /**Devolve Piloto do Recorde**/
    public Piloto getPilotoRec(){ return this.piloto_rec.clone();}
    
        /**
     * SET
       **/
    
    public void setDist(int new_dist){ dist=new_dist; }
    public void setNome(String new_nome){ nome=new_nome; }
    public void setTempoMed(List<Float> new_tempo_med){ tempo_med=new_tempo_med; }
    public void setDesvTempMed(float new_desvio){ desv_tempo_med=new_desvio; }
    public void setTrocaPil(float new_troca_pil){ troca_pil=new_troca_pil; }
    public void setTempoRec(float new_tempo_rec){ tempo_rec=new_tempo_rec; }
    public void setCarroRec(Carro new_carro_rec){ carro_rec=new_carro_rec.clone(); }
    public void setPilotoRec(Piloto new_piloto_rec){ piloto_rec=new_piloto_rec.clone(); }   
}
