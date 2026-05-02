public class GradStudent extends Student {
    private String researchLab;

   
    public GradStudent(String name, double gpa, String researchLab) {
        super(name, gpa); // call parent constructor
        this.researchLab = researchLab;
    }

    // Override method
    @Override
    public String getStatus() {
        String baseStatus = super.getStatus();
        return baseStatus + " They research in the " + researchLab + " lab.";
    }
}
