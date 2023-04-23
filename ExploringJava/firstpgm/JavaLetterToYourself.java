package firstpgm;
class Address
{
	String name;
	int  doorNo;
	String streetName;
	String cityName;
	String stateName;
	int zipCode;
	Address (String name,int doorNo,String streetName,String cityName,String stateName,int zipCode)
	{
		this.name=name;
		this.doorNo=doorNo;
		this.streetName=streetName;
		this.cityName=cityName;
		this.stateName=stateName;
		this.zipCode=zipCode;
		
	}
	
	/*public void display(Address obj)//method to display only address
	{
		System.out.println(obj.name);
		System.out.println(obj.doorNo +","+obj.streetName);
		System.out.println(obj.cityName);
		System.out.println(obj.stateName+"-"+obj.zipCode);
	}*/
	
}


public class JavaLetterToYourself 
{

	public static void main(String[] args) 
	{
		Address user = new Address("Swapna Thirumal",202,"Park street","Jersey city","LA",12234);
		// user.display(user);
		 
		for(int i=1;i<=20;i++)//length of the box
		{
			for(int j=1;j<=70;j++)//width of the box
			{
				if(i==1||i==20)
					System.out.print("-");//horizontal line
				
				else if (j==1||j==70) 
					System.out.print("|");//vertical line
				
				else if ((i==3&&j>65)||(i==4&&j>65)||(i==5&&j>65))//from address part
					System.out.print("#");
				
				else  if(i==15&&j==45)
					System.out.print(user.name);//print name of the address in the specified place
				
				else if(i==15&&j>45&&j<(45+user.name.length()))//print null to save the spot from pushing line
					System.out.print("");
				
				else  if(i==16&&j==45)
					System.out.print(user.doorNo +","+user.streetName);//print door no & street name in the next line
				
				else if(i==16&&j>45&&j<(45+(user.doorNo +","+user.streetName).length()))//print null to spots where second line occupies
					System.out.print("");
					
				else  if(i==17&&j==45)
					System.out.print(user.cityName);//print third line
				
				else if (i==17&&j>45&&j<(45+user.cityName.length()))//print null in the specified spot
					System.out.print("");
				
				else if(i==18&&j==45)
					System.out.print(user.stateName+"-"+user.zipCode);//print fourth line
				
				else if(i==18&&j>45&&j<(45+(user.stateName+"-"+user.zipCode).length()))//print null in the specified spot
					System.out.print("");
				
				else	
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
