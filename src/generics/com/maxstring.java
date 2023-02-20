package generics.com;
import java.util.Scanner;
public class maxstring  <P extends Comparable<P>> {
    P x;
    P y;
    P z;

    public maxstring(P x, P y, P z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public P max() {
        return maxintrger.max(x, y, z);
    }

    public static <P extends Comparable<P>> P max(P x, P y, P z) {
        P max = x;
        if (y.compareTo(max) > 0) {
            max = y; //if y is Higher
        }
        if (z.compareTo(max) > 0) {
            max = z; //if z is Higher
        }
        printMax(max); //call to print
        return max;
    }

    public static <P> void printMax(P max) {
        System.out.println("Maximun String is " + max);
    }

    public static void main(String[] args) {
        String xSti, ySti, zSti;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String :");
        xSti = sc.nextLine();
        System.out.print("Enter 2nd String :");
        ySti = sc.nextLine();
        System.out.print("Enter 3rd Flaot :");
        zSti = sc.nextLine();

        /*
         * take value to generics
         */
        new maxintrger(xSti, ySti, zSti).max();
    }
}
