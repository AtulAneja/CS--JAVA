public class GCD
{
  public static int greatestCommonDivisor(int a , int b)
  { int gcd = 0;
    for(int i = 1; i <= a && i <=b; i++) {
      if((a%i == 0) && (b%i == 0))
      { gcd = i ;
      }
    }
    return gcd; 
  }public static void main( String [] args) {
  }
}
