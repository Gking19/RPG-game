import java.lang.Math;
import java.util.Random;
import java.util.ArrayList;
@SuppressWarnings("unchecked")
/**
 * Write a description of class Weapon here.
 * 
 * @author Gary Carlson
 * @version V2
 */
public abstract class Weapon extends Item implements WeaponInterface
{
    private boolean equipable;
    private int damageAmount;
    private String itemName;

    public Weapon(boolean equip, int damage){
        equipable = equip;
        damageAmount = damage;
    }

    public int attack(){
        int damageDealt = 0;
        System.out.println("You attack your enemy.");
        return damageDealt;
    }

    public boolean parry(){
        Random parry = new Random();
        int blocked = parry.nextInt(2);
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

