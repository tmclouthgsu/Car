package assignment2;


public class Car {
	int gear = 1;
	int location;
	int speed = 0;
	final int DESTINATION = 250;
	
	void reverseGear()
	{
		gear = -1;
	}
	void gearUp()
	{
		if(gear == 6)
		{
			System.out.println("We dont have a higher gear Captain!");
			return;
		}
		if(gear == -1)
		{
			gear = 1;
		}
		else
		{
		gear++;
		}
	}
	void gearDown()
	{
		if(gear == 1)
		{
			System.out.println("If we go any slower we might as well be going backwards!");
		}
		if(gear == -1)
		{
			System.out.println("We've only got one reverse gear, we're not the Fench!");
		}
		else
		{
		gear--;
		}
	}
	int reportGear()
	{
	return gear;
	}
	int reportLocation()
	{
	return location;
	}
	int reportRemaining()
	{
	int remaining = DESTINATION-location;
	return remaining;
	}
	void moveByTime(int time)
	{
		if(time > 0) 
		{
			speed = gear*20;
			int delta = speed*time;
			location=location+delta;
		} 
		else 
		{
			System.out.println("We dont support travelling back in time!");
		}
	}
	boolean isArrived()
	{
		if(location >= DESTINATION)
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
}
