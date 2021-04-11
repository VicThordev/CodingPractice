import java.util.Scanner;

public class Ass {
    public void circle(){
        //Calculate the area of a circle
        System.out.println("Enter a valid radius value: ");
        Scanner sca = new Scanner(System.in);
        double radius=sca.nextDouble();
        double area = Math.PI*radius*radius;
        System.out.println("The area of a circle of radius "+radius+"cm is "+ area+"cm2");
    }

    public static void main(String[] args) {
        Ass ass=new Ass();
        ass.circle();
    }
}
