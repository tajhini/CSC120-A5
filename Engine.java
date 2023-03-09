
/** A class that contains a method that resets the `Engine`'s current fuel level to the maximum and 
 *  a method that will decrease the current fuel level and print the  remaining fuel level
 * if the fuel level is above 0 
 * @author Tajhini Brown
 */
public class Engine {
/**
 * Creates an engine of a specific type with a specific fuel capacity.
 * @param FuelType fuel_type, enum
 * @param double current_fuel_lvl
 * @param double max_fuel_lvl
 * @return fuel_type
 * @return current_fuel_lvl
 * @return max_fuel_lvl
 */

    private FuelType fuel_type;
    private double current_fuel_lvl; 
    private double max_fuel_lvl;


    public FuelType getFueltype(){
        return fuel_type;
    }
    public double getCurrentfuel(){
        return current_fuel_lvl;
    }
    public double getMaxfuel(){
        return max_fuel_lvl;
    }


    public Engine(FuelType fuelType, double max_fuel_lvl){
        this.fuel_type = fuelType;
        current_fuel_lvl = max_fuel_lvl;
        this.max_fuel_lvl = max_fuel_lvl;
    }

    public void refuel(){
        current_fuel_lvl = max_fuel_lvl;
    }

    public void go(){
        current_fuel_lvl = current_fuel_lvl - 10;
        if (current_fuel_lvl <= 0) {
            throw new RuntimeException("The current fuel level is too low.");
          }
          System.out.println("Current fuel level: " + current_fuel_lvl);
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        try {
            while (true) {
                myEngine.go();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Out of fuel
        }
    }

}
