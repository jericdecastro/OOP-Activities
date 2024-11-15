public class Student extends Person {
    protected String year;
    protected String program;

    public Student(String name, String address, String year, String program){
        super(name, address);
        this.address = address;
        this.year = year;
        this.program = program;
    }
    public void setYear(String year){
        this.year = year;
    }
    public void setProgram(String program){
        this.program = program;
    }
    public String getYear(){
        return this.year;
    }
    public String getProgram(){
        return this.program;
    }

    @Override
    public String toString(){
        return "Hello I am " + name + " I lived in " + address + ". I am " + year + " year of " + program + ".";
    }
}