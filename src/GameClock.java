/*
 * Makes the gameclock which is used by the game engine 
 * later clocks in game.
 */
import java.util.*;

public class GameClock {
	int startTime = 0;
	int time = 0;
	
	// Default constructor
	public GameClock()
	{
		Date date = new Date();
		startTime = (int) date.getTime();
		time = startTime;
	}
	
	// Shows the time that the game has been running
	public int getTime()
	{
		Date date = new Date();
		time = (int)date.getTime();
		return (startTime - time);
	}
	
	// Get the current date object
	public Date getDate()
	{
		Date date = new Date();
		return date;
	}
	
}
