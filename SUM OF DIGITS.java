/*Given an integer, print the sum of its digits.
Input:
Integer, n.
10000<=n<=99999
Output:
Sum of digits of the given integer n.
Example:
Input: 35243
Output: 17*/
import java.util.*;

class Main
{
    public static void main(String s[])
    {
        int n,r,tot=0;
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
        while(n>0)
        {
            r=n%10;
            tot+=r;
            n=n/10;
        }
        System.out.println(tot);
        
    }
}