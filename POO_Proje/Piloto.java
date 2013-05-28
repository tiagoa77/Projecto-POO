
/**
 * Write a description of class Piloto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piloto
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
        nome="";
        nac="";
        palmar=0;
        qualidade=0;
        cap_wet=0;
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
        nome=pil.getNome();
        nac=pil.getNac();
        palmar=pil.getPalmar();
        qualidade=pil.getQualidade();
        cap_wet=pil.getCapWet();
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
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
    
    
    public int sampleMethod(int y)
    {
        // put your code here
        return palmar + y;
    }
    public Piloto clone(){
        return new Piloto(this);
    }
}
