package Week10;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    Employee(int id,String firstName,String lastName,int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getFullName(){
        return this.firstName + this.lastName;
    }
    
}
