import java.util.Scanner;

public class Practice2 {
    double real, img;
    //This is a constructor
    public Practice2(double r, double i) {
        this.real=r;
        this.img=i;
    }

    public static Practice2 sum(Practice2 p1, Practice2 p2) {
        Practice2 check = new Practice2(0,0);
        check.real=p1.real;
        check.img= p2.img;
        return check;
    }
}
