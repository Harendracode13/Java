// in this file we uderstand polymorphism
// two type of polymorphis is avaiable 
// method overloading
//method overwriting

class Student {
    String name;
    int age;

    //this method overloading 
    //all three method name is same but it's parameter are different
    public void PrintInfo(String name) {
        System.out.println(name);
    }

    public void PrintInfo(int age) {
        System.out.println(age);
    }

    public void PrintInfo(String name, int age) {
        System.out.println(name+"'s age is "+ age);
    }

}
public class OOPS3 {
    public static void main(String[] args) {
        
        Student s1=new Student();
        s1.name="Harendra";
        s1.age=18;
        
        s1.PrintInfo(s1.name);
        s1.PrintInfo(s1.age);
        s1.PrintInfo(s1.name,s1.age);

    }
}