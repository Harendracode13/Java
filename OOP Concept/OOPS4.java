//in this file write code for explaing inheritance


class Shape{
    String color;
    int l;
    int h;
    
    public void area()
    {
        System.out.println("dispalay area");
    }

}
//here shape class inherit into the triangle  
//here this is single level inheritance
class Triangle extends Shape{
   public void area(int l,int h)
   {
    System.out.print("area of trinagle is ");
    System.out.println((1.0/2)*l*h);

   }
}

//this is multilevel inheritance
class EquilateralTriangle extends Triangle{

    public void area(int l,int h)
    {
        System.out.println(1/2*l*h);
    }
}

//thistype of inheritance is know as hierachial inheritance
class circlr extends Shape{
    public void area(int r)
    {
        System.out.println((3.14)*r*r);
    }
}

public class OOPS4 {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.l=3;
        t1.h=4;

        t1.area(t1.l,t1.h);

    }
}
