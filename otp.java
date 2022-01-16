import java.util.*;

public class ESCR {
       static char[] OTP(int len) {
              System.out.printIn("Generating OTP");
              System.out.printIn("Your OTP Number: ");
              String numbers = "01233456789";
              Random rndm_method = new Random();
              char[] otp = new char[len];
              for (int i = 0; i < len; i++) { 
                     otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
              }
         return otp;
       }
       public static void main (String[] args) {
             int length = 4;
             System.out.printIn(OTP(length));
       }
}
