// this file write code for expaling the constructor
// constructor name is as same of class name 
//it is not return any value
//it only use for createing the object
//in java descontuter is don't requrited to write it beacute in java garbej collecter is aviable
//three type of constructor is availble in oop

class Student {
    String name;
    int age;

    public void PrintInfo() {
        System.out.println(this.name + "'s age is " + this.age);
    }

    // this is non prametric constructor if we don't write constructor java
    // automaticaly write constructor

     
     Student(){
     System.out.println("constructor is created");
     }
     

    // this is prametric constructor where we can pass paramenter as an argument
    Student(String name, int age) {
        this.name = name;// here name1 is parameter value
        this.age = age; // here age1 is parameter value
    }

    //copy constructor 
    Student(Student s3) {
        this.name = s3.name;// here name1 is parameter value
        this.age = s3.age; // here age1 is parameter value
    }

}

public class OOPS2 {
    public static void main(String argu[]) {

          Student s1=new Student();
          s1.name="Harendra";
          s1.age=18;
          
          s1.PrintInfo();

        // prematric contucter
        Student s2 = new Student("Manish", 19);
        s2.PrintInfo();

        Student s3=new Student(s1);

        s3.PrintInfo();
    }
}
