import java.util.Scanner;
public class Ten_3 {

    public static void minmaxadd(double d1,double d2)
    {

        if(d1>d2)
            System.out.println(d2+" is min\n"+d1+" is Max");
        else
            System.out.println(d1+" is min\n"+d2+" is Max");
        System.out.println();

        double d3;
        d3=d1+d2;
        System.out.println(d1+"+"+d2+"="+d3);

    }  
    
    public static void minmaxadd(int d1,int d2)
    {

        if(d1>d2)
            System.out.println(d2+" is min\n"+d1+" is Max");
        else
            System.out.println(d1+" is min\n"+d2+" is Max");
        System.out.println();

        int d3;
        d3=d1+d2;
        System.out.println(d1+"+"+d2+"="+d3);

    }   

    public static void minmaxadd(char d1,char d2)
    {

        if(d1>d2)
            System.out.println(d2+" is min\n"+d1+" is Max");
        else
            System.out.println(d1+" is min\n"+d2+" is Max");
        System.out.println();

        int d3;
        d3=d1+d2;
        System.out.println(d1+"+"+d2+"="+d3);

    }  
    
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter two integer:");
        int d1;
        int d2;

        d1=sc.nextInt();
        d2=sc.nextInt();

        minmaxadd(d1,d2);

        
        System.out.println("Enter two doubles:");
        double d3;
        double d4;

        d3=sc.nextDouble();
        d4=sc.nextDouble();

        minmaxadd(d3,d4);

        System.out.println("Enter two Character:");
        char d5;
        char d6;

        d5=sc.next().charAt(0);
        d6=sc.next().charAt(0);

        minmaxadd(d5,d6);

    sc.close();

    }
    
}
