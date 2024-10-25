package Project;

class Part_Time_Employees extends Employees {
    private int hour_work;
    private double hour_rate;
    public Part_Time_Employees(String Name,int Id,int hour_work,double hour_rate){
        super(Name,Id);
        this.hour_work=hour_work;
        this.hour_rate=hour_rate;
    }

    @Override
    public double calculate_salary() {
        return hour_rate*hour_work;
    }
}
