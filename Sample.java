
public class Sample {
	int rateperhr=20;
	int dailyhr=8;
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

	}

}
