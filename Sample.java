import java.util.Scanner;

public class Sample {
	int rateperhr=20;
	int dailyhr=8;
	Scanner sc=new Scanner(System.in);
	double Attendance()
	{
		double temp=Math.floor(Math.random()*10)%2;
		return temp;
	}
	void DailyWage()
	{
		System.out.println("Daily wage for employee:"+(rateperhr*dailyhr));
	}
	void Part_time()
	{
		System.out.println("part time employee wage:"+(rateperhr*8));
	}
	void UC()
	{
		int days=0;
		int hrs=0;
		System.out.println("1:calculate wage for month    2:Calculate wage(hr or days)");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("wage for month:"+(160*20));
			break;
		
		case 2:
			for(int i=1;i<=30;i++)
			{
				if(hrs==100 || days==20)
				{
					break;
				}
				else
				{
					double temp=Attendance();
					if(temp==1)
					{
						System.out.println("employee present");
						days++;
						hrs=hrs+8;
					}
					else
						System.out.println("employee absent");
				}
			}
			System.out.println("working days in month:"+days);
			System.out.println("working hrs in month:"+hrs);
			System.out.println("wage(days)"+(days*160));
			System.out.println("wage(hrs)"+(hrs*20));
			break;
		default :
			System.out.println("wrong input...");
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to employee wage computation....");
		Sample obj=new Sample();
		double attendance=obj.Attendance();
		if(attendance==0)
		{
			System.out.println("Employee absent...");
		}
		else
		{
			System.out.println("employee present...");
		}
		obj.DailyWage();
		obj.Part_time();
		obj.UC();

	}

}
