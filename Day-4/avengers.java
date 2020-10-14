//Done By Varinderjot 
//Que-1
package avengers;
import java.util.Scanner;
public class avengers {
	  String name,weapon,planet;
	  int age,power;
	  public void displayDetails(){
	     System.out.println("The name is "+ name);
	     System.out.println("The age is "+ age);
	     System.out.println("Weapon is "+ weapon);
	     System.out.println("The Power Levels are "+ power);
	     System.out.println("The Planet is "+ planet);
	     
	     
	  }
	  public  void getDetails(){
		  Scanner scan=new Scanner(System.in);
          
          System.out.print("Enter Name: ");
          name=scan.nextLine();
          System.out.print("Enter Age: ");
          age=scan.nextInt();
          System.out.print("Enter Power levels: ");
          power=scan.nextInt();
          System.out.print("Enter Planet: ");
          planet=scan.next();
          System.out.print("Enter Weapon: ");
          weapon=scan.next();
     
          
		  }
	  public static void main(String[] args){
		avengers d = new avengers();
	    d.getDetails();
	    d.displayDetails();
	   
	   
	  }


}
