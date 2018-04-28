package student;

public class StudentDatabase 
{

	public static void main(String [] args)
	{
		Student ob1 = new Student("ankita","234833333");
		ob1.UserIDgen();
		ob1.SetPhone("7076993735");
		System.out.println("phone number : " + ob1.GetPhone());
		ob1.SetCity("Hyderabad");
		System.out.println("City : " + ob1.GetCity());
		ob1.SetState("Telengana");
		System.out.println("state : " + ob1.GetState());
		ob1.enroll("maths");
		ob1.enroll("data sturctures");
		ob1.enroll("digital image processing");
		ob1.ShowCourses();
		ob1.CheckBalanace();
		ob1.pay(400);
		System.out.println(ob1.toString());
		
		/*Student ob2 = new Student("ananya","24891111");
		ob2.UserIDgen();
		ob2.SetPhone("907893735");
		System.out.println("phone number : " + ob2.GetPhone());
		ob2.SetCity("vijayawada");
		System.out.println("City : " + ob2.GetCity());
		ob2.SetState("Telengana");
		System.out.println("state : " + ob2.GetState());
		*/
    }
}
class Student
{
	String name;
	String SSN;
	private static int ID = 1001;;
	String EmailID;
	String UserID;
	private String phone;
	private String city;
	private String state;
	public String courses="";
	public static final int costofcourse = 1000;
	private int balance=0;
	
	
	public Student(String name,String SSN)
	{
		this.name = name;
		this.SSN = SSN;
		EmailID = name+ "." + ID+"@gmail.com";
		System.out.println("your email id is : " + EmailID);
		System.out.println("your ID is : " + ID);
		
	}
	public void UserIDgen()
	{
		int max = 9000;
		int min = 1000;
		int rand = (int)(Math.random() * (max - min));
		rand =rand +min;
		UserID = ID + " " + rand + " " + SSN.substring(SSN.length() - 4, SSN.length());
		System.out.println("the user id is : " + UserID);
		System.out.println("the  id is : " + ID);
		ID++;
	}
	
	public void SetPhone(String phone)
	{
		this.phone = phone;
	}
	public String GetPhone()
	{
		return this.phone;
	}
	
	public void SetCity(String city)
	{
		this.city=city;
	}
	public String GetCity()
	{
		return this.city;
	}
	
	public void SetState(String state)
	{
		this.state=state;
	}
	public String GetState()
	{
		return this.state;
	}
	
	public void enroll(String course)
	{
		this.courses = this.courses + "\n" + course;
		System.out.println("courses " + this.courses);
		balance = balance + costofcourse;
	}
	public void CheckBalanace()
	{
		System.out.println("balance : " + balance);
	}
	public void ShowCourses ()
	{
		System.out.println("courses : " + courses);
	}
	public void pay(int amt)
	{
		balance = balance - amt;
		System.out.println("amount paid as down payment " + amt);
	}
	
	public String toString()
	{
		return "[NAME : " + name + "]\n[COURSES: " + courses + "] \n BALANCE : " + balance + "]";
	}
	
	
	
	
}
