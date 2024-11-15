public class Staff extends Person{
    protected String school;
    protected int salary;

    public Staff(String name, String address, String school, int salary){
        super(name, address);
        this.name = name;
        this.address = address;
        this.school = school;
        this.salary = salary;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public String getSchool(){
        return this.school;
    }
    public int getSalary(){
        return this.salary;
    }

    @Override
    public String toString(){
        return "Hello I am " + name + " I work at " + school + " with salary of " + salary + "."; 
    }
}