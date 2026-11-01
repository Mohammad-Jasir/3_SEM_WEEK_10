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
        System.out.println("This is persistence method of child class");
    }
    void interfac()
    {
        System.out.println("This is interface method of child class");
    }   
}
public class Ten_4 {
    public static void main(String[] args){
        JavaLanguage javobj=new JavaLanguage();

        System.out.println("Method of Parent class");
        javobj.abstraction();
        javobj.polymorphism();
        javobj.inheritence();

        System.out.println("Method of child class");
        javobj.persistance();
        javobj.interfac();
    }
    
}
