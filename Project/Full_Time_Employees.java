package Project;

class Full_Time_Employees extends Employees {
    private double montly_salary;
    public Full_Time_Employees(String name,int Id,double montly_salary){
        super(name,Id);
        this.montly_salary=montly_salary;
    }

    @Override
    public double calculate_salary() {
        return montly_salary;
    }
}
