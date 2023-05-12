package practice;
import java.util.Scanner;

public class PaasswordChecking {

	public static void main(String[] args) {
		System.out.println("enter your old password");
		Scanner  sc = new Scanner(System.in);
		String oldPassword = sc.next();
		System.out.println("enter your new password");
		String newPassword = sc.next();
		sc.close();
	
		passwordCheck(oldPassword,newPassword);	
	}
		public static void passwordCheck(String oldPass, String newPass)
		{
		for(int i = 0; i<=oldPass.length()-3 ;i++)
		{
			String condition =oldPass.substring(i,i+3);
			
			if(newPass.contains(condition))
			{
				System.out.println("pw not accepted");
				return;
			}
		}
		System.out.println("pw  accepted");	
		
	}

}
