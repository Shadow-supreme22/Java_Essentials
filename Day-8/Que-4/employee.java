import java.util.Scanner;
//Question 4:
        //Array of 3 objects for each type of employee
//Done By:- Varinder
public class employee {

        int Id;
        String Name;
        long Salary;

        void GetData()           // Defining GetData()
        {

            Scanner sc = new Scanner(System.in);

            System.out.print("\n\tEnter Employee Id : ");
            Id = Integer.parseInt(sc.nextLine());

            System.out.print("\n\tEnter Employee Name : ");
            Name = sc.nextLine();


            System.out.print("\n\tEnter Employee Salary : ");
            Salary = Integer.parseInt(sc.nextLine());

        }

        void PutData()           // Defining PutData()
        {
            System.out.print("\n\t" + Id + "\t" +Name  + "\t" +Salary);
        }

        public static void main(String args[])
        {

            employee[] Emp = new employee[3];
            int i;

            for(i=0;i<3;i++)
                Emp[i] =  new employee();   // Allocating memory to each object

            for(i=0;i<3;i++)
            {
                System.out.print("\nEnter details of "+ (i+1) +" Employee\n");
                Emp[i].GetData();
            }

            System.out.print("\nDetails of Employees\n");
            for(i=0;i<3;i++)
                Emp[i].PutData();

        }

}
