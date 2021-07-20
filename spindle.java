import java.util.*;
class MyException extends Exception //user exception
{
    MyException()
    {
        super("The entered value is invalid !");
    }
    MyException(String msg)
    {
        super(msg);
    }

}
public class spindle {
    public static void main(String args[]) {
        int n;
        double S1, S2, R; //minspeed,maxspeed and GP ratio resp.
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the minspeed:");
            S1 = in.nextDouble();
            if (S1 <= 0)
                throw new MyException("the given value of minspeed s1 is invalid");
            System.out.println("Enter the maxspeed:");
            S2 = in.nextDouble();
            if (S2 <= 0 || S1>=S2)
                throw new MyException("the given value of minspeed s2 is invalid");
            System.out.println("Enter the number of spindles:");
            n = in.nextInt();
            if (n <= 1)
              throw new MyException("Invalid value of n !");
            R =Math.pow((S2/S1),(double)(1./(n-1)));
            System.out.println("Ratio R:" + R);

        } catch (MyException e) {
            e.printStackTrace();
        }

    }
}





