import java.util.Random;
import java.util.ArrayList;
@SuppressWarnings("unchecked")
/**
 * Abstract class Armor - write a description of the class here
 * 
 * @author Gary Carlson
 * @version V2
 */
public abstract class Armor extends Item 
{
    private int protectionAmount;
    private int durabilityAmount;
    private int encumbranceAmount;
    private double blockChance;
    private String itemName;
    public Armor(int protection, int durability, int encumbrance, double blockAmount, String Name){
        protectionAmount = protection;
        durabilityAmount = durability;
        encumbranceAmount = encumbrance;
        itemName = Name;
        blockChance = blockAmount;
    }

    public Armor(){
        this(0,0,0,0,"");
    }

    public boolean blocked(){
        Random block = new Random();
        double blocked = block.nextDouble();
        System.out.println(blocked);
        if(blocked < blockChance){
            return true;
        }
        else{
            return false;
        }
    }

    public String getName(){
        return itemName;
    }

    public ArrayList getStats(){
        ArrayList stats = new ArrayList();
        stats.add(protectionAmount);
        stats.add(durabilityAmount);
        stats.add(encumbranceAmount);
        stats.add(blockChance);
        stats.add(itemName);
        return stats;
    }
}
