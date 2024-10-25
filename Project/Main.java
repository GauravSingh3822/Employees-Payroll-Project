package Project;

public class Main {
    public static void main(String[] args) {
        Payroll payrollSystem=new Payroll();
        Full_Time_Employees  emp1= new Full_Time_Employees("Gaurav",1,700000);
        Part_Time_Employees emp2=new Part_Time_Employees("Rahul",2,5,300);
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        System.out.println("Initial Emoloyee Details: ");
        payrollSystem.DisplayEmployee();
        System.out.println("Removing Employee");
        payrollSystem.removeEmployee(2);
        System.out.println("Remaining Employee Details: ");
        
    }
}
