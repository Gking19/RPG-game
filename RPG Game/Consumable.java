import java.util.ArrayList;
@SuppressWarnings("unchecked")
/**
 * Write a description of interface Consumable here.
 * 
 * @author Gary Carlson
 * @version V2
 */
public abstract class Consumable extends Item
{
    private int amountLeft;
    private String itemName;

    public Consumable(int uses, String Name){
        amountLeft = uses;
        itemName = Name;

    }

    public Consumable(){
        this(0,"");
    }

    public void useConsumable(){
        if(amountLeft > 0){
            amountLeft = amountLeft - 1;
            System.out.println("You use one " + itemName + ", you have " + amountLeft + " uses left.");
        }
        else{
            System.out.println("You have no more " + itemName + "s left.");
        }
    }

    public String getName(){
        return itemName;
    }

    public ArrayList getStats(){
        ArrayList stats = new ArrayList();
        stats.add(amountLeft);
        stats.add(itemName);
        return stats;
    }
}
