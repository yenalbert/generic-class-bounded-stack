import java.util.Random;

/**
 * @author Albert Yen;
 */
public class TesterMajiGame 
{
	  public static void main(String[] args) 
    {
		    //This is the Main Tester class for the Maji Game's Requirements;
		    Random randomMajiSpells = new Random();
		
		    //Creation of a new BoundedStack, type: Double, for the Maji Game;
        BoundedStack<Double> majiGame = new BoundedStack<Double>(randomMajiSpells.nextDouble());
        
        //This will push 51 spells, with randomly varying Double-values;
        for (int i=1; i != 53; i++) 
        {
        	  majiGame.push(randomMajiSpells.nextDouble());
        }
        
        //After the 50th loop, this cycle will print null for the 51st magic spell;
		    for (int i=1; i != 52; i++) 
		    {
			      System.out.println("Magic Spell Power #" + i + ": " + majiGame.pop());
		    }
		
    }
}
