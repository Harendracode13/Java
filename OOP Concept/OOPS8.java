class Student{
    String name;
    static String school; //static is use when we don't need to update further

    public void printinfo()
    {
        System.out.println(this.name+" ia study in "+ this.school);
    }
}

public class OOPS8 {
    public static void main(String[] args) {
        Student.school="jvm"; //stactic is access derecly class name
        Student student1=new Student();
        student1.name="aaryan";

        student1.printinfo();

        }
    
}
