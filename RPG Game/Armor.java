import java.util.Random;
/**
 * Abstract class Armor - write a description of the class here
 * 
 * @author Gary Carlson
 * @version V1
 */
public abstract class Armor extends Item 
{
    private int protectionAmount;
    private int durabilityAmount;
    private int encumbranceAmount;
    private String itemName;
    public Armor(int protection, int durability, int encumbrance, String Name){
        protectionAmount = protection;
        durabilityAmount = durability;
        encumbranceAmount = encumbrance;
        itemName = Name;
    }

    public Armor(){
        this(0,0,0,"");
    }

    public boolean blocked(){
        Random block = new Random();
        int blocked = block.nextInt(2);
        if(blocked == 1){
            return true;
        }
        else{
            return false;
        }
    }

    public String getName(){
        return itemName;
    }
}
