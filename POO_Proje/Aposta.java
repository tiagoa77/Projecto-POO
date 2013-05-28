import java.io.Serializable;
/**
 * Write a description of class Aposta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aposta implements Serializable
{
    private float valor;
    

    /**
     * Constructor for objects of class Aposta
     */
    public Aposta()
    {
        // initialise instance variables

    }
    public Aposta(Aposta ap)
    {

    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

    public Aposta clone(){
        return new Aposta(this);
    }
}
