public class Teacher {
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public String getInfo() {
        return name + " - " + subject + " - Salary: " + salary;
    }
}
