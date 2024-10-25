package Project;
import java.util.*;
class Payroll {
    protected List<Employees>employeesList;
    public Payroll(){
        employeesList=new ArrayList<>();
    }
    public void addEmployee(Employees employees){
        employeesList.add(employees);
    }
    public void removeEmployee(int Id){
        Employees removeEmployee=null;
        for(Employees employee:employeesList){
            if(employee.getId()==Id){
                removeEmployee=employee;
                break;
            }
        }
        if(removeEmployee!=null){
            employeesList.remove(removeEmployee);
        }
    }
    public void DisplayEmployee(){
        for(Employees employee:employeesList){
            System.out.println(employee);
        }
    }

}
