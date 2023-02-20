package generics.com;
import java.util.Scanner;
public class maxintrger<P extends Comparable<P>> {
        P x;
        P y;
        P z;

        public maxintrger(P x, P y, P z) {
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
            System.out.println("Maximun Integer is " + max);
        }

        public static void main(String[] args) {
            Integer xInt, yInt, zInt;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1st Integer :");
            xInt = sc.nextInt();
            System.out.print("Enter 2nd Integer :");
            yInt = sc.nextInt();
            System.out.print("Enter 3rd Integer :");
            zInt = sc.nextInt();

            /*
             * take value to generics
             */
            new maxintrger(xInt, yInt, zInt).max();

        }
    }