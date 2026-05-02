public class Student {
    protected String name;
    protected double gpa;
    protected boolean isActive;

    // Constructor
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
        this.isActive = true;
    }

    // Method
    public String getStatus() {
        String status = isActive ? "Active" : "Inactive";
        return name + " is currently " + status + " with a " + gpa + " GPA.";
    }
}
