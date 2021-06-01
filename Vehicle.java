/*
* This class creates a vehicle.
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2021-05-31
*/

public class Vehicle {
  // Initializing fields
  /**
   * Setting field values with a constructor.
   */
  private String colour;
  /**
   * Setting field values with a constructor.
   */
  private float speed;
  /**
   * Setting field values with a constructor.
   */
  private int maximumSpeed;

  /**
   * Setting field values with a constructor.
   * @param colourInput
   */
  public Vehicle(final String colourInput) throws VehicleException {
    setColour(colourInput);
    this.speed = 0;
    this.maximumSpeed = OOT;
  }
  /**
  * the number 112.
  */
  public static final int OOT = 112;

  /**
   * Setter for the colour.
   * @param userColour
   */
  public void setColour(final String userColour) throws VehicleException {
    if (userColour.equals("Red") || userColour.equals("Blue")
        || userColour.equals("Green") || userColour.equals("Yellow")) {
      colour = userColour;
    } else {
      throw new VehicleException("Error: Invalid car colour.");
    }
  }

  /**
   * Getter for the colour.
   * @return
   * returns colour
   */
  public String getColour() {
    return colour;
  }

  /**
   * Getter for the speed.
   * @return
   * returns speed
   */
  public float getSpeed() {
    return this.speed;
  }

  /**
   * Method that accelerates the vehicle.
   * @param userIncrease
   * @return
   * returns speed
   */
  public float accelerate(final float userIncrease) throws Exception {
    // Checking to see if speed exceeds maximum then increasing the speed
    if (this.speed + userIncrease > this.maximumSpeed) {
      throw null;
    } else {
      this.speed = this.speed + userIncrease;
    }

    // Returning the new speed to the user
    return this.speed;
  }

  /**
   * Method that deccelerates the vehicle.
   * @param userDecrease
   * @return
   * returns speed
   */
  public float decelerate(final float userDecrease) throws Exception {
    // Checking to see if speed exceeds maximum then increasing the speed
    if (this.speed - userDecrease < 0) {
      throw null;
    } else {
      this.speed = this.speed - userDecrease;
    }

    // Returning the new speed to the user
    return this.speed;
  }
}
