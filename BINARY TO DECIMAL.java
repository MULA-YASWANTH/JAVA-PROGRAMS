/*Write a Java Program to convert the given binary number into decimal.
Sample Input:
1010
Output:
10*/
import java.util.Scanner;
class BTD {
	static int binaryToDecimal(int n)
	{
		int num = n;
		int dec_value = 0;
		// Initializing base
		// value to 1, i.e 2^0
		int base = 1;
		int temp = num;
		while (temp > 0) {
			int last_digit = temp % 10;
			temp = temp / 10;
			dec_value += last_digit * base;
			base = base * 2;
		}
		return dec_value;
	}
	// Driver Code
	public static void main(String[] args)
	{
		int num;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		System.out.println(binaryToDecimal(num));
	}
}