
/**
 * Write a description of interface Consumable here.
 * 
 * @author Gary Carlson
 * @version 0.1
 */
public abstract class Consumable extends Item
{
    private int amountLeft;

    public Consumable(int uses){
        amountLeft = uses;
    }

    public Consumable(){
        this(3);
    }
    
    public void useConsumable(){
        amountLeft = amountLeft - 1;
        System.out.println("You use your consumable, you have " + amountLeft + " uses.");
    }
}
