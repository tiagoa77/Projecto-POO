import java.io.Serializable;
/**
 * Write a description of class PC1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarroPC1 extends Carro implements Serializable
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class PC1
     */
    public CarroPC1()
    {
        // initialise instance variables

        super();
    }
    public CarroPC1( CarroPC1 carro)
    {
    super(carro);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public CarroPC1 clone(){ return new CarroPC1(this); }
}
