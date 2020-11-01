import java.util.*;
//Que-3 & Que-4

public class combine {

        int a;

    }

    class doctor extends combine
    {
        public void m1(int b, int c)
        {
            a=b+c;
            System.out.println("addition is:"+a);
        }
    }

    class pilot extends combine
    {
        public void m2(int b, int c)
        {
            a=b-c;
            System.out.println("sub is:"+a);
        }
    }
    class engineer extends combine
    {
        public void m3(int b, int c)
        {
            a=b*c;
            System.out.println("mul is:"+a);
        }
        public static void main(String args[]) {
            int b = 20, c = 10;
            engineer demo = new engineer();
            demo.m3(b, c);
        }
    }

