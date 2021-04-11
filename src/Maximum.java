import java.util.ArrayList;
import java.util.Scanner;

public class Maximum {
  public void mon() {
      System.out.print("Enter a valid num:");
      Scanner sca = new Scanner(System.in);
      int fac= sca.nextInt();
      int i=1;
      long check=1;
      for (i=1;i<=fac;i++) {
          check=check*i;
      }
      System.out.println("The factorial of "+fac+" is "+check);
  }


    public static void main(String[] args) {
      Maximum max=new Maximum();
      max.mon();
    }
}
