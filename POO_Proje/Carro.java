import java.io.Serializable;
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
    private int cilind;
    private int pot;
    private Piloto piloto1;
    private Piloto piloto2;
    
    /**
     * Constructores
     */
    public Carro()
    {
        this.marca="";
        this.modelo="";
        this.cilind=0;
        this.pot=0;
    }    
    
    public Carro(String marc, String mod, int cilindrada, int potencia,Piloto piloto1,Piloto piloto2)
    {
        this.marca=marc;
        this.modelo=mod;
        this.cilind=cilindrada;
        this.pot=potencia;
        this.piloto1 = piloto1;
        this.piloto2 =piloto2;
    }
    
    public Carro(Carro carro)
    {
        this.marca=carro.getMarca();
        this.modelo=carro.getModelo();
        this.cilind=carro.getCilind();
        this.pot=carro.getPot();
      
    }

    public String getMarca(){ return this.marca; }
    public String getModelo(){ return this.modelo; }
    public int getCilind(){return this.cilind; }
    public int getPot(){ return this.pot; }
    
   
    
    public void setMarca (String marc){ this.marca=marc; }
    public void setModelo (String mod){ this.modelo=mod; }
    public void setCilind (int cilindrada){ this.cilind=cilindrada; }
    public void setPot (int potencia){ this.pot=potencia; }
   
    
    
    public abstract Carro clone();
    
   
        
   
}
