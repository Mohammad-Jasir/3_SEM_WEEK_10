class ObjectOriented{
    void abstraction()
    {
        System.out.println("This is abstraction method of parent class");
    }
    void polymorphism(){
        System.out.println("This is polymorphism method of parent class");
    }
    void inheritence(){
        System.out.println("This is inheritence method of parent class");
    }
}

class JavaLanguage extends ObjectOriented{
    void persistance()
    {
        System.out.println("This is persistence method of java class");
    }
    void interfac()
    {
        System.out.println("This is interface method of java class");
    }   
}


class CPlusPlus extends ObjectOriented {
    public void template() {
        System.out.println("This is template function of c++");
    }
    public void friendFunction() {
        System.out.println("This is Friend function of c++");
    }
}


public class Ten_5{
    public static void main(String[] args) 
    {
        JavaLanguage javobj=new JavaLanguage();

        System.out.println("Calling method of Parent class by java object");
        javobj.abstraction();
        javobj.polymorphism();
        javobj.inheritence();

        System.out.println("Method of java class");
        javobj.persistance();
        javobj.interfac();

        CPlusPlus cobj=new CPlusPlus();

        System.out.println("Calling method of Parent class by c++ object");
        cobj.abstraction();
        cobj.polymorphism();
        cobj.inheritence();

        System.out.println("Method of java class");
        cobj.template();
        cobj.friendFunction();


    }
}

