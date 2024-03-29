package com.ibm.rally;
/**
 * This class is the superclass of the RallyCar that you implement. This
 * class contains helper methods to find out about the state of your car,
 * to set the steering and throttle for your car, as well as entering
 * protect mode and throwing spare tires. 
 */
public abstract class Car implements ICar {
	public static final int MAX_CLOCK_TICKS = 600;

	public static final int MAX_THROTTLE = 100;
	public static final int MIN_THROTTLE = -50;

	public static final int MAX_STEER_RIGHT = 10;
	public static final int MAX_STEER_LEFT = -10;

	public final static byte CAR_RED = 0;
	public final static byte CAR_TEAL = 1;
	public final static byte CAR_PURPLE = 2;
	public final static byte CAR_BLUE = 3;
	public final static byte CAR_ORANGE = 4;
	public final static byte CAR_YELLOW = 5;

	/**
	 * @see com.ibm.rally.ICar#getHeading()
	 */
	public final int getHeading() {
		return 0;
	}

	/**
	 * @see com.ibm.rally.ICar#getChangeInHeading()
	 */
	public final int getChangeInHeading() {
		return 0;
	}

	/**
	 * @see com.ibm.rally.ICar#getSpeed()
	 */
	public final double getSpeed() {
		return 0;
	}

	/**
	 * Returns the steering setting for this car. The steering setting
	 * will affect the turn rate of the car.
	 * 
	 * @return int;
	 */
	public final int getSteeringSetting() {
		return 0;
	}

	/**
	 * @see com.ibm.rally.ICar#getFuel()
	 */
	public final int getFuel() {
		return 0;
	}

	/**
	 * @see com.ibm.rally.ICar#getNumberOfSpareTires()
	 */
	public final int getNumberOfSpareTires() {
		return 0;
	}

	/**
	 * @see com.ibm.rally.ICar#getPoints()
	 */
	public final int getPoints() {
		return 0;
	}

	/**
	 * Returns true if the car's headlights are on.
	 * 
	 * @return boolean
	 */
	public final boolean isHeadlightsOn() {
		return false;
	}

	/**
	 * Returns true if the car is in protect mode.
	 * 
	 * @return boolean
	 */
	public final boolean isInProtectMode() {
		return false;
	}

	/**
	 * @see com.ibm.rally.IObject#getX()
	 */
	public final double getX() {
		return 0;
	}

	/**
	 * @see com.ibm.rally.IObject#getY()
	 */
	public final double getY() {
		return 0;
	}

	/**
	 * @see com.ibm.rally.IObject#getDistanceTo(IObject)
	 */
	public final double getDistanceTo(IObject obj) {
		return 0;
	}

	/**
	 * @see com.ibm.rally.IObject#getDistanceTo(double, double)
	 */
	public final double getDistanceTo(double x, double y) {
		return 0;
	}

	/**
	 * @see com.ibm.rally.IObject#getHeadingTo(IObject)
	 */
	public final int getHeadingTo(IObject obj) {
		return 0;
	}

	/**
	 * @see com.ibm.rally.IObject#getHeadingTo(double, double)
	 */
	public final int getHeadingTo(double x, double y) {
		return 0;
	}
	
	/**
	 * Return the current throttle setting.
	 * 
	 * @return int
	 */
	public final int getThrottle() {
		return 0;
	}
	
	/**
	 * Returns the available fuel depots for this match. When you are
	 * within 20 units of a fuel depot, your car will gain fuel.
	 * 
	 * @return com.ibm.rally.IObject[]
	 */
	public final IObject[] getFuelDepots() {
		return null;
	}
	
	/**
	 * Returns the available spare tire depots for this match. When you are
	 * within 20 units of a spare tire depot, your car will gain a spare tire
	 * every 25 ticks.
	 * 
	 * @return com.ibm.rally.IObject[]
	 */
	public final IObject[] getSpareTireDepot() {
		return null;
	}

	/**
	 * Returns a list of checkpoints that you can pass to gain points.
	 *
	 * @return com.ibm.rally.IObject[]
	 */
	public final IObject[] getCheckpoints() {
		return null;
	}

	/**
	 * Returns the index of the previous checkpoint that was reached, or -1
	 * if the car has not passed any checkpoints yet during this match. You
	 * can go to checkpoints in any order, but you will get more points if
	 * you go to the next checkpoint in the list.
	 *
	 * @return int
	 */
	public final int getPreviousCheckpoint() {
		return -1;
	}

	/**
	 * Returns the spare tires that have been thrown but have not yet hit a
	 * wall or another car.
	 * 
	 * @return com.ibm.rally.ISpareTire[]
	 */
	public final ISpareTire[] getSpareTiresOnTrack() {
		return null;
	}

	/**
	 * Returns the number of clock ticks (turns) that have occurred
	 * during this match.
	 *
	 * @return int
	 */
	public final int getClockTicks() {
		return 0;
	}
	
	/**
	 * Returns the width of the track, in units.
	 * 
	 * @return int
	 */
	public final int getTrackWidth() {
		return 0;
	}

	/**
	 * Returns the height of the track, in units.
	 * 
	 * @return int
	 */
	public final int getTrackHeight() {
		return 0;
	}

	/**
	 * Returns an array of all the cars that you are currently competing
	 * against in this match. This array will not include your own car,
	 * and will always return the cars in the same order.
	 *
	 * @return ICar[]
	 */
	public final ICar[] getOpponents() {
		return null;
	}

	/**
	 * Returns true if the car is ready to throw a spare tire, and false if
	 * does not have any spare tires, or if it is not ready to throw again
	 * after the last spare tire.
	 * 
	 * @return boolean
	 */
	public final boolean isReadyToThrowSpareTire() {
		return false;
	}

	// ---------- Action Methods ----------

	/**
	 * Set the steering setting. This must be somewhere between the
	 * MAX_STEER_LEFT and MAX_STEER_RIGHT constants, and will affect the
	 * car's rate of turn.
	 * 
	 * @param steering
	 */
	public final void setSteeringSetting(int steering) {
		// implemented elsewhere
	}

	/**
	 * Set the throttle (gas peddle) of the car. This must be somewhere
	 * between the MIN_SPEED (reverse) and MAX_SPEED (full throttle)
	 * constants. Increasing the throttle will make the car move faster,
	 * but will also burn more fuel per unit travelled.
	 * 
	 * @param throttle
	 */
	public final void setThrottle(int throttle) {
		// implemented elsewhere
	}

	/**
	 * Throw a spare tire out the front of the car. The spare tire will
	 * be thrown in the same heading as the car is currently facing. You
	 * can never be hit by a spare tire thrown by your car.
	 * 
	 * @return boolean - true if the spare tire was thrown, and false if
	 *   the car did not have any remaining spare tires or was not ready
	 *   to throw again after the last thrown spare tire.
	 */
	public final boolean throwSpareTire() {
		return false;
	}

	/**
	 * Enter protect mode. This will sheild your car from spare tires,
	 * but you will use twice the amount of fuel. Protect mode lasts for
	 * 50 clock ticks.
	 * 
	 * @return boolean - true if the car entered protect mode, and false
	 *   if the car was already in protect mode.
	 */
	public final boolean enterProtectMode() {
		return false;
	}

	/**
	 * Turn the car headlights on or off. There's no reason to do
	 * this, but hey, why not?
	 * 
	 * @param on <code>true</code> to turn on headlights, and
	 *   <code>false</code> otherwise
	 */
	public final void setHeadlightsOn(boolean on) {
		// implemented elsewhere
	}

	/**
	 * Returns the name of your car.
	 * 
	 * @return java.lang.String
	 */
	public final String getName() {
		return null;
	}

	/**
	 * Return the name of your organization.
	 * 
	 * @return java.lang.String
	 */
	public final String getOrganization() {
		return null;
	}
	
	/* ----- Methods to implement in RallyCar ----- */

	/**
	 * Called to give you a chance to do initialization. This method
	 * will be called at the beginning of each match, and you will
	 * have a limited amount of time to do initialization.
	 */
	public abstract void initialize();

	/**
	 * Returns the color of your car. This method should return one of the
	 * six CAR_XXX color constants and will only be called once during
	 * initialization.
	 *
	 * @return byte
	 */
	public abstract byte getColor();

	/**
	 * This method is called repeatedly to allow you to move your car.
	 * When you have run out of fuel, this method will no longer be called.
	 * The first parameter returns the length of time (in ms) that the last call
	 * to move() took.
	 *
	 * <p>The second parameter (hitWall) returns true if your car has just ran
	 * into a wall. If your car has collided with another car, the third
	 * parameter (collidedWithCar) will return that other car; otherwise this
	 * parameter will be null. If you have just been hit by a spare tire from another
	 * car, the fourth parameter (hitBySpareTire) returns that other car; otherwise
	 * this parameter will be null.</p>
	 *
	 * @param lastMoveTime
	 * @param hitWall
	 * @param collidedWithCar
	 * @param hitBySpareTire
	 */
	public abstract void move(int lastMoveTime, boolean hitWall, ICar collidedWithCar, ICar hitBySpareTire);
}