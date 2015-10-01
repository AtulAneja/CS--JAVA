import java.util.Scanner;
public class Customer {
 
  public static void main( String[] args)
  {
   
    
    System.out.println("Enter attributes of Camera 1");
    Scanner scan = new Scanner(System.in);
    System.out.println("Is WiFi enabled?");
    boolean hasWiFi = scan.nextBoolean();
    System.out.println("Is the phone Water Resistant?");
    boolean isWaterResistant = scan.nextBoolean();
    System.out.println("Is the phone GPS enabled?");
    boolean hasGPS = scan.nextBoolean();
    System.out.println("What is the condition of phone?");
    String condition = scan.next();
    System.out.println("What is the Price of phone?");
    double price = scan.nextDouble();
    System.out.println("What is the userRating for the phone?");
    int userRating = scan.nextInt();
    
    // isWaterResistant
    Camera camOne = new Camera(hasWiFi, isWaterResistant, hasGPS, condition, price, userRating); 
    //scan for two 
    //scan
    System.out.println("Enter attributes of Camera 2");
    System.out.println("Is WiFi enabled?");
    hasWiFi = scan.nextBoolean();
    System.out.println("Is the phone Water Resistant?");
    isWaterResistant = scan.nextBoolean();
    System.out.println("Is the phone GPS enabled?");
    hasGPS = scan.nextBoolean();
     System.out.println("What is the condition of phone?");
    condition = scan.next();
    System.out.println("What is the Price of phone?");
    price = scan.nextDouble();
    System.out.println("What is the userRating for the phone?");
    userRating = scan.nextInt();
    Camera camTwo = new Camera(hasWiFi, isWaterResistant, hasGPS, condition, price, userRating); 
    Customer c = new Customer();
    c.compare(camOne, camTwo);
  }
  public int compare(Camera camOne, Camera camTwo)
  {
    int value1 = camOne.ComputeValue();
    int value2 = camTwo.ComputeValue();
    
    if( value1 ==value2 && camOne.userRating == camTwo.userRating && (Math.abs(camOne.price - camTwo.price)<0.01))
    {
      return 0;
    }
    if( value1 > value2 && camOne.userRating == camTwo.userRating && (Math.abs(camOne.price - camTwo.price)<0.01))
    {return 1;
      }
    if( value1 < value2 && camOne.userRating == camTwo.userRating && (Math.abs(camOne.price - camTwo.price)<0.01))
    {return 2;
      }
    if(value1 ==value2 && camOne.userRating > camTwo.userRating && (Math.abs(camOne.price - camTwo.price)<0.01))
    {
      return 1;
    }
    if(value1 ==value2 && camOne.userRating < camTwo.userRating && (Math.abs(camOne.price - camTwo.price)<0.01))
    {
      return 2;
    }
    if(value1 ==value2 && camOne.userRating == camTwo.userRating && camOne.price > camTwo.price )
    {return 2;
      
      }
    if(value1 ==value2 && camOne.userRating == camTwo.userRating && camOne.price < camTwo.price )
    {return 1;
      
      }
    
    if ( (camOne.price/value1) > (camTwo.price/value2) )
    {
      return 1;
    }
    if ( ( camOne.price/value1) > (camTwo.price/value2) ) {
      return 2;
    }
      else {
        return 0;
    }
  }
}
  







