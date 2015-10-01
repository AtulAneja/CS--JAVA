public class Camera {
  boolean hasWiFi;
  boolean isWaterResistant;
  boolean hasGPS;
  String condition;
  double price;
  int userRating;
  
  public Camera(boolean hasWiFi , boolean isWaterResistant , boolean hasGPS , String condition , double price ,int userRating ) 
  { 
    this.hasWiFi = hasWiFi;
    this.isWaterResistant = isWaterResistant;
    this.hasGPS = hasGPS;
    this.condition = condition;
    this.price = price;
    this.userRating = userRating;
  }
  
  
  
  public int ComputeValue() { 
    int value = 0;
    if (hasWiFi == true) { 
      value = value + 1;
    }
    if(isWaterResistant == true) {
      value = value + 1;
    }
    if(hasGPS == true) { 
      value = value + 1;
    }
    if(condition.equals("New")) {
      value = value + 2;
    }
    else if(condition.equals("Refurbished")) {
      value = value + 1;
    }
    else if(condition.equals("Used")) {
      
    }
    return value;
  } 
  
}