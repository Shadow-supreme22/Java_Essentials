//Done By:- Varinderjot Singh
//Que-1
package Marks;

import java.util.Scanner;
public class Marks{
  
  
    public static void main(String[] args){
    float maths,science,history,eng,physics,per;
    String grade;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Marks of five Subjects: ");
    System.out.println("Enter Maths Marks: ");
    maths=scan.nextFloat();
    System.out.println("Enter Science Marks: ");
    science=scan.nextFloat();
    System.out.println("Enter History Marks: ");
    history=scan.nextFloat();
    System.out.println("Enter English Marks: ");
    eng=scan.nextFloat();
    System.out.println("Enter Physics Marks: ");
    physics=scan.nextFloat();
    per= (maths+science+history+eng+physics)/5;
    if(per >=90){
         grade="A";
     }
     else if(per >=70){
         grade="B";
     }
     else if(per >=50){
         grade="C";
     }
     else if(per >=45){
         grade="D";
     }
     else if(per >=30){
         grade="E";
     }
     else{
         grade="F";
     }
     System.out.println("Percentage is "+per+"%");
     System.out.println("Grade is "+grade);
     
    
   
  }

}
