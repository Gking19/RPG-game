import java.util.Random;
/**
 * Abstract class Gun - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Gun extends Weapon
{
    public Gun(boolean equip, int damage){
        super(equip, damage);
    }

    public Gun(){
        this(true, 73);
    }

    public int shootGun(){
        Random damage = new Random();
        int damageDealt = damage.nextInt(100);
        System.out.println("You take aim and deal " + damageDealt + " points of damage.");
        return damageDealt;
    }

    public int focusFire(){
        final int min = 50;
        final int max = 100;
        Random damage = new Random();
        int damageDealt = damage.nextInt((max - min) + 1) + min;
        System.out.println("You hold your breath and deal " + damageDealt + " points of damage.");
        return damageDealt;
    }

}
