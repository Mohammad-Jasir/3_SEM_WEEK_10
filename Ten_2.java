

class Edible{
   

    static class Vegetable{

     
        static void vdet()
        {
            System.out.println("Static method of vegetable");
        }
        void vpack()
        {
            System.out.println("Non-Static method of vegetable");

        }
    }

    static class Fruit{

        static void fdet()
        {
            System.out.println("Static method of Fruit");
        }
        void fpack()
        {
           System.out.println("Non-Static method of Fruit");
        }

    }
}
public class Ten_2 {

    public static void main(String[] args){
        
        Edible.Fruit.fdet();
        Edible.Vegetable.vdet();

        Edible.Vegetable v1 = new Edible.Vegetable();
        Edible.Fruit f1=new Edible.Fruit();

        v1.vpack();
        f1.fpack();
    }
    
}
