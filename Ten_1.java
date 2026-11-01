

class Person{
    String name;
    String pno;

    class Address{
        String house_no;
        String street;
        String city;
        String state;

        void displayaddr(){
            System.out.println("House No: "+house_no+"\nStreet :"+street+"\nCity :"+city+"\nState :"+state);
        }

        public Address(String house_no, String street, String city, String state) {
            this.house_no = house_no;
            this.street = street;
            this.city = city;
            this.state = state;
        }

        
    }

    class DateofBirth{
        int day;
        int month;
        int year;

        void displayDOB(){
            System.out.println("Date of Birth :"+day+"-"+month+"-"+year);
        }

        public DateofBirth(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        
    }
    
    
    public Person(String name, String pno) {
        this.name = name;
        this.pno = pno;
    }


    void display(Address add,DateofBirth dob){
        System.out.println("Name :"+name+"\nPhone no. :"+pno);
        
        add.displayaddr();
        dob.displayDOB();
    }
}
public class Ten_1 {
    public static void main(String[] args){
     
        Person p1= new Person("Jasir", "7653294658");

        Person.Address add = p1.new Address("10", "9", "Aligarh", "Uttar Pradesh");

        Person.DateofBirth dob =p1.new DateofBirth(12,12 ,12 );

        p1.display(add,dob);

    }
    
}
