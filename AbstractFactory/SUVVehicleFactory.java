public class SUVVehicleFactory extends VehicleFactory {

  public LuxurySUV getLuxury() {
    return new LuxurySUV("Luxury-SUV");
  }
  public NonLuxurySUV getNonLuxury() {
    return new NonLuxurySUV("Non-Luxury-SUV");
  }
  
  public SemiLuxurySUV getSemiLuxury() {
	  return new SemiLuxurySUV("SemiLuxury SUV");
  }
} // End of class


