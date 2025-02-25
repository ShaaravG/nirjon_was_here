import java.util.List;
import javafx.scene.paint.Color; 
/**
 * Write a description of class Plant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Plant extends Organism
{
    private Color color = Color.GREEN;
    
    public Plant(Field field, Location location, Color col)
    {
        super(field, location, col);
    }

    public void act(List<Organism> newPlants) {
        
    }

}
