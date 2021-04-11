import java.util.Scanner;

public class Sphere {
    public void areaOfSphere() {
        System.out.print("Enter a valid radius value:");
        Scanner sca = new Scanner(System.in);
        int rad =sca.nextInt();
        double area=4/3*Math.PI*rad*rad;
        System.out.println("The surface area of a sphere of radius "+rad+"cm is "+area+"cm2");
    }

    public static void main(String[] args) {
        Sphere sph =new Sphere();
        sph.areaOfSphere();
    }
}
