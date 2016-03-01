import java.util.Random;
/**
 * Abstract class Gun - write a description of the class here
 * 
 * @author Gary Carlson
 * @version V0.1
 */
public abstract class Gun extends Weapon
{
    private int damageDealt;
    private Random damage = new Random();
    private int minDamage;
    private int maxDamage;
    private String itemName;
    public Gun(boolean equip, int damage, int accuracy, int range, int ammo, int min, int max, String name){
        super(equip, damage);
        minDamage = min;
        maxDamage = max;
        itemName = name;
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
        damageDealt = damage.nextInt(maxDamage);
        System.out.println("You hold your breath and deal " + damageDealt + " points of damage.");
        return damageDealt;
    }

    public String getName(){
        return itemName;
    }

}
