import java.util.*;
import java.io.Serializable;
/**
 * Write a description of class Campeonato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Campeonato implements Serializable
{
    private List<Corrida> classificacao; 
    private Map<Carro, Integer> classificacao_geral;
 
    public Campeonato(){
        this.classificacao = new ArrayList<Corrida>();
        this.classificacao_geral = new HashMap<Carro, Integer>();
    }
 
    public Campeonato( List<Corrida> classi, Map<Carro,Integer> classi_geral){
        
        
    
    }
    
}
