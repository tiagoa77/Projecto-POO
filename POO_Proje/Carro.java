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
    private Equipa condutores;
    
    /**
     * Constructores
     */
    public Carro()
    {
        this.marca="";
        this.modelo="";
        this.cilind=0;
        this.pot=0;
        this.condutores = new Equipa();
    }
    
    public Carro(String marc, String mod, int cilindrada, int potencia,Equipa condutores)
    {
        this.marca=marc;
        this.modelo=mod;
        this.cilind=cilindrada;
        this.pot=potencia;
        this.condutores = condutores;
    }
    
    public Carro(Carro carro)
    {
        this.marca=carro.getMarca();
        this.modelo=carro.getModelo();
        this.cilind=carro.getCilind();
        this.pot=carro.getPot();
        this.condutores = carro.getCondutores();
    }

    public String getMarca(){ return this.marca; }
    public String getModelo(){ return this.modelo; }
    public int getCilind(){return this.cilind; }
    public int getPot(){ return this.pot; }
    public Equipa getCondutores() {return this.condutores;}
   
    
    public void setMarca (String marc){ this.marca=marc; }
    public void setModelo (String mod){ this.modelo=mod; }
    public void setCilind (int cilindrada){ this.cilind=cilindrada; }
    public void setPot (int potencia){ this.pot=potencia; }
    public void setCondutores (Equipa e){ this.condutores=e; }
    
    
    public abstract Carro clone();
}
