import java.io.Serializable;
import java.lang.Object;
/**
 * Write a description of class Carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * Fazer com classes abstra
 */
public abstract class Carro implements Serializable
{
    // instance variables - replace the example below with your own
    private String marca;
    private String modelo;
    private String categoria;
    private int pot;
    private Piloto piloto1;
    private Piloto piloto2;
    private String equipa;
    
    /**
     * Constructores
     */
    public Carro()
    {
        this.marca="";
        this.modelo="";
        this.pot=0;
        this.piloto1 = new Piloto();
        this.piloto2 = new Piloto();
        this.equipa = "";
    }    
    
    public Carro(String marc, String mod, int cilindrada, int potencia,Piloto piloto1,Piloto piloto2, String nomeEquipa)
    {
        this.marca=marc;
        this.modelo=mod;
        this.pot=potencia;
        this.piloto1 = piloto1;
        this.piloto2 = piloto2;
        this.equipa = nomeEquipa;
    }
    
    public Carro(Carro carro)
    {
        this.marca=carro.getMarca();
        this.modelo=carro.getModelo();
        this.pot=carro.getPot();
        this.piloto1 = carro.getPiloto1();
        this.piloto2 = carro.getPiloto2();
        this.equipa = carro.getEquipa(); 
        
    }

    public String getMarca(){ return this.marca; }
    public String getModelo(){ return this.modelo; }
    
    //public int getCilind(){return this.getClass().getCilind(); }
    
    public int getPot(){ return this.pot; }
    public Piloto getPiloto1(){ return this.piloto1; }
    public Piloto getPiloto2(){ return this.piloto2; }
    public String getEquipa(){ return this.equipa; }
    public String getCategoria() {return this.categoria;}
    
   
    
    public void setMarca (String marc){ this.marca=marc; }
    public void setModelo (String mod){ this.modelo=mod; }
    //public void setCilind (int cilindrada){ this.cilind=cilindrada; }
    public void setPot (int potencia){ this.pot=potencia; }
    public void setPiloto1 (Piloto piloto1){this.piloto1=piloto1;}
    public void setPiloto2 (Piloto piloto2){this.piloto2=piloto2;}
    public void setEquipa (String nomeEquipa){ this.equipa=nomeEquipa; }

    public Float tempoProximaVolta(int dist, float tempMed){
        return tempMed;
    }
    
    public abstract Carro clone();
    
   
        
   
}
