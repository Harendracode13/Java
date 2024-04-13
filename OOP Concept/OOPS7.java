//interface is  pure abtration

interface animal{
    void walk();
   /*  void eat(){} */  //this type declaretion is not allow in interface
 // in interface don't need to write public befoe the any function but in other class it's requried

}

interface herbivore{

}
// here houre class get property of both and it's posiable through interface
class horse implements animal,herbivore
{

    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

public class OOPS7 {
    public static void main(String[] args) {
        horse h1=new horse();
        h1.walk();
    }
}
