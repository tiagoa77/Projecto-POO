import java.io.Serializable;
/**
 * Write a description of class SC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarroSC extends Carro implements Serializable
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class SC
     */
    public CarroSC()
    {
        // initialise instance variables

        super();
    }
    public CarroSC( CarroSC carro)
    {
    super(carro);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public CarroSC clone(){ return new CarroSC(this); }
}
