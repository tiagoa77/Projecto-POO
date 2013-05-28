import java.util.*;
import java.io.Serializable;
/**
 * Write a description of class Utilizadores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Utilizador implements Serializable
{
    // instance variables - replace the example below with your own
    private String nome;
    private String morada;
    private String pass;
    private List<Aposta> open_bet;
    private List<Aposta> bet_hist;
    private int conta_corr;
    

    /**
     * Constructor for objects of class Utilizadores
     */
    public Utilizador()
    {
        this.nome="";
        this.morada="";
        this.pass="";
        this.open_bet=new ArrayList<Aposta>();
        this.bet_hist=new ArrayList<Aposta>();
        this.conta_corr=0;
    }

    public Utilizador(String nome_ut, String morada_ut,String pass, ArrayList<Aposta> open,
    ArrayList<Aposta> bet_historico, int corr_count ) // arrays e conta corrente s‹o precisos como argumentos????
    {
        this.nome=nome_ut;
        this.morada=morada_ut;
        this.pass=pass;
        this.open_bet=new ArrayList<Aposta>();
        this.bet_hist=new ArrayList<Aposta>();
        this.conta_corr=0;
    }    
    public Utilizador(Utilizador uti)
    {
        this.nome=uti.getNome();
        this.morada=uti.getMorada();
        this.pass=uti.getPass();
        this.open_bet=new ArrayList<Aposta>();
        for(Aposta a : uti.getOpenBets()){
            open_bet.add(a.clone());
        }
        this.bet_hist=new ArrayList<Aposta>();
        for(Aposta a : uti.getBetsHist()){
            bet_hist.add(a.clone());
        }
        this.conta_corr=uti.getCC();
    }
    
    public String getNome(){ return this.nome; }
    public String getMorada(){ return this.morada; }
    public String getPass(){return this.pass;}
    public List<Aposta> getOpenBets(){ return this.open_bet; }
    public List<Aposta> getBetsHist(){ return this.bet_hist;}
    public int getCC(){ return this.conta_corr; }
    
    public void setNome(String nome_ut){ this.nome=nome_ut; }
    public void setMorada(String morada_ut){ this.morada=morada_ut; }
    public void setPass(String pass){this.pass=pass;}
    public void setOpenBets(List<Aposta> ap){
        open_bet=ap;
        
        /*
        open_bet.clear();
        for(Aposta a : ap){
            open_bet.add(a.clone());
        }
        */
    }
    public void setBetsHist(Aposta ap){ bet_hist.add(ap); }// mesma coisa do setOpenBets()... mesma duvida
    
    
    public void setCC(int cc){ conta_corr=cc; }
    
    
    public void addOpenBets(Aposta ap){ open_bet.add(ap); }
    public void addBetsHist(Aposta ap){ bet_hist.add(ap); }


    public void novoUtilizador(String nome,String morada,String pass){
        this.setNome(nome);
        this.setMorada(morada);
        this.setPass(pass);
        this.conta_corr = 0;
        this.open_bet = new ArrayList<Aposta>(); 
        this.bet_hist=new ArrayList<Aposta>();
        }





}
