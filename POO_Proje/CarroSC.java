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
    private int cilindrada;

    /**
     * Constructor for objects of class SC
     */
    public CarroSC()
    {
        // initialise instance variables
        this.cilindrada=0;
        super();
    }
    public CarroSC( CarroSC carro)
    {
        this.cilindrada = carro.getCilind();
        super(carro);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getCilind(){return this.cilindrada; }
    public CarroSC clone(){ return new CarroSC(this); }
}
