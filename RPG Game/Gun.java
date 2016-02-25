import java.util.Random;
/**
 * Abstract class Gun - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Gun extends Weapon
{
    private int damageDealt;
    private Random damage = new Random();
    public Gun(boolean equip, int damage){
        super(equip, damage);
    }

    public Gun(){
        this(true, 0);
    }

    public int shootGun(){

        damageDealt = damage.nextInt(100);
        System.out.println("You take aim and deal " + damageDealt + " points of damage.");
        return damageDealt;
    }

    public int focusFire(){
        int min = 0;
        int max = 0;
        damageDealt = damage.nextInt((max - min) + 1) + min;
        System.out.println("You hold your breath and deal " + damageDealt + " points of damage.");
        return damageDealt;
    }

}
