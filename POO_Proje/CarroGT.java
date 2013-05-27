import java.io.Serializable;
/**
 * Write a description of class GT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarroGT extends Carro implements Serializable
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class GT
     */
    public CarroGT()
    {
        // initialise instance variables

        super();
    }
    public CarroGT( CarroGT carro)
    {
        super(carro);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public CarroGT clone(){ return new CarroGT(this); }
}
