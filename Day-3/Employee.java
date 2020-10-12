//Done By:-Varinderjot Singh
package Employee;
// Que-2
import java.util.Scanner;
public class Employee {

  public static void main(String[] args){
  int dob,by,salaryM,taxi=0;
  String name,mobi;
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter Details: ");
  System.out.println("Enter Name: ");
  name=scan.nextLine();
  System.out.println("Enter Date of Birth: ");
  dob=scan.nextInt();
  System.out.println("Enter Month of Birth: ");
  mobi=scan.next();
  System.out.println("Enter Birth Year: ");
  by=scan.nextInt();
  System.out.println("Enter Monthly salary: ");
  salaryM=scan.nextInt();
  
  int anulS= salaryM*12;
  if(anulS >= 500000) {
	  taxi = (anulS*20)/100;
  }
  else if(anulS>= 400000) {
	  taxi= (anulS*15)/100;
  }
  else if(anulS>= 300000) {
	  taxi= (anulS*10)/100;
  }
  else if(anulS>= 200000) {
	  taxi= (anulS*5)/100;
  }
  else {
	  System.out.println("No Tax");
  }
   int age=2020-by;
   System.out.println("Name: "+ name);
   System.out.println("Age: "+ age);
   System.out.println("Annual Salary: "+ anulS);
   System.out.println("Tax Amount: "+ taxi);
  
   
  
 
}

}
