import model.Person;
import model.Student;

public class Main {
    public static void main(String[] args) {
        // Create and test Person
        Person person = new Person("John", 25);
        System.out.println(person);
        
        // Create and test Student
        Student student = new Student("Alice", 20, "S001", "Computer Science");
        System.out.println(student);
    }
}