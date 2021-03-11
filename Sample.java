
public class Sample {
	double Attendance()
	{
		double temp=Math.floor(Math.random()*10)%2;
		return temp;
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

	}

}
