import java.util.Random;
/**
 * @author Albert Yen;
 */
public class TesterWebBrowser 
{

	public static void main(String[] args) 
	{
  
		Random randomBrowserHistory = new Random();
		
		//Creation of a new BoundedStack, type: String, for the Browser History;
                //For demonstration purposes, the browserHistory will be represented by an instance of the Random class;
		BoundedStack<String> browserHistory = new BoundedStack<String>(Long.toString(randomBrowserHistory.nextLong()));
        
		//This will push 51 IP addresses, randomly generated Long-values;
		for (int i=1; i != 53; i++) 
		{
			browserHistory.push(Long.toString(randomBrowserHistory.nextLong()));
		}
		
		//After the 50th loop, this cycle will print null for the 51st IP address;
		for (int i=1; i != 52; i++) 
		{
			System.out.println("IP Address #" + i + ": " + browserHistory.pop());
		}
			
	}
}
