package Lab_Book4;

import java.util.Scanner;

public class Exercise1 {
public static void main(String[] args) {
	System.out.println("Enter the number:-");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println("The sum of cubes of number is="+setSumCube(num));
	sc.close();
}
public static int setSumCube(int num) {
	int sum = 0;
	while(true)
	{
		if((num%10)!=0)
		{
			int a = num%10;
			sum = (int) (sum + Math.pow(a, 3)); 
			num = num/10;
		}
		if(num == 0)
		{
			break;
		}
	}
	
	return sum;
}
}
