/*
* This subclass creates a truck using specifications from the Vehicle class.
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2021-05-31
*/

public class Truck extends Vehicle {
  // Initializing fields
  /**
  * Setting field values with a constructor.
  */
  private String licensePlateNumber;
  /**
  * Setting field values with a constructor.
  */
  private int tireNumber;

  /**
   * Setting field values with a constructor.
   * @param truckColour
   */
  public Truck(final String truckColour) {
    super(truckColour);
    this.colour = truckColour;
    this.licensePlateNumber = "DEFAULT";
    this.tireNumber = FOUR;
  }
  /**
  * the number four.
  */
  public static final int FOUR = 4;
  /**
   * This setter sets the license plate of the truck.
   * @param licensePlateInput
   */
  public void setLicensePlate(final String licensePlateInput) {
    this.licensePlateNumber = licensePlateInput;
  }

  /**
   * This getter shows the user the license plate of the truck.
   * @return
   * returns licenseplate
   */
  public String getLicensePlate() {
    return this.licensePlateNumber;
  }

  /**
   * This method shows the user the tire number.
   * @return
   * returns tires
   */
  public int getTires() {
    return this.tireNumber;
  }

  /**
   * This method blows the truck's horn.
   * @return
   * returns air
   */
  public String provideAir() {
    return "HONK";
  }
}
