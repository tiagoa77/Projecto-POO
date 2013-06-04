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
    private Map<Carro, Integer> classificacaoGeral;
 
    public Campeonato(){
        this.classificacao = new ArrayList<Corrida>();
        this.classificacaoGeral = new HashMap<Carro, Integer>();
    }
 
    public Campeonato( List<Corrida> classi, Map<Carro,Integer> classiGeral){
        this.classificacao = classi;
        this.classificacaoGeral = classiGeral;
           
    }
    public Campeonato(Campeonato campe){
        this.classificacao = campe.getClassificacao();
        this.classificacaoGeral = campe.getClassificacaoGeral();
    }
    
    public List<Corrida> getClassificacao(){
        List<Corrida> aux = new ArrayList<Corrida>();
        for(Corrida co : this.classificacao){
            aux.add(co);
        }
        return aux;
    }
    
    public Map<Carro, Integer> getClassificacaoGeral(){
        Map<Carro, Integer> aux = new HashMap<Carro, Integer>();
        for(Carro car : this.classificacaoGeral.keySet()){
            Integer pontos =this.classificacaoGeral.get(car);
            aux.put(car,pontos);
            }
        return aux;
        }
        
    
    }

