import java.util.Scanner;

public class Sphere2 {
    public void volOfSphere() {
        //Calculate the volume of a sphere
        System.out.print("Enter a valid radius value: ");
        Scanner sca = new Scanner(System.in);
        int rad = sca.nextInt();
        double vol=4*Math.PI*rad*rad*rad;
        System.out.println("The volume of a sphere of radius "+rad+"cm is "+vol+"cm3");
    }

    public static void main(String[] args) {
        Sphere2 sph = new Sphere2();
        sph.volOfSphere();
    }
}
