import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program started at: " + LocalDateTime.now());
        try {
            // Create students with ages 18-21
            Student s1 = new Student("John Doe", 18, "STU001", 75);
            Student s2 = new Student("Jane Smith", 19, "STU002", 45);
            Student s3 = new Student("Mike Johnson", 20, "STU003", 85);
            Student s4 = new Student("Sarah Wilson", 21, "STU004", 35);
            
            // Validate student IDs
            DataValidator.isValidStudentId(s1.getStudentId());
            DataValidator.isValidStudentId(s2.getStudentId());
            DataValidator.isValidStudentId(s3.getStudentId());
            DataValidator.isValidStudentId(s4.getStudentId());
            
            // Save students to file
            StudentData.saveStudent(s1);
            StudentData.saveStudent(s2);
            StudentData.saveStudent(s3);
            StudentData.saveStudent(s4);
            
            // Display students
            System.out.println("Students:");
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            
            // Create teacher
            Teacher t1 = new Teacher("Dr. Smith", 35, "Mathematics");
            System.out.println("\nTeacher:");
            System.out.println(t1);
            
        } catch (CustomException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("Program ended at: " + LocalDateTime.now());
    }
}
