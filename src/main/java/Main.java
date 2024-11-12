// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Enter an integer to sum the digits of: 1 to 10 ");
    System.out.println(" Sum of all digits is" + sumDigits(1));}
      public static int sumDigits(long n) {
    int sum = 0;
    int temp = (int) Math.abs(n);
    while (temp != 0) {
        sum += temp % 10;
        temp /= 10;
    }
    return sum; // Moved return statement outside of the while loop
}
       }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
