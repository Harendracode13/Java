
class pen{
    String color;
    String type;

    // this is method or function
    public void write()
    {
     System.out.println("writing somethins");
    }
    public void printInfo()
    {
        System.out.println(this.color+" "+ this.type);// this use for know which object call it and access value
      
    }
}

class Student{
    String name;
    int age;

    public void PrintInfo(){
        System.out.println(this.name+"'s age is "+this.age);
    }


}

public class OOPS {
    public static void main(String argu[]){
        pen pen1=new pen();  // here we make object of pen class and its name is pen1
        pen1.color="red";    ///accesing the property of Pen class through object by using dot //object=pen1  // property =color
         pen1.type="gelpen";

         pen1.write();   //call the method

         pen pen2=new pen(); // when we write new keyword at that time object is stored in heap memory 
         pen2.color="black";
         pen2.type="ballpen";

         pen1.printInfo();
         pen2.printInfo();


         Student s1=new Student();
         s1.name="Harendra";
         s1.age=18;

         s1.PrintInfo();
    }
    
}
