package practies;

import java.util.Scanner;
public class Basic_function {
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String name=sc.next();
    System.out.println(name);

    //get to number and sum 
    System.out.println("Enter a for sum");
    int a=sc.nextInt();
    System.out.println("Enter b for sum");
    int b=sc.nextInt();

    int sum=a+b;
    System.out.println("sum is : "+ sum);
    }
}
