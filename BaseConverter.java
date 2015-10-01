import java.util.Scanner;

public class BaseConverter {
  public int converter(int x) {
    if(x == 0) {
      return 0;
    }
    
    String ternary = "";
    while( x!= 0) {
      int remainder = x%3;
      ternary = remainder + ternary;
      x = x/3;
    }
    return Integer.parseInt(ternary);
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number with base 10:");
    int decimal = scan.nextInt();
    BaseConverter baseConverter = new BaseConverter();
    int ternary = baseConverter.converter(decimal);
    System.out.println("The ternary representation is" + ternary);
  }
}