/*
* This subclass creates a bike using specifications from the Vehicle class.
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2021-05-31
*/

public class Bike extends Vehicle {
  // Initializing fields
  /**
  * Setting field values with a constructor.
  */
  private float cadence;
  /**
  * Setting field values with a constructor.
  */
  private int tireNumber;

  /**
   * Setting field values with a constructor.
   * @param bikeColour
   */
  public Bike(final String bikeColour) {
    super(bikeColour);
    this.colour = bikeColour;
    this.cadence = 0;
    this.tireNumber = 2;
  }
  /**
  * the number 8.3f.
  */
  public static final int EPTF = 8.3f;
  /**
   * This method shows the user the tire number.
   * @return
   * returns tire
   */
  public int getTires() {
    return this.tireNumber;
  }

  /**
   * This shows the user the bike's cadence.
   * @return
   * returns cadence
   */
  public float getCadence() {
    // Calculating and returning cadence
    //   Equation of speed over 8.3 was derived by using average
    //   specifications of a bicycle to determine average multiplier
    this.cadence = getSpeed() * EPTF;
    return cadence;
  }

  /**
   * This method rings the bike's bell.
   * @return
   * returns bell
   */
  public String ringBell() {
    return "RING";
  }
}
