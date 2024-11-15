public class InheritanceSample {
    public static void main(String[] args) {
        // Creating an instance of Student
        Student student = new Student("Jeric De Castro", "Barangay Dita", "BSIT", 2);
        
        // Printing Student details
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Program: " + student.getProgram());
        System.out.println("Year: " + student.getYear());

        
        Staff staff = new Staff("Kate", "243 Manila", "Computer Sciences", 50000.0);

        
        System.out.println("\nStaff Details:");
        System.out.println("Name: " + staff.getName());
        System.out.println("Address: " + staff.getAddress());
        System.out.println("School: " + staff.getSchool());
        System.out.println("Salary: " + staff.getSalary());
    }
}