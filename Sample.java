import java.util.Scanner;

public class Sample {
	/*int rateperhr=20;
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
		}*/
		
		//////////////Day6////////////
		
		public static final int IS_PART_TIME=1;
		public static final int IS_FULL_TIME=2;
		public static final int IS_ABSENT=0;
		private int EMPLOYEE_RATE_PER_HR;
		private int NUM_OF_WORKING_DAYS;
		private int MAX_HRS_IN_MONTH;
		private String COMPANY;
		Sample(String Company,int Rate_Per_Hr,int Num_Working_Days,int max_hrs)
		{
			this.COMPANY=Company;
			this.EMPLOYEE_RATE_PER_HR=Rate_Per_Hr;
			this.NUM_OF_WORKING_DAYS=Num_Working_Days;
			this.MAX_HRS_IN_MONTH=max_hrs;
		}
		void calculate()
		{
			int TotalWorkingDays=0,TotalHrs=0;
			while(TotalWorkingDays<=NUM_OF_WORKING_DAYS && TotalHrs<=MAX_HRS_IN_MONTH)
			{
				int check=(int)Math.floor(Math.random()*10)%3;
				switch(check)
				{
				case 0:
					TotalWorkingDays=TotalWorkingDays+0;
					TotalHrs=TotalHrs+0;
					break;
				case 1:
					TotalWorkingDays=(int) (TotalWorkingDays+0.5);
					TotalHrs=TotalHrs+4;
					break;
				case 2:
					TotalWorkingDays=TotalWorkingDays+1;
					TotalHrs=TotalHrs+8;
					break;
				}
			}
			System.out.println("Working days for employee:"+TotalWorkingDays);
			System.out.println("Total wage for emp at "+ COMPANY+" is:"+(TotalHrs*EMPLOYEE_RATE_PER_HR));
		}
		
		
		
		
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to employee wage computation....");
		Sample dmart=new Sample("Dmart",20,30,100);
		Sample kmart=new Sample("kmart",15,20,150);
		/*double attendance=obj.Attendance();
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
		obj.UC();*/
		dmart.calculate();
		kmart.calculate();

	}

}
