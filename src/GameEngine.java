
public class GameEngine {
	
	public GameEngine()
	{
		
	}
	
	public GameEngine(String filename)
	{
		if (!filename.contains("/"))
		{
			System.out.println("I'm sorry, that is not a valid filename.");
		}
	}
	
}
