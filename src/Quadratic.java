import java.util.Scanner;

public class Quadratic {
    public void quad() {
        Scanner sca =new Scanner(System.in);
        System.out.println("Enter the value:");
        System.out.print("Enter 1st value:");
        int a =sca.nextInt();
        System.out.print("Enter the 2nd value:");
        int b=sca.nextInt();
        System.out.print("Enter 3rd value:");
        int c=sca.nextInt();
        double solution=Math.sqrt(b*b-4*a*c);
        double sol=-(b)+Math.sqrt(solution);
        double solCheck=sol/2*a;
        double sol1=-(b)-Math.sqrt(solution);
        double solCheck1=sol1/2*a;
        System.out.println("The quadratic values of "+a+", "+b+", "+c+" are "+solCheck+" and "+solCheck1);

    }

    public static void main(String[] args) {
        Quadratic quad1=new Quadratic();
        quad1.quad();
    }
}
