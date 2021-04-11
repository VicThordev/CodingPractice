import java.util.Scanner;

public class Perimeter {
    public void per() {
        //Calculate the perimeter of a circle
        System.out.print("Enter a valid radius value: ");
        Scanner sca =new Scanner(System.in);
        int radius= sca.nextInt();
        double peri = Math.PI*2.0*radius;
        System.out.println("The perimeter of a circle of radius"+radius+"cm is "+peri+"cm");
    }

    public static void main(String[] args) {
        Perimeter me = new Perimeter();
        me.per();
    }
}
