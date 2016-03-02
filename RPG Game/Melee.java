
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
    private int damageDealt;
    private int effectiveDamage;
    public Melee(boolean equip, int damage, int range, int knockdown, String name){
        super(equip,damage);
        usableRange = range;
        knockDown = knockdown;
        itemName = name;
        effectiveDamage = damage;
    }

    public Melee(){
        this(true,0,0,0,"");
    }

    public String getName(){
        return itemName;
    }

    public int meleeAttack(){
        damageDealt = effectiveDamage;
        System.out.println("You swing your weapon and deal " + damageDealt + " points of damage.");
        return damageDealt;
    }
}
