/**
 * Person class - Base class for all persons in the system
 * Demonstrates basic class structure and encapsulation
 */
public class Person {
    protected String name;
    protected int age;
    
    // Constructor to initialize person with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter method for name
    public String getName() {
        return name;
    }
    
    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter method for age
    public int getAge() {
        return age;
    }
    
    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }
    
    // Override toString method for better display
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}