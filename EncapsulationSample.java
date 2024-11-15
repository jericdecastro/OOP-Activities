public class EncapsulationSample {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        
        
        student1.setStudentId(1234);
        student1.setName("Jeric De Castro");

        
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Name: " + student1.getName());

        
        Book book1 = new Book();
        
        
        book1.setBookNumber(27);
        book1.setTitle("Kingkong Story");
        book1.setAuthor("Okata");
        book1.setPrice(299.00);

        
        System.out.println("\nBook Details:");
        System.out.println("Book Number: " + book1.getBookNumber());
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: " + book1.getPrice());
    }
}
