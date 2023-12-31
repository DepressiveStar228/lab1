public class Employee {
    private int id;
    private static int nextid = 0;
    private String name;
    private String surname;
    double salary;

    public Employee(String name, String surname, double salary) throws CorrectDataException {
        this.id = nextid++;
        if(name.length() > 15) {throw new CorrectDataException("Too much sumbols in name!\n");}
        else {this.name = name;}

        if(surname.length() > 15) {throw new CorrectDataException("Too much sumbols in surname!\n");}
        else {this.surname = surname;}

        if(salary < 0) {throw new CorrectDataException("Salary cannot be negative!\n");}
        else {this.salary = salary;}
    }

    void PrintEmpoyee(){
        System.out.println("ID: " + id + "\nName: " + name + "\nSurname: " + surname + "\nSalary: " + salary + "\n");
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(){
        this.surname = surname;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary = salary;
    }
}