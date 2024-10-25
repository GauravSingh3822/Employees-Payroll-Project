package Project;

abstract class Employees {
    private String name;
    private int Id;
    public Employees(String name,int Id){
        this.Id=Id;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return Id;
    }
    public abstract double calculate_salary();

    public String toString(){
        return "Employee [name="+name+",id="+Id+", salary="+calculate_salary()+"]";

    }

}
