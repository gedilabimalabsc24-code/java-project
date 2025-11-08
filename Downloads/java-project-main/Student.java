/**
 * Student class - Extends Person class
 * Demonstrates inheritance concept by adding student-specific attributes
 */
public class Student extends Person {
    private String studentId;
    private double marks;
    
    // Constructor using super() to call parent constructor
    public Student(String name, int age, String studentId, double marks) {
        super(name, age);  // Call parent constructor
        this.studentId = studentId;
        this.marks = marks;
    }
    
    // Getter method for student ID
    public String getStudentId() {
        return studentId;
    }
    
    // Setter method for student ID
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    // Getter method for marks
    public double getMarks() {
        return marks;
    }
    
    // Setter method for marks
    public void setMarks(double marks) {
        this.marks = marks;
    }
    
    // Override toString method to include student-specific information
    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId + ", Marks: " + marks;
    }
}