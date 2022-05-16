import java.util.Scanner;

public class function {

    Scanner sc=new Scanner(System.in);
    int x,y,temp;


    public static void main(String args[])

    {
        function obj=new function();
        obj.swapping();
        obj.swap2();



    }
    public void swapping()
    {

        System.out.println("enter two numbers:");
        x=sc.nextInt();
        y= sc.nextInt();

        System.out.println("before swapping:");
        System.out.println(x);
        System.out.println(y);

        temp=x;
        x=y;
        y=temp;

        System.out.println("after swapping:");
        System.out.println(x);
        System.out.println(y);


    }
    public void swap2()
    {
        System.out.println("enter two no:");
        x=sc.nextInt();
        y= sc.nextInt();
        System.out.println("Before swap:");
        System.out.println(x);
        System.out.println(y);

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("after swap:");
        System.out.println(x);
        System.out.println(y);

    }
}
