import java.util.ArrayList;
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public class Item implements ItemInterface{
    String itemName;
    public String getName(){
        String name = itemName;
        return name;
    }

    public ArrayList getStats(){
        ArrayList stats = new ArrayList();
        return stats;
    }
}
