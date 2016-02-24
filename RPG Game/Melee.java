
/**
 * Write a description of class Melee here.
 * 
 * @author Gary Carlson
 * @version V2
 */
public abstract class Melee extends Weapon
{
    private int usableRange;
    private int knockDown;
    private String itemName;
    public Melee(boolean equip, int damage, int range, int knockdown, String name){
        super(equip,damage);
        usableRange = range;
        knockDown = knockdown;
        itemName = name;
    }
    
    public Melee(){
        this(true,0,0,0,"");
    }
}
