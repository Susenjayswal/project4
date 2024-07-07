package Assignment_6;
import java.util.Scanner;
class cal_average
{
	Scanner s=new Scanner(System.in);
	double avg=0;
	int n[]=new int[5];
	void get_input()
	{
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println("Enter number");
				n[i]=s.nextInt();
			}
		}catch(NumberFormatException nu) {
			System.out.println("Non-Integer Value is not acceptable");
			
		}
	}
	void display()
	{
		double sum=0;
		for(int j=0;j<5;j++)
		{
			sum +=n[j];
		}
		avg=sum/5.0;
		System.out.println("Average of given 5 numbers -- "+avg);
	}
}
public class Average {

	public static void main(String[] args) {
		cal_average ca=new cal_average();
		ca.get_input();
		ca.display();
	}
}
