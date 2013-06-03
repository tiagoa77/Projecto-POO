import java.io.Serializable;
import java.lang.*;
/**
 * Write a description of class Piloto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piloto implements Serializable
{
    // instance variables - replace the example below with your own
    private String nome;
    private String nac;
    private int palmar;
    private int qualidade;
    private int cap_wet;

    /**
     * Constructor for objects of class Piloto
     */
    public Piloto()
    {
        // initialise instance variables
        this.nome="";
        this.nac="";
        this.palmar=0;
        this.qualidade=0;
        this.cap_wet=0;
    }
    
    public Piloto(String nome_p, String nacionalidade, int palmares, int qualid, int capacidade_wet)
    {
        this.nome=nome_p;
        this.nac=nacionalidade;
        this.palmar=palmares;
        this.qualidade=qualid;
        this.cap_wet=capacidade_wet;
    }
    
    public Piloto(Piloto pil)
    {
        this.nome=pil.getNome();
        this.nac=pil.getNac();
        this.palmar=pil.getPalmar();
        this.qualidade=pil.getQualidade();
        this.cap_wet=pil.getCapWet();
        
    }
    /**
     * GET
       **/
    /**Devolve Nome**/
    public String getNome(){ return this.nome; }
    /**Devolve Nacionalidade**/
    public String getNac(){ return this.nac; }
    /**Devolve Palmares**/
    public int getPalmar(){ return this.palmar; }
    /**Devolve Qualidade**/
    public int getQualidade(){return this.qualidade;}
    /**Devolve Capacidade Wet**/
    public int getCapWet(){ return this.cap_wet;}
    
    /**
    * SET
      **/
    public void setNome(String new_nome){ this.nome=new_nome; }
    public void setNac(String new_nac){ this.nac=new_nac; }
    public void setPalmar(int new_palmar){ this.palmar=new_palmar; }
    public void setQualidade(int new_qual){ this.qualidade=new_qual; }
    public void setCapWet(int new_cap_wet){ this.cap_wet=new_cap_wet; }
    
    public String toString(){
        StringBuilder s= new StringBuilder();
        s.append("Nome Piloto: " + this.nome + "\n");
        s.append("Nacionalidade: "+ this.nac + "\n");
        s.append("T’tulos: "+ this.palmar + "\n");
        s.append("Qualidade: "+ this.qualidade + "\n");
        s.append("Capacidade Piso Molhado: "+ this.cap_wet + "\n");
        return s.toString();
    }
    
    public boolean equals(Object o){
        if (this==o) return true;
        if (o==null || this.getClass() != o.getClass()) return false;
        Piloto pil = (Piloto) o;
        return (this.nome.equals(pil.getNome()) && this.nac.equals(pil.getNac()) &&
        this.palmar==pil.getPalmar() && this.qualidade==pil.getQualidade() &&
        this.cap_wet==pil.getCapWet());
    }
    
    public Piloto clone(){
        return new Piloto(this);
    }
}
