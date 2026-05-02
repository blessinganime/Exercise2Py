public class Main {
    public static void main(String[] args) {
        System.out.println("--- Exercise 1 & 2: Classes and Inheritance ---");

        Student student1 = new Student("John Doe", 2.8);
        GradStudent student2 = new GradStudent("Jane Smith", 4.0, "Cybersecurity");

        System.out.println(student1.getStatus());
        System.out.println(student2.getStatus());

        exercise3Polymorphism();
    }

    
    public static void exercise3Polymorphism() {
        System.out.println("\n--- Exercise 3: Polymorphism ---");

        Student undergrad = new Student("Alice", 3.5);
        GradStudent grad = new GradStudent("Bob", 3.9, "AI Data");
        Robot bot = new Robot();

        
        Object[] entities = {undergrad, grad, bot};

        for (Object entity : entities) {
            
            if (entity instanceof Student) {
                System.out.println(((Student) entity).getStatus());
            } else if (entity instanceof Robot) {
                System.out.println(((Robot) entity).getStatus());
            }
        }
    }
}
