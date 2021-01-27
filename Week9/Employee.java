package Week9;
public class Employee{
private int Id;
    private String firstName;
    private String lastName;
    private int Salary;

    public Employee(int id, String fName, String lName, int salary) {
        Id = id;
        firstName = fName;
        lastName = lName;
        Salary = salary;
    }

    public int getId() {
        return Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return Salary;
    }

    public int getAnnualSalary() {
        return Salary * 12 + raiseSalary();
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String toString() {
        return "Name : " + getName() + " Id : " + getId() + " Salary : " + getSalary() + " Annual Salary : "
                + getAnnualSalary();
    }

    public int raiseSalary() {
        return Salary * 5 / 100;
    }
}

class run {
    public static void main(String[] args) {
        Employee Emp = new Employee(12345, "nguyen", "cao hiep", 3000000);
        System.out.println(Emp.toString());

    }
}