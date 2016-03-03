import java.util.Random;
import java.util.ArrayList;
@SuppressWarnings("unchecked")
/**
 * Abstract class Gun - write a description of the class here
 * 
 * @author Gary Carlson
 * @version V2
 */
public abstract class Gun extends Weapon
{
    private Random damage = new Random();
    private int damageDealt;
    private int minDamage;
    private int maxDamage;
    private int effectiveDamage;
    private int effectiveAccuracy;
    private int effectiveRange;
    private int effectiveAmmo;
    private String itemName;
    public Gun(boolean equip, int damage, int accuracy, int range, int ammo, int min, int max, String name){
        super(equip, damage);
        minDamage = min;
        maxDamage = max;
        itemName = name;
        effectiveDamage = damage;
        effectiveAccuracy = accuracy;
        effectiveRange = range;
        effectiveAmmo = ammo;
    }

    public Gun(){
        this(true,0,0,0,0,0,0,"");
    }

    public int shootGun(){
        damageDealt = damage.nextInt((maxDamage - minDamage) + 1) + minDamage;
        System.out.println("You take aim and deal " + damageDealt + " points of damage.");
        return damageDealt;
    }

    public int focusFire(){
        damageDealt = maxDamage;
        System.out.println("You hold your breath and deal " + damageDealt + " points of damage.");
        return damageDealt;
    }

    public String getName(){
        return itemName;
    }

    public ArrayList getStats(){
        ArrayList stats = new ArrayList();
        stats.add(effectiveDamage);
        stats.add(effectiveAccuracy);
        stats.add(effectiveRange);
        stats.add(effectiveAmmo);
        stats.add(itemName);
        return stats;
    }
}
