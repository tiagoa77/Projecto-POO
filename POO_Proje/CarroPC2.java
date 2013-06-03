import java.io.Serializable;
/**
 * Write a description of class CarroPC2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarroPC2 extends Carro implements Serializable
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class CarroPC2
     */
    public CarroPC2()
    {
        super();
    }
    public CarroPC2 (CarroPC2 carro)
    {
        super(carro);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public CarroPC2 clone(){
        return new CarroPC2(this);
    }


    public float tempoProximaVolta(Circuito pista){
        float desvio=0;
        //float tempoMedio = pista.getTempoMed().get(1);
        
        
        
        
        return desvio;
    }


}
