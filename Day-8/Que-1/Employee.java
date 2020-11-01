import java.util.Scanner;
//Que1
class employee
{
    float sal;
    String name;
    int age;
    String des;

    public void get_data()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age ");
        int age= sc.nextInt();
        System.out.print("Enter your name ");
        String name= sc.nextLine();
        System.out.print("Enter your salary ");
        float sal= sc.nextFloat();
        System.out.println("Enter your designation")
        String des= sc.nextLine();
    }
    public void display_data()
    {
        System.out.println("age ="+age)
        System.out.println("salary ="+sal)
        System.out.println("name ="+name)
        System.out.println("designation ="+desg)

    }
}
class emp1 extends employee
{
    public void get_data1()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age ");
        int age= sc.nextInt();
        System.out.print("Enter your name ");
        String name= sc.nextLine();
        System.out.print("Enter your salary ");
        float sal= sc.nextFloat();
        System.out.println("Enter your designation")
        String des= sc.nextLine();
    }
    public void display_data1()
    {
        System.out.println("age ="+age)
        System.out.println("salary ="+sal)
        System.out.println("name ="+name)
        System.out.println("designation ="+desg)
    }
    public static void main(String args[]) {
        emp1 demo = new emp1();
        demo.get_data();
        demo.display_data();
        demo.get_data1();
        demo.display_data1();
    }
}