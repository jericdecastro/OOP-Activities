public class Main {
    public static void main(String[] args) {
        
        Student student = new Student("Jeric", "Batangas PH", "2nd", "BSIT");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Address: " + student.getAddress());
        System.out.println("Student Program:" + student.getProgram());
        System.out.println("Student Year: " + student.getYear());
        System.out.println(student.toString());

        System.out.println("");
        
        Staff staff = new Staff("Senbo", "Ncasto", "Bsu Balayan", 20000);
        System.out.println("Staff Name: " + staff.getName());
        System.out.println("Staff Address: " + staff.getAddress());
        System.out.println("Staff School: " + staff.getSchool());  
        System.out.println("Staff Salary: " + staff.getSalary());
        System.out.println(staff.toString());      
    }

}
