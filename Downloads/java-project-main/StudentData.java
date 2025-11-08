import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * StudentData class - Handles file I/O operations for student data
 * Demonstrates file handling and exception management
 */
public class StudentData {
    private static final String FILE_NAME = "students.txt";  // File to store student data
    
    /**
     * Saves a student object to file
     * @param student - Student object to save
     * @throws CustomException if file operation fails
     */
    public static void saveStudent(Student student) throws CustomException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME, true))) {
            // Write student data in CSV format
            writer.println(student.getName() + "," + student.getAge() + "," + 
                          student.getStudentId() + "," + student.getMarks());
        } catch (IOException e) {
            // Throw custom exception if file operation fails
            throw new CustomException("Error saving student data: " + e.getMessage());
        }
    }
    
    /**
     * Loads all students from file
     * @return List of Student objects
     * @throws CustomException if file operation fails
     */
    public static List<Student> loadStudents() throws CustomException {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            // Read each line from file
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");  // Split CSV data
                if (parts.length == 4) {
                    // Create Student object from file data
                    students.add(new Student(parts[0], Integer.parseInt(parts[1]), 
                                           parts[2], Double.parseDouble(parts[3])));
                }
            }
        } catch (IOException e) {
            // Throw custom exception if file operation fails
            throw new CustomException("Error loading student data: " + e.getMessage());
        }
        return students;
    }
}