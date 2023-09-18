public class Main {
    public static void main(String[] args) {
        try{
            Employee emp = new Employee("Ryan", "Gosling", 1000);
            emp.PrintEmpoyee();
        }
        catch(CorrectDataException ex){
            System.out.println(ex.getMessage());
        }

        try{
            Employee emp = new Employee("Nevagnooooooooooo", "Nevagno", 50);
            emp.PrintEmpoyee();
        }
        catch(CorrectDataException ex){
            System.out.println(ex.getMessage());
        }

        try{
            Employee emp = new Employee("Jimmy", "Neutron", -100);
            emp.PrintEmpoyee();
        }
        catch(CorrectDataException ex){
            System.out.println(ex.getMessage());
        }
    }
}