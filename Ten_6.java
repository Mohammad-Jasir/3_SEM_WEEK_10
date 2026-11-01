
class University {
    String uniName;
    int ranking;

    public University(String uniName, int ranking) {
        this.uniName = uniName;
        this.ranking = ranking;
    }
    public void Details()
    {
        System.out.println("Universiy name: "+uniName+"\nRanking :"+ranking);
    }
}


class Faculty extends University {
    String facultyName;

    public Faculty(String uniName, int ranking, String facultyName) {
        super(uniName, ranking); 
        this.facultyName = facultyName;
    }

    public void Details() {
        super.Details();
        System.out.println("Faculty name :"+facultyName);
    }
}


class Department extends Faculty {
    String deptName;
    String chairman;

    public Department(String uniName, int ranking, String facultyName, String deptName, String chairman) {
        super(uniName, ranking, facultyName); 
        this.deptName = deptName;
        this.chairman = chairman;
    }

   
    public void Details() {
        System.out.println("Department Name: " + deptName + ",\nChairman: " + chairman);
    }

    public void Display() {
        super.Details(); 
        this.Details();  
    }
}

public class Ten_6{
    public static void main(String[] args) {
        
        Department csDept = new Department("AMU",5,"Science","Computer Science","Dr. Arman Rasool Faridi" );

        csDept.Display();

        
    }
}

