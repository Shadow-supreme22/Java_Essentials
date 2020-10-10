public class Employee{
  String name,city;
  int age;
  public void display(){
     System.out.println("The name is "+ name);
     System.out.println("The city is "+ city);
     System.out.println("The age is "+ age);
  }
  public static void main(String[] args){
    Employee e1=new Employee();
    Employee e2=new Employee();
    System.out.println("Employee 1");
    e1.name="Shadow";
    e1.city="Nowhere";
    e1.age=1500;
    e2.name="Shado";
    e2.city="Nowher";
    e2.age=150;
    e1.display();
    System.out.println("Employee 2");
    e2.display();
   
  }

}