
/**
 * Write a description of class Melee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Melee extends Weapon
{
    public Melee(boolean equip, int damage){
        super(equip,damage);
    }
    
    public Melee(){
        super(true,80);
    }
}
