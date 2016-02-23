
/**
 * Write a description of class Suit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Suit extends Armor
{
    String name = "Two piece suit";
    public Suit(){
        super(15,100,5);
    }

    public String getName(){
        return name;
    }
}
