package firstpgm;
import java.util.Scanner;

public class UserPgm4 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter first name");
		String fname = s.next();
		System.out.println("enter last name");
		String lname = s.next();
		System.out.println("enter your grade");
		int grade = s.nextInt();
		System.out.println("enter your student id");
		int sid = s.nextInt();
		System.out.println("enter your login name");
		String logName = s.next();
		System.out.println("enter your GPA");
		double gpa = s.nextDouble();
		System.out.println("Name:"+fname+" "+lname);
		System.out.println("grade:"+grade+"; "+"Student id:"+sid);
		System.out.println("login name:"+logName);
		System.out.println("GPA :"+gpa);
	}

}
