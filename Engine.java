
/** A class that contains a method that resets the `Engine`'s current fuel level to the maximum and 
 *  a method that will decrease the current fuel level and print the  remaining fuel level
 * if the fuel level is above 0 
 * @author Tajhini Brown
 */
public class Engine {
/**
 * Creates an engine of a specific type with a specific fuel capacity.
 * @param fuel_type The fuel type of the engine
 * @param current_fuel_lvl The current level of fuel in the engine
 * @param max_fuel_lvl The maximum level of fuel in the engine
 */

    private FuelType fuel_type;
    private double current_fuel_lvl; 
    private double max_fuel_lvl;

/** Accessors */
    public FuelType getFueltype(){
        return fuel_type;
    }
    public double getCurrentfuel(){
        return current_fuel_lvl;
    }
    public double getMaxfuel(){
        return max_fuel_lvl;
    }

/** Constructor */
    public Engine(FuelType fuelType, double max_fuel_lvl){
        this.fuel_type = fuelType;
        this.current_fuel_lvl = max_fuel_lvl;
        this.max_fuel_lvl = max_fuel_lvl;
    }

    /**
     * Refuels the engine by returning the current fuel level to the max fuel level
    */
    public void refuel(){
        this.current_fuel_lvl = max_fuel_lvl;
    }
    /**
     * Decreases the engine's fuel level down to a certain point
    */
    public void go(){
        this.current_fuel_lvl = this.current_fuel_lvl - 10;
        if (this.current_fuel_lvl <= 10) {
            throw new RuntimeException("The current fuel level is too low.");
          }
          System.out.println("Current fuel level: " + this.current_fuel_lvl);
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
