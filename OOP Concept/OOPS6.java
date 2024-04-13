
//abstract is decalare when it don't need to chage after that
// we don't write of object of abstract class

abstract class animal{
    abstract void walk();//don't requried to write whole function
    animal(){
        System.out.println("new animal is created");
    }
}

class horse extends animal{
    horse()
    {
        System.out.println("Horse created");
    }
    public void walk()
    {
        System.out.println("houre walk on 4 leg");
    }
}
class parror extends animal{
    parror()
    {
        System.out.println("parror is created");
    }
    public void walk()
    {
        System.out.println("parror walk on 2 leg");
    }
}

public class OOPS6 {
    public static void main(String[] args) {
        horse h1=new horse();
        h1.walk();
    }
}
