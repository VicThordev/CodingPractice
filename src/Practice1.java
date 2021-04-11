import java.util.Scanner;

public class Practice1 {
    public void bNum() {
        Scanner sca = new Scanner(System.in);
        int b1=sca.nextInt();
        int b2=sca.nextInt();
        int b3=b1+b2;
        int b4=b3%10;
        if(!(b1==0&&b2==0)) {
            System.out.println(b1+" and "+b2+" are not binary numbers.");
        }
        else System.out.println("The addition of "+b1+" and "+b2+" is "+b4);
    }

    public static void main(String[] args) {
        Practice1 p1=new Practice1();
        p1.bNum();
    }
}
