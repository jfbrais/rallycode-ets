import com.ibm.rally.Car;
import com.ibm.rally.ICar;
import com.ibm.rally.IObject;

/**
 * This is the class that you must implement to enable your car within the
 * CodeRally track. Adding code to these methods will give your car it's
 * personality and allow it to compete.
 */
public class RallyCar extends Car
{

	int checkpointToDo = 0;
	IObject[] checkpoints;

	/**
	 * @see com.ibm.rally.Car#getColor()
	 */
	public byte getColor()
	{
		return CAR_YELLOW;
	}

	/**
	 * @see com.ibm.rally.Car#initialize()
	 */
	public void initialize()
	{
		// put implementation here
		checkpoints = this.getCheckpoints();
		this.setThrottle(MAX_THROTTLE);
	}

	/**
	 * @see com.ibm.rally.Car#move(int, boolean, ICar, ICar) Put the car in
	 *      reverse for a few moves if you collide with another car. Go toward
	 *      the first gas depot.
	 */
	public void move(int lastMoveTime, boolean hitWall, ICar collidedWithCar,
			ICar hitBySpareTire)
	{
		if (this.getDistanceTo(checkpoints[checkpointToDo]) > 75)
		{
			if (this.getHeading() < this
					.getHeadingTo(checkpoints[checkpointToDo]))
			{
				this.setSteeringSetting(MAX_STEER_RIGHT);
			}
			else
			{
				this.setSteeringSetting(MAX_STEER_LEFT);
			}
		}
		else
		{
			setHeadlightsOn(checkpointToDo % 2 == 0);

			if (checkpointToDo == checkpoints.length - 1)
			{
				checkpointToDo = 0;
			}
			else
			{
				checkpointToDo++;
			}
		}
	}
}