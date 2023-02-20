package generics.com;
import java.util.Scanner;
public class printmax<P extends Comparable<P>> {
    P x;
    P y;
    P z;

    public printmax(P x, P y, P z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public P max()
    {
        return printmax.max(x, y, z);
    }

    public static <P extends Comparable<P>> P max(P x, P y, P z)
    {
        P max=x;
        if(y.compareTo(max)>0)
        {
            max=y; //if y is Higher
        }
        if(z.compareTo(max)>0)
        {
            max=z; //if z is Higher
        }
        printMax(max); //call to print
        return max;
    }
    public static <P> void printMax( P max)
    {
        System.out.println("Maximun String is "+max);
        System.out.println();
    }
    public static void main(String[] args) {
        /*
         * enter integer value
         */
        Integer xInt, yInt,zInt;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Integer :");
        xInt=sc.nextInt();
        System.out.print("Enter 2nd Integer :");
        yInt=sc.nextInt();
        System.out.print("Enter 3rd Integer :");
        zInt=sc.nextInt();
        new printmax(xInt, yInt,zInt).max();
        /*
         * Enter float value
         */
        Float xFlo, yFlo,zFlo;
        Scanner fl=new Scanner(System.in);
        System.out.print("Enter 1st Float :");
        xFlo=fl.nextFloat();
        System.out.print("Enter 2nd Float :");
        yFlo=fl.nextFloat();
        System.out.print("Enter 3rd Flaot :");
        zFlo=fl.nextFloat();
        new printmax(xFlo, yFlo,zFlo).max();
        /*
         *
         */
        String xSti, ySti,zSti;
        Scanner st=new Scanner(System.in);
        System.out.print("Enter 1st String :");
        xSti=st.nextLine();
        System.out.print("Enter 2nd String :");
        ySti=st.nextLine();
        System.out.print("Enter 3rd Flaot :");
        zSti=st.nextLine();
        new printmax(xSti, ySti,zSti).max();

        /*
         * take value to generics
         */
        System.out.println("Print all Data :: ");
        new printmax(xInt, yInt,zInt).max();
        new printmax(xFlo, yFlo,zFlo).max();
        new printmax(xSti, ySti,zSti).max();

    }
}
